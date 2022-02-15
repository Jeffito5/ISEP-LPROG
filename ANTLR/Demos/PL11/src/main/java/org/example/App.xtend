package org.example;

import javafx.application.Application
import javafx.scene.Scene
import javafx.scene.control.Label
import javafx.stage.Stage

class App extends Application {

	def static void main(String[] args) {
		launch(args)
	}

	override start(Stage primaryStage) throws Exception {
		val scene = new Scene(new Label("Hello World"), 1200, 600)
		primaryStage.setOnCloseRequest[System.exit(0)]
		primaryStage.setScene(scene)
		primaryStage.show()
	}

}
