package company.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CourseDTO {
    private Long id;


    private String name;


    private String category;


    private int rating;


    private String description;
}
