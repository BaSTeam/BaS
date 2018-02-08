package com.BaS.UI;

import com.BaS.Model.Circle;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class RootLayoutController {
    public Button CreateNewRoundButton;
    private Circle currentCircle;
    @FXML
    TextField radiusTextLine;
    @FXML
    TextField InfoTextLine;

    @FXML
    public void HandleClick() {
        try {
            double ValueOfRadius = Double.parseDouble(this.radiusTextLine.getText());
            currentCircle = createCircle(ValueOfRadius);
            GetInfoAboutCurrentCircle();
        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR, e.getMessage());
            alert.show();
        }

    }

    public Circle createCircle(double radius) {
        return new Circle(radius);
    }

    public String GetInfoAboutCurrentCircle()
    {
      return currentCircle.toString();
    }
}
