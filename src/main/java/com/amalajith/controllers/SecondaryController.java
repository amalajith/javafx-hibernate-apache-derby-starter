package com.amalajith.controllers;

import java.io.IOException;

import com.amalajith.App;
import javafx.fxml.FXML;

public class SecondaryController {

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
}