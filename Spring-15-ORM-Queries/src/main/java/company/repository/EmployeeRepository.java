package company.repository;

import company.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

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


    //    Not Equal
    @Query("SELECT e FROM Employee e WHERE e.salary <> ?1")
    List<Employee> getEmployeesSalaryNotEqual(int salary);

    //    Like/Contains/StartsWith/EndsWith
    @Query("SELECT e FROM Employee e WHERE e.firstName like ?1")
    List<Employee> getEmployeesFirstNameLike(String pattern);


    //    Less than
    @Query("SELECT e from Employee e WHERE e.salary < ?1")
    List<Employee> getEmployeesSalaryLessThan(int salary);

    //    Greater Than
    @Query("SELECT e FROM Employee e WHERE e.salary > ?1")
    List<Employee> getEmployeesSalaryGraterThan(int salary);

    //    Before
    @Query("SELECT e FROM Employee e WHERE e.hireDate > ?1")
    List<Employee> getEmployeesHireDateBefore(LocalDate date);

    //    Between
    @Query("SELECT e FROM Employee e WHERE e.salary BETWEEN ?1 AND ?2")
    List<Employee> getEmployeesSalaryBetween(int salary1, int salary2);

    //    Null
    @Query("SELECT e FROM Employee e WHERE e.email IS NULL")
    List<Employee> getEmployeesEmailIsNull();

    //    Not Null
    @Query("SELECT e FROM Employee e WHERE e.email IS NOT NULL ")
    List<Employee> getEmployeesEmailIsNotNull();

    //    Sorting in ascending order
    @Query("SELECT e FROM Employee e ORDER BY e.salary")
    List<Employee> getEmployeesSalaryOrderAscending();


    //    Sorting in descending order
    @Query("SELECT e FROM Employee e ORDER BY e.salary DESC ")
    List<Employee> getEmployeesSalaryOrderDescending();

    @Query(value = "Select * FROM employees WHERE salary ?1", nativeQuery = true)
    List<Employee> readEmployeeDetailBySalary(int salary);


    @Modifying
    @Transactional
    @Query("UPDATE Employee e SET e.email = 'adming@email.com' WHERE e.id = :id")
    void updateEmployeeJPQL(@Param("id") Integer id);


    @Modifying
    @Transactional
    @Query(value = "UPDATE employees SET email = 'adming@email.com' WHERE id = :id", nativeQuery = true)
    void updateEmployeeJPQLNativeQuery(@Param("id") Integer id);



}
