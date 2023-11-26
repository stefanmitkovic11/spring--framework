package company.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "cinemas")
@Data
@NoArgsConstructor
public class Cinema extends BaseEntity {

    private String name;
    private String sponsoredName;

    @ManyToOne
    private Location location;

    @OneToMany(mappedBy = "cinema")
    private List<MovieCinema> movieCinemaList;

}
