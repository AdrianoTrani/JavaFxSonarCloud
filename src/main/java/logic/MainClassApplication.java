package logic;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainClassApplication extends Application{
	//una semplice variabile
	Integer number = 0;
	
	//Oggetti grafici
	VBox root;
	HBox row1;
	HBox row2;
	
	Button btnAdd;
	Button btnSub;
	
	Label label01;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		
		//istanzia i componenti grafici
		label01 = new Label(String.valueOf(number));
				
		root = new VBox();
		row1 = new HBox();
		row2 = new HBox();
				
		btnAdd = new Button("ADD");
		btnSub = new Button("SUB");
		
		//Scena da visualizzare
		Scene sceneTest01 = new Scene(root, 100, 100);
		primaryStage.setScene(sceneTest01);
		

		//<eventuale> Inizializzazione grafica iniziale
		
		
		//EVENT HANDLER DEL BUTTON ADD
		btnAdd.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {	
			//incrementa il valore nella label
				number++;
				label01.setText(String.valueOf(number));
			}
		});
		
		//EVENT HANDLER DEL BUTTON SUB
		btnSub.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent event) {	
			//incrementa il valore nella label
				number--;
				label01.setText(String.valueOf(number));
			}
		});
		
		//Assembla i componenti grafici
		row1.getChildren().addAll(label01);
		row2.getChildren().addAll(btnAdd,btnSub);

		root.getChildren().addAll(row1,row2);
		
		//mostra lo stage creato
		primaryStage.show();
	}
	
}
