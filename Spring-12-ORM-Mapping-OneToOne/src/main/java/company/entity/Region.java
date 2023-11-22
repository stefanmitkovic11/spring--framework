package company.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "regions")
@NoArgsConstructor
public class Region extends BaseEntity {
    private String region;
    private String county;

    @OneToOne(mappedBy = "region")
    private Employee employee;

    public Region(String region, String county) {
        this.region = region;
        this.county = county;
    }
}
