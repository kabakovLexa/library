package ru.javaguru.readingrecordsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ReadingRecordsServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReadingRecordsServiceApplication.class, args);
    }

}
