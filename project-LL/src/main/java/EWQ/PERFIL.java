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

public class PERFIL extends Application {

	private AnchorPane pane;
	private Button bt1, AV;
	public TextField tx;
	private Label LB1, LB2;
	private static Stage stage;
	
	
	public void start(Stage stage) throws Exception {

		pane = new AnchorPane();
		pane.setPrefSize(800, 600);
		pane.setStyle("-fx-background-color:	linear-gradient(from	0%	0%	to	100%	100%,	green	0%,	silver	50%);");
		
		
		tx = new TextField();
		tx.setPromptText("DIGITE...");
		tx.setLayoutX((pane.getWidth() - tx.getWidth()) / 2);
		tx.setLayoutY(50);
		
		String nome = tx.getText();
		
		AV = new Button("VOLTAR");
		AV.setLayoutX((pane.getWidth() - AV.getWidth()) / 2);
		AV.setLayoutY(400);
		
		bt1 = new Button("Clique Para Confirmar");
		bt1.setLayoutX((pane.getWidth() - bt1.getWidth()) / 2);
		bt1.setLayoutY(100);
		
		LB1 = new Label(nome);
		LB1.setFont(Font.font ("Verdana", 40));
		LB1.setLayoutX((pane.getWidth() - bt1.getWidth()) / 2);
		LB1.setLayoutY(220);
		
		LB2 = new Label("COMO GOSTARIA DE SER CHAMADO");
		LB2.setFont(Font.font ("Verdana", 40));
		LB2.setLayoutX((pane.getWidth() - bt1.getWidth()) / 2);
		LB2.setLayoutY(1);
		
		pane.getChildren().addAll(bt1, tx, LB1,LB2,AV);
	
		
		bt1.setOnAction(e -> mudarnome(tx.getText()));                
		
		
		

		C();
		Scene scene = new Scene(pane);
		stage.setScene(scene);
		stage.setTitle("PErfil AUCTION");
		stage.setResizable(false);
		stage.show();
		PERFIL.stage = stage;
       
	}
	
	public void mudarnome(String nome) {
		LB1.setText(nome);

			}
	
	private void C() {
		AV.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent arg0) {
				try {
					new MENU().start(new Stage());
					PERFIL.stage.close();
				} catch (Exception e) {
					e.printStackTrace();}
			}
		});
		}
}
