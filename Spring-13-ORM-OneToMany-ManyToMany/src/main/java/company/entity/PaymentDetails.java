package company.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "payment_details")
@Data
@NoArgsConstructor
public class PaymentDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private BigDecimal merchantPayoutAmount;

    private BigDecimal commissionAmount;

    @Column(columnDefinition = "DATE")
    private LocalDate payoutDate;

    @OneToOne(mappedBy = "paymentDetails")
    private Payment payment;

    public PaymentDetails(BigDecimal merchantPayoutAmount, BigDecimal commissionAmount, LocalDate payoutDate) {
        this.merchantPayoutAmount = merchantPayoutAmount;
        this.commissionAmount = commissionAmount;
        this.payoutDate = payoutDate;
    }
}
