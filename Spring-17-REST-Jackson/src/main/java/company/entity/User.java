package company.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "user_account")
@Data
@NoArgsConstructor
@JsonIgnoreProperties(value = "{hibernateLazyInitializer}", ignoreUnknown = true)
public class User extends BaseEntity{

//    @JsonIgnore
    private String email;

    private String username;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;

    @OneToOne(fetch = FetchType.LAZY)
    @JsonManagedReference // is the forward part of reference - the one that gets serialized normally
    private AccountDetails accountDetails;
}
