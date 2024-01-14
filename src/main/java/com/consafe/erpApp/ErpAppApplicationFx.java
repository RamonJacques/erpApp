package com.consafe.erpApp;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ErpAppApplicationFx extends Application {
	
	private ConfigurableApplicationContext applicationContext;
	
//	public static void main(String[] args) {
//		launch(args);		
//	}
	
	@Override
	public void init() {
		this.applicationContext = new SpringApplicationBuilder(ErpAppApplication.class).run();
	}
	
	@Override
	public void start(Stage stage) throws Exception {
		FXMLLoader loader = new FXMLLoader(ErpAppApplication.class.getResource("/com/consafe/erpApp/gui/MainView.fxml"));
		loader.setControllerFactory(applicationContext::getBean);
		Scene scene = new Scene(loader.load());
		stage.setScene(scene);
		stage.show();
	}
	
	@Override
	public void stop() {
		applicationContext.close();
		Platform.exit();
	}
}
