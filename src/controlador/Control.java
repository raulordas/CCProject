package controlador;

import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Control {
	
	@FXML
	private Stage ventanaContenedora;
	
	@FXML
	private AnchorPane panelAccion;
	
	@FXML
	private Button btnDie;
	
	public Control() {
	}
	
	public void main(Stage ventanaContenedora, AnchorPane panelAccion) {
		this.ventanaContenedora = ventanaContenedora;
		this.panelAccion = panelAccion;
	}
	
	public void initialize() {
		System.out.println("HOLA");
		
	}
	
	public void pulsarBotonDie() {
		ventanaContenedora.close();
	}
	
	/*
	 * Conserva el stage pero le pasa un nuevo AnchorPane
	 * Le asigna el tamaño que tuviera el stage justo antes de
	 * iniciar la nueva escena
	 */
	public void pulsarBotonLive() {
		double w  = ventanaContenedora.getWidth();
		double h = ventanaContenedora.getHeight();
		
		ventanaContenedora.setWidth(w);
		ventanaContenedora.setHeight(h);
		ventanaContenedora.setScene(new Scene(panelAccion));
	}
}