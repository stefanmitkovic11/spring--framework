package company.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "user_account")
@Data
@NoArgsConstructor
public class User extends BaseEntity{

    private String username;
    private String password;
    private String email;

    @OneToOne
    private AccountDetails accountDetails;
}
