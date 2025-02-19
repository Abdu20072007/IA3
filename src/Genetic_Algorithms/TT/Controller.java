package Genetic_Algorithms.TT;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import hellofx.Customer;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.FileChooser;

public class Controller {

    // @FXML
    // private TableView<Customer> table;

    // @FXML
    // private TableColumn<Customer, Integer> ageColumn;

    // @FXML
    // private TextField ageInput;

    // @FXML
    // private TableColumn<Customer, Integer> idColumn;

    // @FXML
    // private TextField idInput;

    // @FXML
    // private TableColumn<Customer, String> nameColumn;

    // @FXML
    // private TextField nameInput;

    // @Override
    // public void initialize(URL location, ResourceBundle resources) {
    // nameColumn.setCellValueFactory(new PropertyValueFactory<Customer,
    // String>("name"));
    // ageColumn.setCellValueFactory(new PropertyValueFactory<Customer,
    // Integer>("age"));
    // idColumn.setCellValueFactory(new PropertyValueFactory<Customer,
    // Integer>("id"));
    // }

    // @FXML
    // void submit(MouseEvent event) {
    // Customer customer = new Customer(nameInput.getText(),
    // Integer.parseInt(ageInput.getText()),
    // Integer.parseInt(idInput.getText()));
    // ObservableList<Customer> customers = table.getItems();
    // customers.add(customer);
    // table.setItems(customers);

    // }

    // @FXML
    // void removeCustomer(MouseEvent event) {
    // int selectedID = table.getSelectionModel().getSelectedIndex();
    // table.getItems().remove(selectedID);
    // }

    @FXML
    private Button chooseFile;

    // @FXML
    // void chooseFile(MouseEvent event) {
    // FileChooser fileChooser = new FileChooser();

    // fileChooser.setInitialDirectory(new File("C:/Files"));
    // // fileChooser.getExtensionFilters().addAll(Main.ex1);

    // File selectedFile = fileChooser.showOpenDialog(null);
    // }
}
