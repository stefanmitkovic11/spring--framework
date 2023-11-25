package company.bootstrap;

import company.entity.*;
import company.enums.Status;
import company.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;

@Component
public class DataGenerator implements CommandLineRunner {

    private final PaymentRepository paymentRepository;
    private final MerchantRepository merchantRepository;
    private final CustomerRepository customerRepository;
    private final ItemRepository itemRepository;
    private final CartRepository cartRepository;

    public DataGenerator(PaymentRepository paymentRepository, MerchantRepository merchantRepository, CustomerRepository customerRepository, ItemRepository itemRepository, CartRepository cartRepository) {
        this.paymentRepository = paymentRepository;
        this.merchantRepository = merchantRepository;
        this.customerRepository = customerRepository;
        this.itemRepository = itemRepository;
        this.cartRepository = cartRepository;
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

        Customer customer1 = new Customer("stefanmitkovic","Mitkovic","Stefan","stefan@gmail.com","123 ABC STREET");

        payment1.setCustomer(customer1);
        payment2.setCustomer(customer1);

        Item item1 = new Item("Milk","2");
        Item item2 = new Item("Bread", "4");
        Item item3 = new Item("Juice", "3");
        Item item4 = new Item("Sugar", "1");
        Item item5 = new Item("Orange","23");

        itemRepository.save(item1);
        itemRepository.save(item2);
        itemRepository.save(item3);
        itemRepository.save(item4);
        itemRepository.save(item5);


        Cart cart1 = new Cart();
        Cart cart2 = new Cart();
        Cart cart3 = new Cart();

        cart1.setItems(Arrays.asList(item1,item2,item3));
        cart2.setItems(Arrays.asList(item4,item5));


        cartRepository.save(cart1);
        cartRepository.save(cart2);
        cartRepository.save(cart3);

//        payment1.setCart(cart1);
//        payment2.setCart(cart2);

        merchantRepository.save(merchant1);

        customerRepository.save(customer1);


        paymentRepository.save(payment1);
        paymentRepository.save(payment2);






    }
}
