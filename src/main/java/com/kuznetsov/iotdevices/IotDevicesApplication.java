package com.kuznetsov.iotdevices;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IotDevicesApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(IotDevicesApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
	}
}
