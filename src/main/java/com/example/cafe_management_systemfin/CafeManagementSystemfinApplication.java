package com.example.cafe_management_systemfin;


import com.example.cafe_management_systemfin.domain.entity.User;
import com.example.cafe_management_systemfin.domain.enums.RoleType;
import com.example.cafe_management_systemfin.repository.UserRepository;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


@SpringBootApplication()
@OpenAPIDefinition(
        info = @Info(
                title = "Cafe Management System",
                version = "1",
                description = "Cafe Management app",
                contact = @Contact(name = "bootcamp", email = "aca.bootcamp@gmail.com")))
@SecurityScheme(
        name = "bearerAuth",
        type = SecuritySchemeType.HTTP,
        bearerFormat = "JWT",
        scheme = "bearer")

public class CafeManagementSystemfinApplication {

    public static void main(String[] args) {
        SpringApplication.run(CafeManagementSystemfinApplication.class, args);
    }

    //@Bean
    public CommandLineRunner runner(UserRepository userRepository, BCryptPasswordEncoder encoder) {
        return args -> {
            User admin = new User();
            admin.setFirstName("Admin");
            admin.setLastName("Admin");
            admin.setUsername("admin");
            admin.setPassword(encoder.encode("password"));
            admin.setRoleType(RoleType.ADMIN);

            userRepository.save(admin);
        };
    }

}
