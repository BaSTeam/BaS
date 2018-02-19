package com.BaS.Engine;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class Engine  extends Application{
    private Stage primaryStage;

    /**
     * entry point of form application
     * @param primaryStage stage of application on start
     */
    @Override
    public void start(Stage primaryStage)
    {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Circle CR");
        this.initRootLayout();
    }

    /**
     * loads and starts form classes
     */
    private void initRootLayout() {
        try {
            FXMLLoader loader = new FXMLLoader();
            URL url = Engine.class.getResource("../UI/RootLayout.fxml");
            loader.setLocation(url);
            Pane rootLayout = loader.load();
            Scene scene = new Scene(rootLayout);
            this.primaryStage.setScene(scene);
            this.primaryStage.show();
        } catch (IOException var4) {
            var4.printStackTrace();
        }
    }

}
