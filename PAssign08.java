/**
 * File: PAssign08.java
 * Class: CSCI 1302
 * Author: Amari Riley
 * Created on: April 25, 2023
 * Last Modified: April 26, 2023
 * Description: Expand your program from Assignment 7 to include user interaction while continuing to use the
KeyPadPane class. 
 */

package ch16;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import java.util.ArrayList;
import java.util.Arrays;
import javafx.event.ActionEvent;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.Group;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.BorderPane;

public class PAssign08 extends Application{
	@Override
	public void start(Stage primaryStage) {
		//Create a stackpane, enter button, and flowpane
		//Create a label that tells the user to enter the passcode to the door lock
		//Create a textfield and a password that must match to what the user enters to unlock the door
		StackPane pane = new StackPane();
		Button btEnter = new Button("Enter");
		FlowPane flow = new FlowPane();
		Label passcode = new Label("Enter Passcode: ");
		TextField code = new TextField();
		String password = "12345";
		
		//Create a KeyPadCustomPane object that calls the new custom pane
		KeyPadCustomPane key = new KeyPadCustomPane();

		//Create two background and background fill objects to change the background
		BackgroundFill backgroundfill = new BackgroundFill(Color.GREEN, new CornerRadii(10), new Insets(10));
		Background background = new Background(backgroundfill);
		BackgroundFill backgroundfill2 = new BackgroundFill(Color.RED, new CornerRadii(10), new Insets(10));
		Background background2 = new Background(backgroundfill2);

		//Utilize the getChildren method to add the textfields, labels, and panes to the stackpane. 
		flow.getChildren().add(passcode);
		flow.getChildren().add(code);
		flow.setAlignment(Pos.TOP_CENTER);
		pane.getChildren().add(flow);
		pane.getChildren().add(key);
		pane.getChildren().add(btEnter);
		pane.setAlignment(Pos.BOTTOM_CENTER);
		key.setAlignment(Pos.CENTER);

		//Create a scene that adds a pane to the scene
		Scene scene = new Scene(pane, 180, 250);

		//Utilize event handling to create an action event that prints the passcode to console and whether or not the login is successful. 
		//If the login is successful, change the background to green. If not, change the background to green
		btEnter.setOnMouseClicked(e ->{
			System.out.println(code.getText());
			if (code.getText().matches(password)) {
				System.out.println("Door Opened. Correct Code");
				pane.setBackground(background);
			} else {
				System.out.println("Door Closed. Incorrect Code");
				pane.setBackground(background2);
			}
		});

		//Set the stage title
		primaryStage.setTitle("Digital Smart Door Lock");
		// Place the scene in the stage
		//Display the stage to console
		primaryStage.setScene(scene); 
		primaryStage.show(); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage

	}
	public static void main(String[] args) {
		launch(args);
	}
}
