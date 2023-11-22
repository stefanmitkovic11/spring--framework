package company.bootstrap;

import company.entity.Department;
import company.entity.Employee;
import company.enums.Gender;
import company.repository.DepartmentRepository;
import company.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class DataGenerator implements CommandLineRunner {

    EmployeeRepository employeeRepository;
//    DepartmentRepository departmentRepository;

    public DataGenerator(EmployeeRepository employeeRepository, DepartmentRepository departmentRepository) {
        this.employeeRepository = employeeRepository;
//        this.departmentRepository = departmentRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        List<Employee> employeeList = new ArrayList<>();
        List<Department> departmentList = new ArrayList<>();

        Department d1 = new Department("Engineering","A1");
        Department d2 = new Department("Sales","A2");
        Department d3 = new Department("Marketing","A3");
        Department d4 = new Department("Customer Service","A4");

        departmentList.addAll(Arrays.asList(d1,d2,d3,d4));
//        departmentRepository.saveAll(departmentList);

        Employee e1 = new Employee("Stefan","Mitkovic","stefan@gmail.com", LocalDate.now().minusDays(360), Gender.MALE,12332);
        Employee e2 = new Employee("Ishraj","Sight","ishraj@gmail.com", LocalDate.now().minusDays(160), Gender.MALE,1223332);
        Employee e3 = new Employee("Samia","Sami","samia@gmail.com", LocalDate.now().minusDays(260), Gender.FEMALE,1233232);
        Employee e4 = new Employee("Jose","Ramirez","jose@gmail.com", LocalDate.now().minusDays(560), Gender.MALE,1231332);

        e1.setDepartment(d1);
        e2.setDepartment(d2);
        e3.setDepartment(d3);
        e4.setDepartment(d4);

        employeeList.addAll(Arrays.asList(e1,e2,e3,e4));

        employeeRepository.saveAll(employeeList);


    }
}
