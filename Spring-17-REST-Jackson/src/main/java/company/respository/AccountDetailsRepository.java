package company.respository;

import company.entity.AccountDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountDetailsRepository extends JpaRepository<AccountDetails, Long> {
}
