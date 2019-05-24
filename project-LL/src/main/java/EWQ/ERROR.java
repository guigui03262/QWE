package EWQ;

import	javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.layout.AnchorPane;
import	javafx.stage.Stage;

public class ERROR extends Application	{
				@Override
				public	void	start(Stage	stage)	throws	Exception	{
					
					AnchorPane	pane	=	new	AnchorPane();
					pane.setPrefSize(100,	50);
					
					Alert dialogoErro = new Alert(Alert.AlertType.ERROR);
		            dialogoErro.setTitle("LOGIN ERRADO");
		            dialogoErro.showAndWait();

					Scene	scene	=	new	Scene(pane);
					stage.setScene(scene);
					stage.show();
					
				}
}