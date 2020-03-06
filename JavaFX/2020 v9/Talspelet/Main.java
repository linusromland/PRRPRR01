package Talspelet;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.util.Random;
import java.util.Scanner;


public class Main extends Application {

    private int difficulty = 0;
    private int correct = 1;
    private int guessnumber;
    private int theguess;
    private HBox interval = new HBox();
    private HBox difficultyview = new HBox();
    private HBox guessview = new HBox();
    private HBox root = new HBox();
    private HBox congrats = new HBox();



    @Override
    public void start(Stage primaryStage) throws Exception {

        setupIntervalView(primaryStage);

        setupDifficultyView(primaryStage);

        setupRootView(primaryStage);

        setupGuessView(primaryStage);

        setupCongratsView(primaryStage);


    }

    private void setupRootView(Stage primaryStage) {
        primaryStage.setScene(new Scene(root, 500, 300));
        primaryStage.setTitle("The Number Game by Offlinus");
        Button play = new Button();
        play.setText("Play");
        play.setMinSize(100, 40);
        play.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                primaryStage.setScene(new Scene(difficultyview, 500, 270));
            }
        });


        Button exit = new Button();
        exit.setText("Exit");
        exit.setMinSize(100, 40);
        exit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.exit(0);
            }
        });
        ImageView View1 = new ImageView();
        Image image1 = new Image("Talspelet/firstscene.png");
        View1.setImage(image1);
        View1.setFitWidth(400);
        View1.setFitHeight(175);

        BorderPane border = new BorderPane();
        border.setTop(View1);
        border.setLeft(play);
        border.setRight(exit);

        root.getChildren().add(border);

        primaryStage.show();
    }

    private void setupDifficultyView(Stage primaryStage) {

        Label label = new Label("What Difficulty?");
        Button Easy = new Button();
        Easy.setText("Easy (Unlimited Tries");
        Easy.setMinSize(70, 30);
        Easy.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                difficulty = 9999;
                primaryStage.setScene(new Scene(interval, 500, 270));

            }
        });
        Button Medium = new Button();
        Medium.setText("Medium (20 Tries)");
        Medium.setMinSize(70, 30);
        Medium.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                difficulty = 20;
                primaryStage.setScene(new Scene(interval, 500, 270));
            }
        });

        Button Hard = new Button();
        Hard.setText("Hard (10 Tries)");
        Hard.setMinSize(70, 30);
        Hard.setOnAction(event -> {
            difficulty = 10;
            primaryStage.setScene(new Scene(interval, 500, 270));

        });

        GridPane border = new GridPane();
        border.setVgap(3);
        border.setHgap(3);
        border.add(label, 2, 0);
        border.add(Easy, 1, 3);
        border.add(Medium, 2, 3);
        border.add(Hard, 3, 3);




        difficultyview.getChildren().add(border);



    }

    private void setupIntervalView(Stage primaryStage) {
        Label labelinterval = new Label("What Interval?");
        TextArea lowerinterval = new TextArea();
        Label lowtext = new Label("Lowest:");
        TextArea higherinterval = new TextArea();
        Label hightext = new Label("Highest:");
        lowerinterval.setPrefSize(20, 20);
        lowerinterval.setMaxHeight(15);
        higherinterval.setPrefSize(20, 20);
        higherinterval.setMaxHeight(15);
        Button submit = new Button();
        submit.setText("Set Interval");
        submit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                int low = Integer.parseInt(lowerinterval.getText());
                int high = Integer.parseInt(higherinterval.getText());
                int range = high - low;
                correct = new Random().nextInt(range) + low;
                primaryStage.setScene(new Scene(guessview, 500, 270));
            }
        });
        GridPane border = new GridPane();
        border.setVgap(3);
        border.setHgap(3);
        border.add(labelinterval, 2, 0);
        border.add(lowerinterval, 2, 2);
        border.add(lowtext, 1, 2);
        border.add(higherinterval, 4, 2);
        border.add(hightext, 3, 2);
        border.add(submit, 2, 4);

        interval.getChildren().add(border);
    }

    private void setupGuessView(Stage primaryStage){
            Label guesstext = new Label();
            Label respon = new Label();
            guesstext.setText("What is your guess? This is the " + guessnumber + " guess");
            guessnumber++;
            TextArea guesss = new TextArea();
            guesss.setPrefSize(20, 20);
            guesss.setMaxHeight(15);
            Button submit = new Button("Submit");
            submit.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    try { //checks so the answer is a int
                        theguess = Integer.parseInt(guesss.getText());
                    } catch (Exception j) {
                        respon.setText("I WANTED INT!");
                    }
                    if (guessnumber > difficulty) { //checks if you have any tries left
                        respon.setText("Oh no! Your tries are up! You dead now. Haha!");
                    } else { //asks what your guess is
                        guesstext.setText("What is your " + guessnumber + " guess?");
                        if (theguess < correct) { //checks if it is smaller or larger or the answer
                            respon.setText("The Number is bigger than that");
                            guesss.clear();

                        } else if (theguess > correct) {
                            respon.setText("The Number is smaller than that");
                            guesss.clear();

                        } else if (theguess == correct) {
                            primaryStage.setScene(new Scene(congrats, 500, 270));
                        }
                    }
                }


            });

        GridPane border = new GridPane();
        border.setVgap(3);
        border.setHgap(3);
        border.add(guesstext, 2, 0);
        border.add(guesss, 2, 2);
        border.add(respon, 3, 1);
        border.add(submit, 4, 2);


            guessview.getChildren().add(border);




    }

    private void setupCongratsView(Stage primaryStage){
        Label congratss = new Label("You WON! Congrats!");
        Button Playagain = new Button("Play Again");
        Playagain.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                primaryStage.setScene(new Scene(difficultyview, 500, 270));
            }
        });
        Button Exit = new Button("Exit");
        Exit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.exit(0);
            }
        });

        GridPane border = new GridPane();
        border.setVgap(3);
        border.setHgap(3);
        border.add(congratss, 2, 0);
        border.add(Playagain, 2, 2);
        border.add(Exit, 1, 2);


        congrats.getChildren().add(border);



    }

    public static void main(String[] args) {
        launch(args);
    }


}
