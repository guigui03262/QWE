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
		textArea.setText("O que é e como funciona um leilão?" + "\n" 
				+ "Apesar ser de uma prática antiga, o leilão ainda é um assunto que gera muitas dúvidas e levanta polêmicas."+ "\n"
				+ "Por isso, é importante abordar o tema com muita transparência. "+ "\n"
				+ "Primeiro é importante entender que o leilão é uma venda pública, aberto para "+ "\n"
				+ "qualquer pessoa participar e os mais diversos itens podem ser leiloados."+ "\n"
				+ "Desde veículos e imóveis, até móveis, eletrodomésticos, eletrônicos, etc. "+ "\n"
				+ "Os produtos ou os bens são encaminhados pelo vendedor para que o leiloeiro realize a venda. "+ "\n"
				+ "Pode ser leiloado tanto um único bem, como um carro, como um lote com vários itens, como um "+ "\n"
				+ "conjunto de móveis de escritório e um computador.");
				
		pane.getChildren().addAll(textArea);
		stage.show();
	}


}
