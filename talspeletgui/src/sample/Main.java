package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;



public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception{
        HBox root= new HBox();
        primaryStage.setScene(new Scene(root, 500, 275));
        primaryStage.setTitle("The Number Game by Offlinus");

        Button play = new Button();
        play.setText("Play");

        Button exit = new Button();
        exit.setText("Exit");

        Button image = new Button();
        Image okImage = new Image(getClass().getResourceAsStream("KFC.png"));
        ImageView view = new ImageView(okImage);
        view.setFitHeight(100);
        image.setGraphic(view);

        root.getChildren().add(play);
        root.getChildren().add(image);
        root.getChildren().add(exit);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
