 package com.sp.StudentManagement.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.sp.StudentManagement.model.Users;
import com.sp.StudentManagement.repository.UserRepository;

@Configuration
public class DataInitializer {

    @Bean
    CommandLineRunner commandLineRunner(
            UserRepository userRepository,
            PasswordEncoder passwordEncoder) {

        return args -> {

            if (!userRepository.existsByUsername("admin")) {

                Users user = new Users();

                user.setUsername("admin");
                user.setPassword(passwordEncoder.encode("admin123"));
                user.setActive(true);

                userRepository.save(user);
            }
        };
    }
}