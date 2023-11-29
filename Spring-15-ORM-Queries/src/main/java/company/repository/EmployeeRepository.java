package company.repository;

import company.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

    // Display all employees with email address 'npointona@vistaprint.com'

    List<Employee> findEmployeeByEmail(String email);


    // Display all employees with first name 'Nickey' and last name 'Pointon' also show all employees with email address

    List<Employee> findEmployeeByFirstNameAndLastNameAndEmailIsNotNull(String firstName, String lastName);

    // Display all employees that first name is not ''

    List<Employee> findEmployeeByFirstNameIsNot(String firstName);

    // Display all employees where last name starts with ''

    List<Employee> findEmployeeByLastNameStartingWith(String lastName);

    // Display all employees where salary is higher than ''

    List<Employee> findEmployeeBySalaryGreaterThan(Integer salary);

    // Display all employees where salary is less or equal than ''

    List<Employee> findEmployeeBySalaryIsLessThanEqual(Integer salary);

    // Display all employees that has been hired between date '' and date ''

    List<Employee> findEmployeeByHireDateBetween(LocalDate startDate, LocalDate endDate);

    // Display all employees where salary is greater and equal '' in order

    List<Employee> findEmployeeBySalaryIsGreaterThanEqualOrderBySalaryDesc(Integer salary);

    // Display top 3 unique employees that is making less than ''

    List<Employee> findDistinctTop3BySalaryLessThan(Integer salary);

    // Display all employees that do not have email address

    List<Employee> findEmployeeByEmailIsNull();



//    JPQL QUERIES

    @Query("SELECT e FROM Employee e WHERE e.email = 'sdubber7@t-online.de'")
    Employee getEmployeeDetails();

    @Query("SELECT e.salary FROM Employee e WHERE e.email = 'sdubber7@t-online.de'")
    Employee getEmployeeSalary();

    @Query("SELECT e FROM Employee e WHERE e.email = ?1")
    Employee getEmployeeDetails(String email);

    @Query("SELECT e FROM Employee  e WHERE e.email=?1 AND e.salary = ?2")
    Employee getEmployeeDetails(String email, Integer salary);

}
