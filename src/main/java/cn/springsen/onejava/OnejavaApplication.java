package cn.springsen.onejava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication(scanBasePackages = {"cn.springsen"})
public class OnejavaApplication {

    public static void main(String[] args) {
        SpringApplication.run(OnejavaApplication.class, args);
    }


}
