package company.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import javax.persistence.*;


@Entity
@Data
@NoArgsConstructor
public class Ticket extends BaseEntity {

    private Integer seatNumber;
    private Integer rowNumber;

    @Column(columnDefinition = "TIMESTAMP")
    private LocalDateTime dateTime;

    @ManyToOne(fetch = FetchType.LAZY)
    private MovieCinema movieCinema;

    @ManyToOne(fetch = FetchType.LAZY)
    private User userAccount;
}
