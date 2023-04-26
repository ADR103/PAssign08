/**
 * File: KeyPadCustomPane.java
 * Class: CSCI 1302
 * Author: Amari Riley
 * Created on: April 25, 2023
 * Last Modified: April 26, 2023
 * Description: Expand your program from Assignment 7 to include user interaction while continuing to use the
KeyPadPane class
 */

package ch16;

import java.util.List;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.control.TextArea;
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
import javafx.scene.layout.GridPane;
import javafx.scene.layout.BorderPane;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class KeyPadCustomPane extends KeyPadPane {
	//Create a new textfield named code
	//Create a button named btEnter
	TextField code = new TextField();
	Button btEnter = new Button("Enter");
	StringBuilder text = new StringBuilder();

	public KeyPadCustomPane() {
		//Change the blank buttons to represent the star and pound signs
		//Edit the border color and background color of the enter button
		btnBlank1.setText("*");
		btnBlank2.setText("#");
		btEnter.setStyle("-fx-border-color: black; -fx-background-color: black");
		
		//Implement the font class to change the numbers to bolded Sans-serif font at the size of 16
		Font newFont = Font.font("Sans-serif", FontWeight.BOLD, 16);

		//Utilize a for loop to change the font of each number
		for (int i = 0; i < 12; i++) {
			listButtons.get(i).setFont(newFont);
		}
	}
}
		









