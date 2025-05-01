package com.example.demo.service;

import com.example.demo.repository.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;

import static org.mockito.Mockito.*;
@Disabled
@SpringBootTest
public class UserDetailsServiceImplTests {

    @Autowired
    private UserDetailsServiceImpl userDetailsService;

    @MockBean
    private UserRepository userRepository;
//    @Test
//    void loadUserByusernameTest(){
//        when(userRepository.findByuserName(ArgumentMatchers.anyString())).thenReturn(User.builder().username("Nida").password("Nidaghj").roles(new ArrayList<>()).build());
//        UserDetails user = userDetailsService.loadUserByUsername("Nida");
//        Assertions.assertNotNull(user);
//    }
}
