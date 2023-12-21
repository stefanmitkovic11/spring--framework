package company.controller;

import company.entity.AccountDetails;
import company.entity.User;
import company.respository.AccountDetailsRepository;
import company.respository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {
    private UserRepository userRepository;
    private AccountDetailsRepository accountDetailsRepository;

    public HomeController(UserRepository userRepository, AccountDetailsRepository accountDetailsRepository) {
        this.userRepository = userRepository;
        this.accountDetailsRepository = accountDetailsRepository;
    }

    @GetMapping("/users")
    public List<User> readAllUsers(){
        return userRepository.findAll();
    }

    @GetMapping("/accounts")
    public List<AccountDetails> readAllAccounts(){
        return accountDetailsRepository.findAll();
    }
}
