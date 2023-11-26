package company.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "tickets")
@Data
@NoArgsConstructor
public class Ticket extends BaseEntity {

    @Column(columnDefinition = "DATE")
    private LocalDateTime dateTime;

    private int seatNumber;
    private int rowNumber;

    @ManyToOne
    private UserAccount userAccount;
}
