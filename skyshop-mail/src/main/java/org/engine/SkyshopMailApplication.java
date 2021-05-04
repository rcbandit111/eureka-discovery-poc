package org.engine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableScheduling
@SpringBootApplication(scanBasePackages = { "org.engine.*"})
public class SkyshopMailApplication implements WebMvcConfigurer {

    public static void main(final String[] args)
    {
        SpringApplication.run(SkyshopMailApplication.class, args);
    }
}
