package com.example.demo;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication  {

	public static final Logger logger = LogManager.getLogger(DemoApplication.class);
	
	public static void main(String[] args) {
		logger.info("logger printed");
		SpringApplication.run(DemoApplication.class, args);
	}

}
