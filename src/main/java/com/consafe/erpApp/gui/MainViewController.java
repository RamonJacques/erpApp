package com.consafe.erpApp.gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import org.springframework.stereotype.Component;

import com.consafe.erpApp.ErpAppApplicationFx;
import com.consafe.erpApp.gui.utils.Alerts;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;

@Component
public class MainViewController implements Initializable {

	@FXML
	private MenuItem menuItemAddress;

	@FXML
	private MenuItem menuItemAbout;

	@FXML
	public void onMenuItemAddressAction() {
		System.out.println("Address");
	}

	@FXML
	public void onMenuItemAboutAction() {
		loadView("/com/consafe/erpApp/gui/About.fxml");
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		// TODO Auto-generated method stub
	}

	private synchronized void loadView(String absoluteName) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource(absoluteName));
			VBox newVBox = loader.load();
			
			Scene mainScene = ErpAppApplicationFx.getMainScene();
			VBox mainVBox = (VBox) ((ScrollPane) mainScene.getRoot()).getContent();
			
			Node mainMenu = mainVBox.getChildren().get(0);
			mainVBox.getChildren().clear();
			
			mainVBox.getChildren().add(mainMenu);
			mainVBox.getChildren().addAll(newVBox.getChildren());
			
		} catch (IOException e) {
			Alerts.showAlert("IO Exception", "Erro carregando a página", e.getMessage(), AlertType.ERROR);
		}
	}
}
