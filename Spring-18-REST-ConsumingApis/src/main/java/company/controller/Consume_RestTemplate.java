package company.controller;

import company.dto.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping("/users/api/v1")
public class Consume_RestTemplate {

    private final String URI = "https://jsonplaceholder.typicode.com/users";
    private final RestTemplate restTemplate;

    public Consume_RestTemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping
    public User[] readAllUsers(){

        ResponseEntity<User[]> responseEntity = restTemplate.getForEntity(URI, User[].class);


        return responseEntity.getBody();
    }

    @GetMapping("{id}")
    public Object readUserById(@PathVariable("id") Long userId){

        String URL = URI + "/{id}";

        return restTemplate.getForObject(URL, Object.class, userId);
    }


}
