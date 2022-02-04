package com.zzr.springboot_basic;

import com.zzr.springboot_basic.init.ApplicationContextInitializerDemo;
import com.zzr.springboot_basic.init.ProjectInit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBasicApplication {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(SpringbootBasicApplication.class);
		application.addInitializers(new ApplicationContextInitializerDemo());
		application.run(args);
	}

}
