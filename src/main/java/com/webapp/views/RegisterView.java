package com.webapp.view;

import controllers.RegisterController;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class RegisterView {
    public static void show(Stage stage) {
        Label title = new Label("Anime Watchlist - Register");
        TextField emailField = new TextField();
        emailField.setPromptText("Email");

        PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("Password");

        Button signupBtn = new Button("Sign Up");
        Button goToLoginBtn = new Button("Back to Login");

        Label status = new Label();

        signupBtn.setOnAction(e -> {
            String email = emailField.getText();
            String password = passwordField.getText();
            RegisterController.register(stage, email, password, status);
        });

        goToLoginBtn.setOnAction(e -> LoginView.show(stage));

        VBox layout = new VBox(10, title, emailField, passwordField, signupBtn, goToLoginBtn, status);
        layout.setAlignment(Pos.CENTER);
        Scene scene = new Scene(layout, 400, 300);
        stage.setScene(scene);
    }
}
