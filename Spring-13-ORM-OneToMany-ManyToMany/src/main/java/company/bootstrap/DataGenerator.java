package company.bootstrap;

import company.entity.Merchant;
import company.entity.Payment;
import company.entity.PaymentDetails;
import company.enums.Status;
import company.repository.MerchantRepository;
import company.repository.PaymentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;

@Component
public class DataGenerator implements CommandLineRunner {

    private final PaymentRepository paymentRepository;
    private final MerchantRepository merchantRepository;

    public DataGenerator(PaymentRepository paymentRepository, MerchantRepository merchantRepository) {
        this.paymentRepository = paymentRepository;
        this.merchantRepository = merchantRepository;
    }


    @Override
    public void run(String... args) throws Exception {

        Payment payment1 = new Payment(LocalDate.of(2022, 4, 19), new BigDecimal("15000"), Status.SUCCESS);
        PaymentDetails paymentDetails1 = new PaymentDetails(new BigDecimal("14000"), new BigDecimal("10000"), LocalDate.of(2022, 4, 24));

        payment1.setPaymentDetails(paymentDetails1);

        Payment payment2 = new Payment(LocalDate.of(2022, 4, 25), new BigDecimal("120000"), Status.FAILURE);
        PaymentDetails paymentDetails2 = new PaymentDetails(new BigDecimal("90000"), new BigDecimal("50000"), LocalDate.of(2022, 4, 29));

        payment2.setPaymentDetails(paymentDetails2);

        Merchant merchant1 = new Merchant("Stefan Mitkovic", "1233233", new BigDecimal("23333"), new BigDecimal("12333"), 5);

        payment1.setMerchant(merchant1);
        payment2.setMerchant(merchant1);

        merchantRepository.save(merchant1);


        paymentRepository.save(payment1);
        paymentRepository.save(payment2);






    }
}
