package EWQ;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class TELA extends Application{
	public void start(Stage stage) throws Exception {
		
		
		AnchorPane pane = new AnchorPane();
		pane.setPrefSize(800, 600);
		pane.setStyle("-fx-background-color:	linear-gradient(from	0%	0%	to	100%	100%,	green	0%,	silver	50%);");
		
		Scene scene = new Scene(pane);
		stage.setScene(scene);
		stage.setTitle("INFORMACAO AUCTION");
		stage.setResizable(false);

		
		TextArea textArea = new TextArea();
		textArea.setPrefSize(780, 390);
		textArea.setLayoutX(45);
		textArea.setFont(Font.font ("Verdana", 15));
		textArea.setText("O que � e como funciona um leil�o?" + "\n" 
				+ "Apesar ser de uma pr�tica antiga, o leil�o ainda � um assunto que gera muitas d�vidas e levanta pol�micas."+ "\n"
				+ "Por isso, � importante abordar o tema com muita transpar�ncia. "+ "\n"
				+ "Primeiro � importante entender que o leil�o � uma venda p�blica, aberto para "+ "\n"
				+ "qualquer pessoa participar e os mais diversos itens podem ser leiloados."+ "\n"
				+ "Desde ve�culos e im�veis, at� m�veis, eletrodom�sticos, eletr�nicos, etc. "+ "\n"
				+ "Os produtos ou os bens s�o encaminhados pelo vendedor para que o leiloeiro realize a venda. "+ "\n"
				+ "Pode ser leiloado tanto um �nico bem, como um carro, como um lote com v�rios itens, como um "+ "\n"
				+ "conjunto de m�veis de escrit�rio e um computador.");
				
		pane.getChildren().addAll(textArea);
		stage.show();
	}


}
