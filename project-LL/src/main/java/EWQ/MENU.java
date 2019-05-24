package EWQ;


import QWE.Main;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MENU extends Application	{
	
	private AnchorPane pane;
	private Button op1, op2, op3;
	private static Stage stage;
	
	@Override
	public void start(Stage stage) throws Exception {

		A();
		D();
		C();
		Scene scene = new Scene(pane);
		stage.setScene(scene);
		stage.setTitle("MENU AUCTION");
		stage.setResizable(false);
		stage.show();
		B();
		MENU.stage = stage;
       
	}
	
	
	private void A() {
		pane = new AnchorPane();
		pane.setPrefSize(800, 600);
		pane.setStyle("-fx-background-color:	linear-gradient(from	0%	0%	to	100%	100%,	green	0%,	silver	50%);");
		op1 = new Button("--PERFIL--");
		op2 = new Button("--INFORMACOES--");
		pane.getChildren().addAll(op1, op2);
	}

	private void B() {
		op1.setLayoutX((pane.getWidth() - op1.getWidth()) / 2);
		op1.setLayoutY(200);
		op2.setLayoutX((pane.getWidth() - op2.getWidth()) / 2);
		op2.setLayoutY(300);
	}
	
	private void C() {
	op1.setOnAction(new EventHandler<ActionEvent>() {
		public void handle(ActionEvent arg0) {
			try {
				new PERFIL().start(new Stage());
				MENU.stage.close();
			} catch (Exception e) {
				e.printStackTrace();}
		}
	});
	}
	private void D() {
		op2.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent arg0) {
				try {
					new TELA().start(new Stage());
					MENU.stage.close();
				} catch (Exception e) {
					e.printStackTrace();}
			}
		});
		}
}