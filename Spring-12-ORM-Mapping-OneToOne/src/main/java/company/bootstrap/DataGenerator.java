package company.bootstrap;

import company.entity.Department;
import company.entity.Employee;
import company.enums.Gender;
import company.repository.DepartmentRepository;
import company.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataGenerator implements CommandLineRunner {

    EmployeeRepository employeeRepository;
    DepartmentRepository departmentRepository;

    public DataGenerator(EmployeeRepository employeeRepository, DepartmentRepository departmentRepository) {
        this.employeeRepository = employeeRepository;
        this.departmentRepository = departmentRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Department d1 = new Department("Engineering","A1");
        Department d2 = new Department("Sales","A2");
        Department d3 = new Department("Marketing","A3");
        Department d4 = new Department("Customer Service","A4");


        departmentRepository.save(d1);
        departmentRepository.save(d2);
        departmentRepository.save(d3);
        departmentRepository.save(d4);


        Employee e1 = new Employee("Stefan","Mitkovic","stefan@gmail.com", LocalDate.now().minusDays(360), Gender.MALE,12332);
        Employee e2 = new Employee("Ishraj","Sight","ishraj@gmail.com", LocalDate.now().minusDays(160), Gender.MALE,1223332);
        Employee e3 = new Employee("Samia","Sami","samia@gmail.com", LocalDate.now().minusDays(260), Gender.FEMALE,1233232);
        Employee e4 = new Employee("Jose","Ramirez","jose@gmail.com", LocalDate.now().minusDays(560), Gender.MALE,1231332);


        employeeRepository.save(e1);
        employeeRepository.save(e2);
        employeeRepository.save(e3);
        employeeRepository.save(e4);
    }
}
