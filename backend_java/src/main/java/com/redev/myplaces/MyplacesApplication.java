package com.redev.myplaces;

import com.redev.myplaces.entity.User;
import com.redev.myplaces.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class MyplacesApplication extends SpringBootServletInitializer implements CommandLineRunner  {
	@Autowired
	private UserService userService;
	@Autowired
	private PasswordEncoder passEncoder;
	public static void main(String[] args) {
		SpringApplication.run(MyplacesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//userService.save(new User("","enestasdemir","Enes Taşdemir","enes@hotmail.com", passEncoder.encode("enes123")));
	}
}
