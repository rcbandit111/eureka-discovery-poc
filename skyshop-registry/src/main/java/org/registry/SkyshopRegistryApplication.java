package org.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SkyshopRegistryApplication {

    public static void main(final String[] args)
    {
        SpringApplication.run(SkyshopRegistryApplication.class, args);
    }
}
