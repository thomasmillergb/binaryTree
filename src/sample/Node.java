package sample;

import java.util.Optional;

/**
 * Created by alumniCurie09 on 29/03/2017.
 */
public class Node {
    private Optional<Node> parent;
    private Node left;
    private Node right;
    private int value;

    public Node(int value) {
        this.parent = Optional.empty();
        this.value = value;
    }

    public Node(int value, Node parent) {
        this.parent = Optional.of(parent);
        this.value = value;
    }

    public Optional<Node> getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = Optional.of(parent);
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public int getValue() {
        return value;
    }
}
