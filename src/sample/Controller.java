package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.Properties;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private Label aaa;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Properties props = System.getProperties();
        aaa.setText(props.getProperty("os.name"));
    }
}
