package sample;

import javafx.application.Application;
import javafx.stage.Stage;
import sample.Search.BrethSearch;
import sample.Search.Search;

import java.util.Random;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        long limit = 10666;
        int high = 100;
        int low = 1;
        int[] ints = new Random().ints(limit, low, high).toArray();

        BinaryTree tree = TreeBuilder.createTree(ints);
        Search search = new BrethSearch();
        search.excute(tree);
        System.out.println("----------------");


    }


    public static void main(String[] args) {
        launch(args);
    }
}
