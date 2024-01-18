package company.service.impl;

import company.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InOrder;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;


@ExtendWith(MockitoExtension.class)
class UserServiceImplTest {
    @Mock
    UserRepository userRepository;

    @InjectMocks
    UserServiceImpl userServiceImpl;

    @Test
    void deleteByUsername_test(){
        userServiceImpl.deleteByUserName("mikesmith@employee.com");

//        verify(userRepository).deleteByUserName("mikesmith@employee.com");
//        verify(userRepository, times(2)).deleteByUserName("mikesmith@employee.com");

        verify(userRepository, atLeastOnce()).deleteByUserName("mikesmith@employee.com");

//        verify(userRepository, atLeast(5)).deleteByUserName("mikesmith@employee.com");
//        verify(userRepository, atMostOnce()).deleteByUserName("mikesmith@employee.com");
//        verify(userRepository, atMost(5)).deleteByUserName("mikesmith@employee.com");

//        InOrder order = inOrder(userRepository);
//
//        order.verify(userRepository).findAll();
//        order.verify(userRepository).deleteByUserName("mikesmith@employee.com");

    }

}