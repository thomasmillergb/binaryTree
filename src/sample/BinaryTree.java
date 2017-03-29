package sample;

import java.util.Optional;

/**
 * Created by alumniCurie09 on 29/03/2017.
 */
public class BinaryTree {
    private Node head;

    public BinaryTree() {
    }

    public void addNode(int value) {
        if (head == null) {
            head = new Node(value);
        } else {
            addNode(value, head);
        }

    }

    public void addNode(int value, Node currentNode) {
        addNode(value, currentNode, null);
    }

    public void addNode(int value, Node currentNode, Node parentNode) {
        if (currentNode == null) {
            Node newNode = new Node(value, parentNode);
            if (value < parentNode.getValue()) {
                parentNode.setLeft(newNode);
            } else {
                parentNode.setRight(newNode);
            }
        } else if (value < currentNode.getValue()) {
            addNode(value, currentNode.getLeft(), currentNode);
        } else {
            addNode(value, currentNode.getRight(), currentNode);
        }
    }

    public void printLowerToHigher() {
        printLowerToHigher(head);
    }

    public void printHigherToLower() {
        printHigherToLower(head);
    }

    public void printLowerToHigher(Node currentNode) {

        if (currentNode.getLeft() == null && currentNode.getRight() != null) {
            System.out.println(currentNode.getValue());
            printLowerToHigher(currentNode.getRight());
        } else if (currentNode.getLeft() != null) {
            printLowerToHigher(currentNode.getLeft());
            System.out.println(currentNode.getValue());
            if (currentNode.getRight() != null) {
                printLowerToHigher(currentNode.getRight());
            }
        } else if (currentNode.getLeft() == null && currentNode.getRight() == null) {
            System.out.println(currentNode.getValue());
        }
    }

    public void printHigherToLower(Node currentNode) {

        if (currentNode.getRight() == null && currentNode.getLeft() != null) {
            System.out.println(currentNode.getValue());
            printHigherToLower(currentNode.getLeft());
        } else if (currentNode.getRight() != null) {
            printHigherToLower(currentNode.getRight());
            System.out.println(currentNode.getValue());
            if (currentNode.getLeft() != null) {
                printHigherToLower(currentNode.getLeft());
            }
        } else if (currentNode.getRight() == null && currentNode.getLeft() == null) {
            System.out.println(currentNode.getValue());
        }
    }

    //    public void printEveryThingbelow(int value) {
//        Optional<Node> node = printEveryThingbelow(value, head);
//        if (node.isPresent()) {
//            Node node1 = node.get();
//            printLowerToHigher(node1.getLeft());
//            if (node1.getRight().getValue() <= value) {
//                System.out.println(node1.getValue());
//                printLowerToHigher(node1.getRight());
//            }
//
//        }
//    }
//
//    public Optional<Node> printEveryThingbelow(int value, Node currentNode) {
//        if (currentNode.getValue() <= value) {
//            return Optional.of(currentNode);
//        } else if (currentNode.getRight() != null) {
//            return printEveryThingbelow(value, currentNode.getRight());
//        } else
//            return Optional.empty();
//
//  }
    public void printEveryThingbelow(int value) {
        printEveryThingbelow(value, head);
    }

    public void printEveryThingbelow(int value, Node currentNode) {

        if (currentNode.getLeft() == null && currentNode.getRight() != null && value >= currentNode.getValue()) {
            System.out.println(currentNode.getValue());
            if(value >= currentNode.getRight().getValue()) {
                printEveryThingbelow(value, currentNode.getRight());
            }
        } else if (currentNode.getLeft() != null) {
            printEveryThingbelow(value, currentNode.getLeft());
            if (value > currentNode.getValue()) {
                System.out.println(currentNode.getValue());
                if (currentNode.getRight() != null && value >= currentNode.getRight().getValue()) {
                    printEveryThingbelow(value, currentNode.getRight());
                }
            }
        } else if (currentNode.getLeft() == null && currentNode.getRight() == null && value == currentNode.getValue()) {
            System.out.println(currentNode.getValue());
        }
    }
}
