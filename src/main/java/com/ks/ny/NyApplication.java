package com.ks.ny;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.ks.ny.*")
public class NyApplication {

    public static void main(String[] args) {
        SpringApplication.run(NyApplication.class, args);
    }

}
