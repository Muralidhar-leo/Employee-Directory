package com.employee.Employee.Repository;

import com.employee.Employee.model.Employe;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeRepository extends MongoRepository<Employe,String> {
}
