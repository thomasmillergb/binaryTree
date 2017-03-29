package sample;

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
            printLowerToHigher(currentNode.getRight());
        } else if (currentNode.getLeft() != null) {
            printLowerToHigher(currentNode.getLeft());
            if(currentNode.getRight() != null) {
                printLowerToHigher(currentNode.getRight());
            }
        } else if (currentNode.getLeft() == null && currentNode.getRight() == null) {
            System.out.println(currentNode.getValue());
        }
    }
    public void printHigherToLower(Node currentNode) {

        if (currentNode.getRight() == null && currentNode.getLeft() != null) {
            printHigherToLower(currentNode.getLeft());
        } else if (currentNode.getRight() != null) {
            printHigherToLower(currentNode.getRight());
            if(currentNode.getLeft() != null) {
                printHigherToLower(currentNode.getLeft());
            }
        } else if (currentNode.getRight() == null && currentNode.getLeft() == null) {
            System.out.println(currentNode.getValue());
        }
    }

}
