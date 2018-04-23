import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.Pos;
import javafx.event.*;

public class SwingCounter extends Application {
	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage stage) {
		stage.setTitle("Swing Counter");
		stage.setWidth(350);
		stage.setHeight(150);

		HBox pane = new HBox();
		Scene scene = new Scene(pane);
		stage.setScene(scene);

		pane.setPadding(new Inserts(20));
		pane.setSpacing(10);
		pane.getChildren().add(new Label("Counter"));
		pane.getChildren().add(new TextField());
		pane.getChildren().add(new Button("Count"));	

		stage.show();
	}
}