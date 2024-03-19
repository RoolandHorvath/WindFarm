package com.example.windfarm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {"com.example.windfarm.domain"})
public class WindFarmApplication {

    public static void main(String[] args) {
        SpringApplication.run(WindFarmApplication.class, args);
    }
}
