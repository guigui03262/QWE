package QWE;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


import EWQ.ERROR;
import EWQ.MENU;


public class Main extends Application {

	private AnchorPane pane;
	private TextField txLogin;
	private PasswordField txSenha;
	private Button btEntrar, btSair;
	private static Stage stage;
	
	@Override
	public void start(Stage stage) throws Exception {
		initComponents();
		initListeners();
		Scene scene = new Scene(pane);
		stage.setScene(scene);
		stage.setTitle("LOGIN AUCTION");
		stage.setResizable(false);
		stage.show();
		initLayout();
		Main.stage = stage;
       
	}

	private void initLayout() {
		txLogin.setLayoutX((pane.getWidth() - txLogin.getWidth()) / 2);
		txLogin.setLayoutY(50);
		txSenha.setLayoutX((pane.getWidth() - txSenha.getWidth()) / 2);
		txSenha.setLayoutY(100);
		btEntrar.setLayoutX((pane.getWidth() - btEntrar.getWidth()) / 2);
		btEntrar.setLayoutY(150);
		btSair.setLayoutX((pane.getWidth() - btSair.getWidth()) / 2);
		btSair.setLayoutY(200);
	}

	private void initComponents() {
		pane = new AnchorPane();
		pane.setPrefSize(400, 300);
		pane.setStyle("-fx-background-color:	linear-gradient(from	0%	0%	to	100%	100%,	green	0%,	silver	50%);");
		txLogin = new TextField();
		txLogin.setPromptText("Digite seu login...");
		txSenha = new PasswordField();
		txSenha.setPromptText("Digite sua senha...");
		btEntrar = new Button("Entrar");
		btEntrar.getStyleClass().add("btEntrar");
		btSair = new Button("Sair");
		btSair.getStyleClass().add("btSair");
		pane.getChildren().addAll(txLogin, txSenha, btEntrar, btSair);
	}
	
	private void initListeners() {
		btSair.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent arg0) {
				System.exit(0);
			}
		});
		
		btEntrar.setOnAction(new EventHandler<ActionEvent>() {	
			public void handle(ActionEvent event) {
				if (txLogin.getText().equals("admin") && txSenha.getText().equals("admin")) {
					try {
						new MENU().start(new Stage());
						Main.stage.close();
					} catch (Exception e) {
						e.printStackTrace();
					}
				} else {
					try {
						new ERROR().start(new Stage());
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		});
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}