package com.consafe.erpApp;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;

public class ErpAppApplicationFx extends Application {
	
	private ConfigurableApplicationContext applicationContext;
	
	private static Scene mainScene;

	@Override
	public void init() {
		this.applicationContext = new SpringApplicationBuilder(ErpAppApplication.class).run();
	}
	
	@Override
	public void start(Stage stage) throws Exception {
		FXMLLoader loader = new FXMLLoader(ErpAppApplication.class.getResource("/com/consafe/erpApp/gui/MainView.fxml"));
		loader.setControllerFactory(applicationContext::getBean);
		
		ScrollPane scrollPane = loader.load();
		
		scrollPane.setFitToHeight(true);
		scrollPane.setFitToWidth(true);
		
		mainScene = new Scene(scrollPane);
		stage.setScene(mainScene);
		stage.setTitle("ERP Consafe");
		stage.show();
	}
	
	@Override
	public void stop() {
		applicationContext.close();
		Platform.exit();
	}
	
	public static Scene getMainScene() {
		return mainScene;
	}
}
