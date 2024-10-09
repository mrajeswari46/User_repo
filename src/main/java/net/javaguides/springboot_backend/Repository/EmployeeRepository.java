package net.javaguides.springboot_backend.Repository;

import net.javaguides.springboot_backend.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
