package walton.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import walton.springboot.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{
//    List<Employee> findByActive(boolean active);

}
