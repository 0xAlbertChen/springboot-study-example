package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author albert
 * @version 0.1
 * @since 3/12/20 4:51 PM
 */
@SpringBootApplication
@EnableScheduling
public class ScheduleApplication {

    public static void main(String[] args) {
        try {
            SpringApplication.run(ScheduleApplication.class, args);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
