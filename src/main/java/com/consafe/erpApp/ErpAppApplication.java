package com.consafe.erpApp;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import javafx.application.Application;

@SpringBootApplication
public class ErpAppApplication {

	public static void main(String[] args) {
		//SpringApplication.run(ErpAppApplication.class, args);
		Application.launch(ErpAppApplicationFx.class, args);
	}

}
