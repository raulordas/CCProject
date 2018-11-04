package application;
	
import java.io.IOException;
import controlador.Control;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;

public class Main extends Application {
	private AnchorPane panelInicio;
	private AnchorPane panelAccion;
	private Stage ventanaContenedora;
	
	@Override
	public void start(Stage stage) {
		this.ventanaContenedora = stage;

		FXMLLoader loader = new FXMLLoader(getClass().getResource("/vistas/Layouts.fxml"));
		FXMLLoader loader2 = new FXMLLoader(getClass().getResource("/vistas/VentanaLive.fxml"));
		
		try {
			
			//Carga de Paneles
			panelInicio = (AnchorPane) loader.load();
			panelAccion = (AnchorPane) loader2.load();
			
			//Constructor del controlador
			Control c = loader.getController();
			c.main(ventanaContenedora, panelAccion);
			
			//Inicializamos y lanzamos la aplicación
			ventanaContenedora.setTitle("CC Channel");
			ventanaContenedora.setScene(new Scene(panelInicio));
			ventanaContenedora.centerOnScreen();
			ventanaContenedora.show();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
