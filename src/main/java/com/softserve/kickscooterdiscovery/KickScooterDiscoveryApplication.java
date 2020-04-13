package com.softserve.kickscooterdiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class KickScooterDiscoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(KickScooterDiscoveryApplication.class, args);
    }

}
