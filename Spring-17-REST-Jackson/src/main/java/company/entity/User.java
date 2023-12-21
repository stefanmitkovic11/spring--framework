package company.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "user_account")
@Data
@NoArgsConstructor
public class User extends BaseEntity{

    @JsonIgnore
    private String email;

    private String username;
    private String password;

    @OneToOne
    private AccountDetails accountDetails;
}
