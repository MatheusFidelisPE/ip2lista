package questao4;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Questao4a extends Application {

	TextArea tf; 
	Label response;
	
	public void start(Stage primaryStage) throws Exception {
		
		primaryStage.setTitle("Contador de caracteres");
		
		tf = new TextArea();
		tf.setPromptText("Meu nome é PI");
		
		Button btn = new Button("Contar");
		Label texto = new Label("Texto: ");
		Label quantidadeDeLetras = new Label("O texto tem 0 caracteres");
		
		HBox boxtexto = new HBox();
		HBox boxBotao = new HBox();
		VBox boxPrincipal = new VBox();
		
		tf.maxWidth(300);
		tf.maxHeight(175);
		
		boxtexto.getChildren().add(texto);
		boxtexto.getChildren().add(tf);
		boxtexto.setSpacing(10);
		boxtexto.setAlignment(Pos.CENTER);
	
		
		boxBotao.getChildren().add(btn);
		boxBotao.setAlignment(Pos.CENTER);
		
		boxPrincipal.getChildren().add(boxtexto);
		boxPrincipal.getChildren().add(boxBotao);
		boxPrincipal.setAlignment(Pos.CENTER);
		boxPrincipal.setSpacing(20);
		boxPrincipal.getChildren().add(quantidadeDeLetras);
		
		Scene unicaCena = new Scene(boxPrincipal, 500,250);
		primaryStage.setScene(unicaCena);
		primaryStage.show();
		
		btn.setOnAction(e -> quantidadeDeLetras.setText("O texto tem "  + Integer.toString(tf.getText().replace(" ", "").length()) + " caracteres."));
		
		
	}	
	
	public static void main(String[] args) {
		launch(args);
	}
}
