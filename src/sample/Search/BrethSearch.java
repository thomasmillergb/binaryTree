package sample.Search;

import sample.BinaryTree;
import sample.Node;

import java.util.LinkedList;
import java.util.Optional;
import java.util.Queue;

/**
 * @author Thomas
 *         Created by Thomas on 31/03/2017.
 */
public class BrethSearch implements Search {

    @Override
    public void excute(BinaryTree binaryTree, int searchValue) {
        Queue<Node> nodeQue = new LinkedList<>();
        search(binaryTree.getHead(),nodeQue, searchValue);
    }

    private Optional<Node> search(Node node, Queue<Node> nodeQue, int searchValue){
        System.out.println(node.getValue());
        if(node.getValue() == searchValue){
            return Optional.of(node);
        }
        if(node.getLeft() != null){
            nodeQue.add(node.getLeft());
        }
        if(node.getRight() != null){
            nodeQue.add(node.getRight());
        }
        if(!nodeQue.isEmpty()) {
            return search(nodeQue.poll(), nodeQue, searchValue);
        }
        else{
            return Optional.empty();
        }

    }
}
