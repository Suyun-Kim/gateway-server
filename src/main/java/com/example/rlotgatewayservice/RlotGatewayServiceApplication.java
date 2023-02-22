package com.example.rlotgatewayservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@EnableDiscoveryClient
@SpringBootApplication
public class RlotGatewayServiceApplication {

    public static void main(String[] args) {

        SpringApplication.run(RlotGatewayServiceApplication.class, args);
    }

}
