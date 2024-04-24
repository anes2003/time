package com.time.layout;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import com.time.App;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.util.Duration;

public class MainController {

    @FXML
    private Label time;

    private Timeline timeline;

    @SuppressWarnings("unused")
    private App app;

    public void load(App app) {
        this.app = app;
        time();
    }

    private void time() {
        timeline = new Timeline(new KeyFrame(Duration.seconds(1), e -> {
            LocalTime currentTime = LocalTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss a");
            String formattedTime = currentTime.format(formatter);
            time.setText(formattedTime);

            Color color = Color.color(Math.random(), Math.random(), Math.random());
            time.setTextFill(color);

        }));

        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();
    }
    

}
