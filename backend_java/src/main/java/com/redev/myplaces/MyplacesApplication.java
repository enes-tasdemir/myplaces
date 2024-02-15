package com.redev.myplaces;

import com.redev.myplaces.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyplacesApplication {
	public static void main(String[] args) {
		SpringApplication.run(MyplacesApplication.class, args);
	}
}
