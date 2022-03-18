package com.hateos.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableDiscoveryClient
@EnableJpaRepositories("com.hateos.test")
@EntityScan("com.hateos.test.subscriptions.domain")
public class TestApplication {

    public static void main(final String[] args)
    {
        SpringApplication.run(TestApplication.class, args);
    }
}
