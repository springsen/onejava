package cn.springsen.onejava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"cn.springsen"})
public class OnejavaApplication {

    public static void main(String[] args) {
        SpringApplication.run(OnejavaApplication.class, args);
    }

}
