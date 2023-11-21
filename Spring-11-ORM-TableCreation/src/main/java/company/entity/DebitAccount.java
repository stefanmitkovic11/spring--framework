package company.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "debitAccountTable")
public class DebitAccount extends Account {

    private BigDecimal overDraftFee;
}
