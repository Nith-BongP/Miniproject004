import java.net.URL;
import java.util.ResourceBundle;
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
    void initialize() {
        assert Department != null : "fx:id=\"Department\" was not injected: check your FXML file 'View.fxml'.";
        assert check1 != null : "fx:id=\"check1\" was not injected: check your FXML file 'View.fxml'.";
        assert check2 != null : "fx:id=\"check2\" was not injected: check your FXML file 'View.fxml'.";
        assert check3 != null : "fx:id=\"check3\" was not injected: check your FXML file 'View.fxml'.";
        assert date != null : "fx:id=\"date\" was not injected: check your FXML file 'View.fxml'.";
        assert name != null : "fx:id=\"name\" was not injected: check your FXML file 'View.fxml'.";
        assert radio1 != null : "fx:id=\"radio1\" was not injected: check your FXML file 'View.fxml'.";
        assert radio2 != null : "fx:id=\"radio2\" was not injected: check your FXML file 'View.fxml'.";
        assert radio3 != null : "fx:id=\"radio3\" was not injected: check your FXML file 'View.fxml'.";
        assert save != null : "fx:id=\"save\" was not injected: check your FXML file 'View.fxml'.";

    }

}
