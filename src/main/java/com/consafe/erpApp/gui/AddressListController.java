package com.consafe.erpApp.gui;

import java.net.URL;
import java.util.ResourceBundle;

import org.springframework.beans.factory.annotation.Autowired;

import com.consafe.erpApp.ErpAppApplicationFx;
import com.consafe.erpApp.entities.Address;
import com.consafe.erpApp.services.AddressService;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class AddressListController implements Initializable {

	@Autowired
	private AddressService addressService;

	@FXML
	private TableView<Address> tableViewAddress;

	@FXML
	private TableColumn<Address, Long> tableColumnId;

	@FXML
	private TableColumn<Address, String> tableColumnStreet;

	@FXML
	private TableColumn<Address, Integer> tableColumnNumber;

	@FXML
	private TableColumn<Address, String> tableColumnNeighborhood;

	@FXML
	private TableColumn<Address, String> tableColumnComplement;

	@FXML
	private TableColumn<Address, String> tableColumnCity;

	@FXML
	private TableColumn<Address, String> tableColumnState;

	@FXML
	private TableColumn<Address, Double> tableColumnCep;

	@FXML
	private TextField txtStreet;

	@FXML
	private TextField txtNumber;

	@FXML
	private TextField txtNeighborhood;

	@FXML
	private TextField txtComplement;

	@FXML
	private TextField txtCity;

	@FXML
	private TextField txtState;

	@FXML
	private TextField txtCep;

	@FXML
	private Button btNew;

	@FXML
	private Button btModify;

	@FXML
	private Button btDelete;

	@FXML
	public void onBtNewAction() {
		System.out.print("Novo endereço");
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		initializeNodes();		
	}

	private void initializeNodes() {
		tableColumnId.setCellValueFactory(new PropertyValueFactory<>("id"));
		tableColumnStreet.setCellValueFactory(new PropertyValueFactory<>("street"));
		tableColumnNumber.setCellValueFactory(new PropertyValueFactory<>("number"));
		tableColumnNeighborhood.setCellValueFactory(new PropertyValueFactory<>("neighborhood"));
		tableColumnComplement.setCellValueFactory(new PropertyValueFactory<>("complement"));
		tableColumnCity.setCellValueFactory(new PropertyValueFactory<>("city"));
		tableColumnState.setCellValueFactory(new PropertyValueFactory<>("state"));
		tableColumnCep.setCellValueFactory(new PropertyValueFactory<>("cep"));
		
		Stage stage = (Stage) ErpAppApplicationFx.getMainScene().getWindow();
		tableViewAddress.prefHeightProperty().bind(stage.heightProperty());
	}
	


//	private Integer internAddressId;
//
//	private ObservableList<Address> obsList = FXCollections.observableArrayList();
//
//	public void onBtNewAction() {
//		if (txtStreet.getText().isEmpty() || txtNumber.getText().isEmpty() || txtCity.getText().isEmpty()) {
//			Alerts.showAlert("Erro", "Dado faltando no formulário", "Rua, número e/ou cidade devem estar preenchidos",
//					AlertType.ERROR);
//			return;
//		} else {
//			Address address = new Address();
//			getAddressFormData(address);
//			address.setId(null);
//			addressService.save(address);
//			Alerts.showAlert("Salvo", "Endereço adicionado", "Endereço salvo com sucesso", AlertType.INFORMATION);
//			cleanAddressForm();
//			updateTableView();
//		}
//	}
//
//	public void onBtModify() {
//		if (txtStreet.getText().isEmpty() || txtNumber.getText().isEmpty() || txtCity.getText().isEmpty()) {
//			Alerts.showAlert("Erro", "Dado faltando no formulário", "Rua, número e/ou cidade devem estar preenchidos",
//					AlertType.ERROR);
//			txtStreet.requestFocus();
//		}
//		if (internAddressId == null) {
//			Alerts.showAlert("Atenção", "Nenhum endereço selecionado", "Selecione um endereço para modificar",
//					AlertType.INFORMATION);
//			return;
//		}
//		Address address = new Address();
//		getAddressFormData(address);
//		addressService.save(address);
//		updateTableView();
//		Alerts.showAlert("Alterado", "Endereço alterado", "Endereço alterado e salvo com sucesso",
//				AlertType.INFORMATION);
//	}
//
//	public void onAdressMouseClick() {
//		Address address = tableViewAddress.getSelectionModel().getSelectedItem();
//		if (address != null) {
//			internAddressId = address.getId();
//			txtStreet.setText(address.getStreet());
//			txtNumber.setText(address.getNumber().toString());
//			txtNeighborhood.setText(address.getNeighborhood());
//			txtComplement.setText(address.getComplement());
//			txtCity.setText(address.getCity());
//			txtState.setText(address.getState());
//			txtCep.setText(address.getCep().toString());
//		}
//	}
//
//	@Override
//	public void initialize(URL url, ResourceBundle rb) {
//		tableViewAddress.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
//		initializeNodes();
//		updateTableView();
//	}
//
//	private void initializeNodes() {
//		tableColumnId.setCellValueFactory(new PropertyValueFactory<>("id"));
//		tableColumnStreet.setCellValueFactory(new PropertyValueFactory<>("street"));
//		tableColumnNumber.setCellValueFactory(new PropertyValueFactory<>("number"));
//		tableColumnNeighborhood.setCellValueFactory(new PropertyValueFactory<>("neighborhood"));
//		tableColumnComplement.setCellValueFactory(new PropertyValueFactory<>("complement"));
//		tableColumnCity.setCellValueFactory(new PropertyValueFactory<>("city"));
//		tableColumnState.setCellValueFactory(new PropertyValueFactory<>("state"));
//		tableColumnCep.setCellValueFactory(new PropertyValueFactory<>("cep"));
//
////		Stage stage = (Stage) InterfaceApplication.getMainScene().getWindow();
////		tableViewSteelBar.prefHeightProperty().bind(stage.heightProperty());
//	}
//
//	public void updateTableView() {
//		List<Address> list = addressService.findAll();
//		obsList = FXCollections.observableArrayList(list);
//		tableViewAddress.setItems(obsList);
//	}
//
//	private void getAddressFormData(Address address) {
//		if (internAddressId != null) {
//			address.setId(internAddressId);
//			address.setStreet(txtStreet.getText());
//			address.setNumber(Integer.parseInt(txtNumber.getText()));
//			address.setNeighborhood(txtNeighborhood.getText());
//			address.setComplement(txtComplement.getText());
//			address.setCity(txtCity.getText());
//			address.setState(txtState.getText());
//			address.setCep(Integer.parseInt(txtCep.getText()));
//		}
//	}
//
//	private void cleanAddressForm() {
//		internAddressId = null;
//		txtStreet.clear();
//		txtNumber.clear();
//		txtNeighborhood.clear();
//		txtComplement.clear();
//		txtCity.clear();
//		txtState.clear();
//		txtCep.clear();
//	}
//}
}
