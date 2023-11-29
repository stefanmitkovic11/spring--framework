package company.repository;

import company.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RegionRepository extends JpaRepository<Region, Long> {

    // DISPLAY ALL REGIONS IN CANADA
    List<Region> findRegionByCountry(String country);

//    DISPLAY ALL REGIONS IN CANADA WITHOUT DUPLICATE

    List<Region> findDistinctByCountry(String country);

//    DISPLAY ALL REGIONS WITH COUNTRY NAME INCLUDES 'UNITED'

    List<Region> findRegionByCountryContaining(String containText);

//    DISPLAY ALL REGIONS WITH COUNTRY NAME INCLUDES 'UNITED' in order

    List<Region> findRegionByCountryContainingOrderByCountry(String containText);

//    DISPLAY TOP 2 REGIONS IN CANADA

    List<Region> findTop2ByCountry(String country);

}
