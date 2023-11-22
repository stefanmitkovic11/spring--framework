package company.bootstrap;

import company.entity.Car;
import company.entity.Department;
import company.entity.Employee;
import company.enums.Gender;
import company.repository.CarRepository;
import company.repository.DepartmentRepository;
import company.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Component
public class DataGenerator implements CommandLineRunner{

    CarRepository carRepository;
    DepartmentRepository departmentRepository;
    EmployeeRepository employeeRepository;


    public DataGenerator(CarRepository carRepository, DepartmentRepository departmentRepository, EmployeeRepository employeeRepository) {
        this.carRepository = carRepository;
        this.departmentRepository = departmentRepository;
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Car c1 = new Car("C200","Mercedes","Blue");
        Car c2 = new Car("A4","Audi","Black");
        Car c3 = new Car("Superb","Skoda","Gray");
        Car c4 = new Car("A6","Audi","Red");


        carRepository.save(c1);
        carRepository.save(c2);
        carRepository.save(c3);
        carRepository.save(c4);


        Department d1 = new Department("Engineers","A1");
        Department d2 = new Department("Sales","A2");
        Department d3 = new Department("Marketing","A3");
        Department d4 = new Department("Customer Service","A4");

        departmentRepository.save(d1);
        departmentRepository.save(d2);
        departmentRepository.save(d3);
        departmentRepository.save(d4);


        Employee e1 = new Employee("Stefan","Mitkovic","stefan@gmail.com", LocalDate.now().minusDays(120),"Engineer", Gender.MALE,4000000,2);
        Employee e2 = new Employee("Stefan","Mitkovic","stefan@gmail.com", LocalDate.now().minusDays(120),"Engineer", Gender.MALE,4000000,2);
        Employee e3 = new Employee("Stefan","Mitkovic","stefan@gmail.com", LocalDate.now().minusDays(120),"Engineer", Gender.MALE,4000000,2);
        Employee e4 = new Employee("Stefan","Mitkovic","stefan@gmail.com", LocalDate.now().minusDays(120),"Engineer", Gender.MALE,4000000,2);


        employeeRepository.save(e1);
        employeeRepository.save(e2);
        employeeRepository.save(e3);
        employeeRepository.save(e4);
    }
}
