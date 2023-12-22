package company.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
public class Genre extends BaseEntity {

    private String name;

    @ManyToMany(mappedBy = "genreList")
    @JsonIgnore
    private List<Movie> movieList;
}
