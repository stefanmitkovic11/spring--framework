package company.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "accounts")
@Data
@NoArgsConstructor
public class UserAccount extends BaseEntity {


    private String username;
    private String password;
    private String email;

    @OneToOne
    private AccountDetails accountDetails;

    @OneToMany(mappedBy = "userAccount")
    private List<Ticket> ticketList;
}
