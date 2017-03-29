package sample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by alumniCurie09 on 29/03/2017.
 */
public class TreeBuilder {

    public static BinaryTree createTree(int[] integerList) {
        BinaryTree binaryTree = new BinaryTree();
        Arrays.stream(integerList).forEach(binaryTree::addNode);
        return binaryTree;
    }
}
