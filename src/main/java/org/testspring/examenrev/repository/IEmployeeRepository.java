package org.testspring.examenrev.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.testspring.examenrev.entity.Employee;
@Repository
public interface IEmployeeRepository extends JpaRepository<Employee,Integer> {
}
