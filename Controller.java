import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ToggleGroup Department;

    @FXML
    private CheckBox check1;

    @FXML
    private CheckBox check2;

    @FXML
    private CheckBox check3;

    @FXML
    private DatePicker date;

    @FXML
    private TextField name;

    @FXML
    private RadioButton radio1;

    @FXML
    private RadioButton radio2;

    @FXML
    private RadioButton radio3;

    @FXML
    private Button save;

    @FXML
    void on_submit(ActionEvent event) {
        String name = this.name.getText();
        //
        String date = date.getValue().toString();
        //
        String department = "N/A";
        if (radio1.isSelected()) {
            department = radio1.getText();
        } else if (radio2.isSelected()) {
            department = radio2.getText();
        } else {
            department = radio3.getText();
        }

    }

}
