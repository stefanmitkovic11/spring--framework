package company.repository;

import company.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RegionRepository extends JpaRepository<Region, Long> {

    // DISPLAY ALL REGIONS IN CANADA
    List<Region> findRegionByCountry(String country);

//    DISPLAY ALL REGIONS IN CANADA WITHOUT DUPLICATE

    List<Region> findDistinctByCountry(String country);

}
