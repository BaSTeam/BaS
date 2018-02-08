package com.BaS.UI;

import com.BaS.Model.Circle;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class MainFormController {
    public Button CreateNewRoundButton;
    @FXML
    TextField radiusTextLine;
    @FXML
    TextField InfoTextLine;

    @FXML
    public void HandleClick() {
        try {
            double ValueOfRadius = Double.parseDouble(this.radiusTextLine.getText());
            Circle circle = new Circle(ValueOfRadius);
            InfoTextLine.setText(circle.toString());
        }
        catch (Exception e)
        {
            Alert alert = new Alert(Alert.AlertType.ERROR,e.getMessage());
            alert.show();
        }

    }
}
