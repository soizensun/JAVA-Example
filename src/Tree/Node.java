package Tree;

public class Node {
    private int key;
    private int value;
    private Node parent;
    private Node leftChild;
    private Node rightChild;

    public Node(int key, int value) {
        this.key = key;
        this.value = value;
        this.parent = null;
        this.leftChild = null;
        this.rightChild = null;
    }

    public int getKey() {
        return key;
    }
    public int getValue() {
        return value;
    }
    public Node getParent() {
        return parent;
    }
    public Node getLeftChild() {
        return leftChild;
    }
    public Node getRightChild() {
        return rightChild;
    }
    public void setValue(int value) {
        this.value = value;
    }
    public void setParent(Node parent) {
        this.parent = parent;
    }
    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }
    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }
}
