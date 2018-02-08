package com.BaS.Engine;

import com.BaS.UI.RootLayoutController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class Engine  extends Application{
    private static Engine app;
    private Stage primaryStage;
    private Pane rootLayout;

    /**
     * entry point of form application
     * @param primaryStage stage of application on start
     */
    @Override
    public void start(Stage primaryStage)
    {
        app = this;
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
            this.rootLayout = loader.load();
            Scene scene = new Scene(this.rootLayout);
            this.primaryStage.setScene(scene);
            RootLayoutController controller = loader.getController();
            this.primaryStage.show();
        } catch (IOException var4) {
            var4.printStackTrace();
        }
    }

}
