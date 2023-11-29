package company.bootstrap;

import company.repository.RegionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataGenerator implements CommandLineRunner {

    private final RegionRepository regionRepository;

    public DataGenerator(RegionRepository regionRepository) {
        this.regionRepository = regionRepository;
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
    }
}
