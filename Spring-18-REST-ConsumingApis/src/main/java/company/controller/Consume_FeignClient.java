package company.controller;

import company.client.EmployeeClient;
import company.client.UserClient;
import company.dto.ResponseWrapper;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Consume_FeignClient {

    private final UserClient userClient;
    private final EmployeeClient employeeClient;

    public Consume_FeignClient(UserClient userClient, EmployeeClient employeeClient) {
        this.userClient = userClient;
        this.employeeClient = employeeClient;
    }

    @GetMapping("/api/v2/users")
    public ResponseEntity<ResponseWrapper> getUsers() {
        return ResponseEntity
                .ok(new ResponseWrapper("UserList Retrieved", userClient.getUsers()));
    }

    @GetMapping("/api/v2/employee")
    public ResponseEntity<ResponseWrapper> getEmployees(){

        return ResponseEntity.ok(new ResponseWrapper("Retrieved Employees", employeeClient.getEmployees("6584e99f0c067969ebe25d2a")));
    }



}
