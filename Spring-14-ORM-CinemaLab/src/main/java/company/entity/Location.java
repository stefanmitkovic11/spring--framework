package company.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "locations")
@Data
@NoArgsConstructor
public class Location extends BaseEntity{

    private String name;
    private String country;
    private String city;
    private String state;
    private String postalCode;
    private String address;

    @OneToMany(mappedBy = "location")
    private List<Cinema> cinemaList;


}
