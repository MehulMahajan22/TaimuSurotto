package com.taimusurotto.slotmanagementservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication
@EnableScheduling
public class SlotManagementServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SlotManagementServiceApplication.class, args);
	}

}
