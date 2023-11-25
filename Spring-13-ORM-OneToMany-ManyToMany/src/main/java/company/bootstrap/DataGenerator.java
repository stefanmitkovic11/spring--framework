package company.bootstrap;

import company.entity.Payment;
import company.entity.PaymentDetails;
import company.enums.Status;
import company.repository.PaymentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDate;

@Component
public class DataGenerator implements CommandLineRunner {

    public DataGenerator(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    private final PaymentRepository paymentRepository;

    @Override
    public void run(String... args) throws Exception {

        Payment payment1 = new Payment(LocalDate.of(2022,4,19), new BigDecimal("15000"), Status.SUCCESS);
        PaymentDetails paymentDetails1 = new PaymentDetails(new BigDecimal("14000"), new BigDecimal("10000"), LocalDate.of(2022,4,24));

        payment1.setPaymentDetails(paymentDetails1);

        Payment payment2 = new Payment(LocalDate.of(2022,4,25), new BigDecimal("120000"), Status.FAILURE);
        PaymentDetails paymentDetails2 = new PaymentDetails(new BigDecimal("90000"), new BigDecimal("50000"), LocalDate.of(2022,4,29));

        payment2.setPaymentDetails(paymentDetails2);


        paymentRepository.save(payment1);
        paymentRepository.save(payment2);



    }
}
