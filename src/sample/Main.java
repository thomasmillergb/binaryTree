package sample;

import javafx.application.Application;
import javafx.stage.Stage;

import java.util.Random;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        long limit = 10000000;
        int high = 900000000;
        int low = 1;
        int[] ints = new Random().ints(limit, low, high).toArray();

        BinaryTree tree = TreeBuilder.createTree(ints);
        tree.printHigherToLower();

    }


    public static void main(String[] args) {
        launch(args);
    }
}