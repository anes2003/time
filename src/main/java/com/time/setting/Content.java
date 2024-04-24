package com.time.setting;

import java.io.IOException;

import com.time.App;
import com.time.layout.MainController;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;

public class Content {
    private static final String ICON = App.class.getResource("theme/icon/icon.jpg").toExternalForm();

    public static FXMLLoader load(String uri) {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(App.class.getResource("layout/" + uri + ".fxml"));
        return loader;
    }

    public static void load_MAIN(App app) throws IOException {
        FXMLLoader loader = load("MAIN");
        Parent container = loader.load();
        Scene scene = new Scene(container);
        app.getApplicationStage().setResizable(false);
        app.getApplicationStage().setScene(scene);
        app.getApplicationStage().getIcons().add(new Image(ICON));
        app.getApplicationStage().show();
        MainController controller = loader.getController();
        controller.load(app);
    }
}
