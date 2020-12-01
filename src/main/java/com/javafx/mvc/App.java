package com.javafx.mvc;

import com.javafx.mvc.model.Person;
import com.javafx.mvc.view.PersonPresenter;
import com.javafx.mvc.view.PersonView;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

	private static Scene scene;

	@Override
	public void start(Stage stage) {
		Person model = new Person();
		String dateFormat = "MM/dd/yyyy";
		PersonView view = new PersonView(model, dateFormat);
		// Must set the scene before creating the presenter that uses
		// the scene to listen for the focus change
		Scene scene = new Scene(view);

		PersonPresenter presenter = new PersonPresenter(model, view);
		view.setStyle("-fx-padding: 10;" + "-fx-border-style: solid inside;" + "-fx-border-width: 2;"
				+ "-fx-border-insets: 5;" + "-fx-border-radius: 5;" + "-fx-border-color: blue;");
		stage.setScene(scene);
		stage.setTitle("Person Management");
		stage.show();
	}

	public static void main(String[] args) {
		launch();
	}

}