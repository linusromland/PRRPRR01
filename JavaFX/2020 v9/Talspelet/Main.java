package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {

        //interval scence
        HBox interval = new HBox();

        Label labelinterval = new Label("What Interval?");

        TextArea lowerinterval = new TextArea();
        TextArea higherinterval = new TextArea();
        lowerinterval.setPrefWidth(20);
        lowerinterval.setMinHeight(20);
        higherinterval.setPrefWidth(20);
        higherinterval.setMinHeight(20);



        interval.getChildren().add(labelinterval);
        interval.getChildren().add(lowerinterval);
        interval.getChildren().add(higherinterval);



        //difficulty scence
        int difficulty = 0;
        HBox play2 = new HBox();

        Label label = new Label("What Difficulty?");
        Button Easy = new Button();
        Easy.setText("Easy (Unlimited Tries");
        Easy.setMinSize(70, 30);
        Easy.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                primaryStage.setScene(new Scene(interval, 500, 270));
            }
        });

        Button Medium = new Button();
        Medium.setText("Medium (20 Tries)");
        Medium.setMinSize(70, 30);
        Easy.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                primaryStage.setScene(new Scene(interval, 500, 270));
            }
        });

        Button Hard = new Button();
        Hard.setText("Hard (10 Tries)");
        Hard.setMinSize(70, 30);
        Easy.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                primaryStage.setScene(new Scene(interval, 500, 270));
            }
        });

        play2.getChildren().add(label);
        play2.getChildren().add(Easy);
        play2.getChildren().add(Medium);
        play2.getChildren().add(Hard);

        //default page
        HBox root = new HBox();
        primaryStage.setScene(new Scene(root, 500, 275));
        primaryStage.setTitle("The Number Game by Offlinus");

        Button play = new Button();
        play.setText("Play");
        play.setMinSize(70, 30);
        play.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                primaryStage.setScene(new Scene(play2, 500, 270));
            }
        });


        Button exit = new Button();
        exit.setText("Exit");
        exit.setMinSize(70, 30);
        exit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

            }
        });


        root.getChildren().add(play);
        root.getChildren().add(exit);

        primaryStage.show();


    }

    public static void main(String[] args) {
        launch(args);
    }

}
