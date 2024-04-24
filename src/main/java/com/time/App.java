package com.time;

import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

import com.time.setting.Content;

public class App extends Application {
    private Stage applicationStage;

    @Override
    public void start(Stage applicationStage) throws Exception {
        this.applicationStage = applicationStage;
        _initialize_application();
    }

    private void _initialize_application() throws IOException {
        Content.load_MAIN(this);
    }

    public Stage getApplicationStage() {
        return applicationStage;
    }

    public void setApplicationStage(Stage stage) {
        this.applicationStage = stage;
    }

    public static void main(String[] args) {
        launch(args);
    }

}