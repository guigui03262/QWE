package EWQ;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class LLL extends Application {

	private AnchorPane pane;
	private Button bt1, AV;
	public TextField tx, tx2, tx3;
	private Label LB1, LB2;
	static Stage stage;
	
	
	public void start(Stage stage) throws Exception {

		pane = new AnchorPane();
		pane.setPrefSize(800, 600);
		pane.setStyle("-fx-background-color:	linear-gradient(from	0%	0%	to	100%	100%,	green	0%,	silver	50%);");
		
		
		tx = new TextField();
		tx.setPromptText("NOME DO LEILAO");
		tx.setLayoutX((pane.getWidth() - tx.getWidth()) / 2);
		tx.setLayoutY(50);
		
		tx2 = new TextField();
		tx2.setPromptText("DIA em 00/00/0000");
		tx2.setLayoutX((pane.getWidth() - tx.getWidth()) / 2);
		tx2.setLayoutY(100);
		
		tx3 = new TextField();
		tx3.setPromptText("Valor Inicial R$");
		tx3.setLayoutX((pane.getWidth() - tx.getWidth()) / 2);
		tx3.setLayoutY(200);
		
		AV = new Button("VOLTAR");
		AV.setLayoutX((pane.getWidth() - AV.getWidth()) / 2);
		AV.setLayoutY(400);
		
		bt1 = new Button("Clique Para Confirmar");
		bt1.setLayoutX((pane.getWidth() - bt1.getWidth()) / 2);
		bt1.setLayoutY(300);
		
		
		LB2 = new Label("Leilao");
		LB2.setFont(Font.font ("Verdana", 40));
		LB2.setLayoutX((pane.getWidth() - bt1.getWidth()) / 2);
		LB2.setLayoutY(1);
		
		pane.getChildren().addAll(bt1, tx, tx2, tx3, LB2, AV);
	
		            
		
		
		

		C();
		Scene scene = new Scene(pane);
		stage.setScene(scene);
		stage.setTitle("LLL AUCTION");
		stage.setResizable(false);
		stage.show();
		PERFIL.stage = stage;
       
	}
	
	private void C() {
		AV.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent arg0) {
				try {
					new MENU().start(new Stage());
					LLL.stage.close();
				} catch (Exception e) {
					e.printStackTrace();}
			}
		});
		}
}
