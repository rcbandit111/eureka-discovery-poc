package org.engine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableScheduling
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication(scanBasePackages = { "org.engine.*", "org.engine.plugin.production.service", "org.engine.plugin.warehouse.service" })
public class SkyshopEngineApplication implements WebMvcConfigurer {

    public static void main(final String[] args)
    {
        SpringApplication.run(SkyshopEngineApplication.class, args);
    }
}
