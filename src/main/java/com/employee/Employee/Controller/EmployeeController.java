package com.employee.Employee.Controller;

import com.employee.Employee.Repository.EmployeRepository;
import com.employee.Employee.employeRequest.EmployeRequest;
import com.employee.Employee.model.Employe;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    private final EmployeRepository repo;

    public EmployeeController(EmployeRepository repo) {
        this.repo = repo;
    }


    @GetMapping("/Employee")
    public ResponseEntity<List<Employe>> getAllEmployees(){
        return ResponseEntity.ok(this.repo.findAll());


    }
    @GetMapping("/Employee/{id}")
    public ResponseEntity getAllEmployees(@PathVariable String id){
        Optional<Employe> employe=this.repo.findById(id);

        if(employe.isPresent()){
            return ResponseEntity.ok(employe.get());
        }
        else{
            return ResponseEntity.ok("Emploployee withis this id "+ id+ "not present");
        }


    }


    @GetMapping("/GetManager/{employeeId}/{level}")
    public ResponseEntity getManagerByLevel(@PathVariable String employeeId, @PathVariable int level) {
        Optional<Employe> employeeOptional = this.repo.findById(employeeId);

        if (employeeOptional.isPresent()) {
            Employe employee = employeeOptional.get();

            String managerId = employee.getReportsTo();
            for (int i = 1; i < level; i++) {
                Optional<Employe> managerOptional = this.repo.findById(managerId);

                if (managerOptional.isPresent()) {
                    Employe manager = managerOptional.get();
                    managerId = manager.getReportsTo();
                } else {
                    return ResponseEntity.ok("Manager not found at level " + level + " for employee with id " + employeeId);
                }
            }

            Optional<Employe> managerOptional = this.repo.findById(managerId);
            if (managerOptional.isPresent()) {
                Employe manager = managerOptional.get();
                return ResponseEntity.ok(manager);
            } else {
                return ResponseEntity.ok("Manager not found at level " + level + " for employee with id " + employeeId);
            }
        } else {
            return ResponseEntity.ok("Employee with id " + employeeId + " not found");
        }
    }

    @GetMapping("/employee")
    public ResponseEntity<Page<Employe>> getAllEmployees(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "employeeName") String sortBy
    ) {
        Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy));

        Page<Employe> employeesPage = this.repo.findAll(pageable);

        return ResponseEntity.ok(employeesPage);
    }


    @PostMapping("/employee")
    public ResponseEntity addEmployee(@RequestBody Employe employe){
        repo.save(employe);
       return ResponseEntity.ok("Employee added successfully");

    }

    @DeleteMapping("/Delete")
    public String deleteAll(){
        repo.deleteAll();
        return "All are deleted";
    }

    @DeleteMapping("/Delete/{id}")
    public ResponseEntity deletebyId(@PathVariable String id){
       Optional<Employe> employe=this.repo.findById(id);

       if(employe.isPresent()){
           this.repo.deleteById(id);
          return ResponseEntity.ok("Successfully Deleted ");
       }
       else{
           return ResponseEntity.ok("Employe with this id "+id+" is not Present");
       }

    }
    @PutMapping("/Update/{id}")
    public ResponseEntity updateEmployeById(@PathVariable String id, @RequestBody Employe employeUpdate){

          Optional<Employe> existingemploye=this.repo.findById(id);


        if(existingemploye.isPresent()){
            Employe employee=existingemploye.get();
            employee.setEmployeeName(employeUpdate.getEmployeeName());
            employee.setPhoneNumber(employeUpdate.getPhoneNumber());
            employee.setEmail(employeUpdate.getEmail());
            employee.setReportsTo(employeUpdate.getReportsTo());
            employee.setProfileImage(employeUpdate.getProfileImage());

            this.repo.save(employee);





            return ResponseEntity.ok("Employee Updated successfully");
        }
        else{
            return ResponseEntity.ok("Employee with id "+id+" is not present, Please check your id");
        }
    }



}
