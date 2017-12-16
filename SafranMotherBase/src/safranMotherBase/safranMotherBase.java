package safranMotherBase;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class safranMotherBase extends Application {

	private Stage primaryStage;
	private BorderPane rootLayout;
	
	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Safran Mother Base");
		
		initRootLayout();
		
		showMainMenu();
	}

	private void initRootLayout() {
		try {
			// load root layout
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(safranMotherBase.class.getResource("/safranMotherBaseView/RootLayout.fxml"));
			rootLayout = (BorderPane) loader.load();
			
			// show the root layout
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
		}catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	private void showMainMenu() {
		try {
			// load main menu
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(safranMotherBase.class.getResource("/safranMotherBaseView/MainMenu.fxml"));
			AnchorPane mainMenu = (AnchorPane) loader.load();
			
			// set the menu inside the root layout
			rootLayout.setCenter(mainMenu);
			
		}catch (IOException e)
		{
			e.printStackTrace();
		}
		
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}

	public Stage getPrimaryStage() {
		return primaryStage;
	}
}
