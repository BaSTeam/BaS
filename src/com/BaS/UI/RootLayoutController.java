package com.BaS.UI;

import com.BaS.Model.Circle;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class RootLayoutController {
    public Button createNewRoundButton;
    private Circle currentCircle;
    @FXML
    TextField radiusTextLine;
    @FXML
    TextField infoTextLine;

    /**
     * handles createNewRoundButton click event
     * generates alert in exception case
     */
    @FXML
    public void handleClick() {
        try {
            double valueOfRadius = Double.parseDouble(this.radiusTextLine.getText());
            createCircle(valueOfRadius);
            getInfoAboutCurrentCircle();
        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR, e.getMessage());
            alert.show();
        }

    }

    /**
     *
     * @param radius - radius of new circle
     */
    public void createCircle(double radius) {
        currentCircle = new Circle(radius);
    }

    /**
     *
     * @return string contains of formatted values of current circle fields
     */
    public String getInfoAboutCurrentCircle()
    {
      return currentCircle.toString();
    }
}
