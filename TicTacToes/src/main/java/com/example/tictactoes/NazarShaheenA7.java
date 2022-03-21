package com.example.tictactoes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

/*  This program is tic-tac-toe game using JavaFX application
 *  Sources referred are:
 *  https://www.youtube.com/watch?v=Uj8rPV6JbCE
 *  https://www.youtube.com/watch?v=YJjqZIyUIrM
 *  www.java2s.com
 *  geeksforgeeks.org
 */

public class NazarShaheenA7 extends Application {
    // Indicate which player has a turn, initially it is the X player
    private char Turn = 'X';

    // Create and initialize box
    private Box[][] box =  new Box[3][3];

    // Create and initialize a status label
    private Label statusLbl = new Label("X's turn to play");

    @Override // Override the start method in the Application class
    public void start(Stage mainStage) {
        // Pane to hold box
        GridPane pane = new GridPane();
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                pane.add(box[i][j] = new Box(), j, i);

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(pane);
        borderPane.setBottom(statusLbl);

        // Create a scene and place it in the stage
        Scene scene = new Scene(borderPane, 500, 400);

        mainStage.setTitle("TicTacToe"); // Set the stage title

        mainStage.setScene(scene); // Place the scene in the stage
        mainStage.show(); // Display the stage
    }

    /** Determine if the box are all occupied */
    public boolean isComplete() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (box[i][j].getToken() == ' ')
                    return false;

        return true;
    }

    /** Determine if the player with the specified token wins */
    public boolean playerWon(char token) {
        for (int i = 0; i < 3; i++)
            if (box[i][0].getToken() == token
                    && box[i][1].getToken() == token
                    && box[i][2].getToken() == token) {
                return true;
            }

        for (int j = 0; j < 3; j++)
            if (box[0][j].getToken() ==  token
                    && box[1][j].getToken() == token
                    && box[2][j].getToken() == token) {
                return true;
            }

        if (box[0][0].getToken() == token
                && box[1][1].getToken() == token
                && box[2][2].getToken() == token) {
            return true;
        }

        if (box[0][2].getToken() == token
                && box[1][1].getToken() == token
                && box[2][0].getToken() == token) {
            return true;
        }

        return false;
    }

    // An inner class for a box
    public class Box extends Pane {
        // Token used for this box
        private char token = ' ';

        public Box() {
            setStyle("-fx-border-color: black");
            this.setPrefSize(700, 700);
            this.setOnMouseClicked(e -> handleMouseClick());
        }

        /** Return token */
        public char getToken() {
            return token;
        }

        /** Set a new token */
        public void setToken(char c) {
            token = c;

            if (token == 'X') {
                Line line1 = new Line(10, 10,
                        this.getWidth() - 10, this.getHeight() - 10);
                line1.endXProperty().bind(this.widthProperty().subtract(10));
                line1.endYProperty().bind(this.heightProperty().subtract(10));
                Line line2 = new Line(10, this.getHeight() - 10,
                        this.getWidth() - 10, 10);
                line2.startYProperty().bind(
                        this.heightProperty().subtract(10));
                line2.endXProperty().bind(this.widthProperty().subtract(10));

                // Add the lines to the pane
                this.getChildren().addAll(line1, line2);
            }
            else if (token == 'O') {
                Ellipse ellipse = new Ellipse(this.getWidth() / 2,
                        this.getHeight() / 2, this.getWidth() / 2 - 10,
                        this.getHeight() / 2 - 10);
                ellipse.centerXProperty().bind(
                        this.widthProperty().divide(2));
                ellipse.centerYProperty().bind(
                        this.heightProperty().divide(2));
                ellipse.radiusXProperty().bind(
                        this.widthProperty().divide(2).subtract(10));
                ellipse.radiusYProperty().bind(
                        this.heightProperty().divide(2).subtract(10));
                ellipse.setStroke(Color.BLACK);
                ellipse.setFill(Color.WHITE);

                getChildren().add(ellipse); // Add the ellipse to the pane
            }
        }

        /* Handle a mouse click event */
        private void handleMouseClick() {
            // If box is empty and game is not over
            if (token == ' ' && Turn != ' ') {
                setToken(Turn); // Set token in the box

                // Check game status
                if (playerWon(Turn)) {
                    statusLbl.setText(Turn + " won! The game is over");
                    Turn = ' '; // Game is over
                }
                else if (isComplete()) {
                    statusLbl.setText("Draw! The game is over");
                    Turn = ' '; // Game is over
                }
                else {
                    // Change the turn
                    Turn = (Turn == 'X') ? 'O' : 'X';
                    // Display whose turn
                    statusLbl.setText(Turn + "'s turn");
                }
            }
        }
    }

    /**
     * The main method
     */
    public static void main(String[] args) {

        launch(args);
    }

}
