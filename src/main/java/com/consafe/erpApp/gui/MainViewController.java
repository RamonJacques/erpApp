package com.consafe.erpApp.gui;

import java.net.URL;
import java.util.ResourceBundle;

import org.springframework.stereotype.Component;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

@Component
public class MainViewController implements Initializable{
	
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
		System.out.println("About");
	}
	

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		// TODO Auto-generated method stub		
	}
}
