package company.bootstrap;

import company.repository.CourseRepository;
import company.repository.DepartmentRepository;
import company.repository.EmployeeRepository;
import company.repository.RegionRepository;
import org.hibernate.event.spi.SaveOrUpdateEvent;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataGenerator implements CommandLineRunner {

    private final RegionRepository regionRepository;
    private final DepartmentRepository departmentRepository;
    private final EmployeeRepository employeeRepository;
    private final CourseRepository courseRepository;

    public DataGenerator(RegionRepository regionRepository, DepartmentRepository departmentRepository, EmployeeRepository employeeRepository, CourseRepository courseRepository) {
        this.regionRepository = regionRepository;
        this.departmentRepository = departmentRepository;
        this.employeeRepository = employeeRepository;
        this.courseRepository = courseRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("------------------ REGION START ----------------------");

        System.out.println(regionRepository.findRegionByCountry("Canada"));


        System.out.println(regionRepository.findDistinctByCountry("Canada"));

        System.out.println(regionRepository.findRegionByCountryContaining("United"));


        System.out.println(regionRepository.findRegionByCountryContainingOrderByCountry("Asia"));

        System.out.println(regionRepository.findTop2ByCountry("Canada"));

        System.out.println("----------------- REGION END ----------------------------");


        System.out.println("----------------- DEPARTMENT START -------------------------");

        System.out.println(departmentRepository.findDepartmentByDepartment("Toys"));

        System.out.println(departmentRepository.findDepartmentByDivisionIs("Health"));

        System.out.println(departmentRepository.findDistinctByDivision("Health"));

        System.out.println(departmentRepository.findDistinctTop3ByDivisionContaining("Hea"));

        System.out.println("----------------- DEPARTMENT END ----------------------------");


        System.out.println("----------------- EMPLOYEE START -------------------------");

        System.out.println(employeeRepository.getEmployeeDetails());

//        System.out.println(employeeRepository.getEmployeeSalary());

        System.out.println(employeeRepository.getEmployeeDetails("sdubber7@t-online.de"));

        System.out.println(employeeRepository.getEmployeeDetails("sdubber7@t-online.de", 101066));

        System.out.println("----------------- EMPLOYEE END -------------------------");


        System.out.println("----------------- COURSE START -------------------------");

        courseRepository.findByCategory("Spring").forEach(System.out::println);

        System.out.println("-------------------------------");

        courseRepository.findByCategoryOrderByName("Spring").forEach(System.out::println);

        System.out.println("--------------------------------");

        System.out.println(courseRepository.existsByName("SWDWDWDWDWDWDWDW"));

        System.out.println("------------------------------");


        System.out.println(courseRepository.countCourseByCategory("Spring"));


        System.out.println("-----------------------------");

        courseRepository.findCourseByNameStartingWith("Getting").forEach(System.out::println);

        System.out.println("-------------------------------");

//        courseRepository.streamByCategory("Spring").forEach(System.out::println);

        System.out.println("----------------- COURSE END -------------------------");
    }
}
