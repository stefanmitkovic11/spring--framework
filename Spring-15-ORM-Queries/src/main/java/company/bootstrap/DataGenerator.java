package company.bootstrap;

import company.repository.DepartmentRepository;
import company.repository.EmployeeRepository;
import company.repository.RegionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataGenerator implements CommandLineRunner {

    private final RegionRepository regionRepository;
    private final DepartmentRepository departmentRepository;
    private final EmployeeRepository employeeRepository;

    public DataGenerator(RegionRepository regionRepository, DepartmentRepository departmentRepository, EmployeeRepository employeeRepository) {
        this.regionRepository = regionRepository;
        this.departmentRepository = departmentRepository;
        this.employeeRepository = employeeRepository;
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

    }
}
