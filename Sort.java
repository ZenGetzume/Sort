
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

	public class Sort extends Application {


	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		VBox vbox = new VBox();
		Scene scene = new Scene(vbox);
		String[] wishList = new String[10];
		TextField[] text = new TextField[10];
		Button btn = new Button("Submit");
		for (int i = 0; i < text.length; i++) {
			text[i] = new TextField("TextField " + (1 + 1));
			vbox.getChildren().add(text[i]);
		}
		vbox.getChildren().add(btn);
		btn.setOnAction(e -> {
			String b4sort = "\nBefore sort:\n";
			String afterSort = "\nAfter sort:\n";
			
		for (int i = 0; i < text.length; i++) {
			wishList[i] = text[i].getText();
			b4sort += (wishList[i]);	
		}
		SortArray.sort(wishList);
		
		for (int i = 0; i<text.length; i++) {
			afterSort += wishList[i] + "\t";
		}
		Alert alert = new Alert(AlertType.INFORMATION);
			alert.setContentText(b4sort + afterSort);
			alert.showAndWait();
			});
		primaryStage.setScene(scene);
		primaryStage.show();
		}
		}
						















