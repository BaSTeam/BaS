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

    /**
     * handles CreateNewRoundButton click event
     * generates alert in exception case
     */
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

    /**
     *
     * @param radius - radius of new circle
     * @return new circle
     */
    public Circle createCircle(double radius) {
        return new Circle(radius);
    }

    /**
     *
     * @return string contains of formatted values of current circle fields
     */
    public String GetInfoAboutCurrentCircle()
    {
      return currentCircle.toString();
    }
}
