package Tree;

public class Main {
    public static int postToOrder(Node root) {
        if(root.getLeftChild() != null) {
            postToOrder(root.getLeftChild());
        }

        if(root.getRightChild() != null) {
            postToOrder(root.getRightChild());
        }

        switch (root.getValue()) {
            case '+':
                root.setValue(root.getLeftChild().getValue() + root.getRightChild().getValue());
                break;
            case '-':
                root.setValue(root.getLeftChild().getValue() - root.getRightChild().getValue());
                break;
            case '*':
                root.setValue(root.getLeftChild().getValue() * root.getRightChild().getValue());
                break;
            case '/':
                root.setValue(root.getLeftChild().getValue() / root.getRightChild().getValue());
                break;
        }
        return root.getValue();
    }

    public static Node createRoot(int value) {
        return new Node(1, value);
    }

    public static void expandExternalNode(Node node) {
        Node leftNode = new Node(2*node.getKey(), 'x');
        leftNode.setParent(node);
        Node rightNode = new Node((2*node.getKey()) +1, 'x');
        rightNode.setParent(node);

        node.setLeftChild(leftNode);
        node.setRightChild(rightNode);
    }

    public static void main(String[] args) {
        Node root = createRoot('-');

        expandExternalNode(root);
        root.getLeftChild().setValue('/');
        root.getRightChild().setValue('+');
        Node node2 = root.getLeftChild();
        Node node3 = root.getRightChild();

        expandExternalNode(node2);
        node2.getLeftChild().setValue('*');
        node2.getRightChild().setValue('+');
        Node node4 = node2.getLeftChild();
        Node node5 = node2.getRightChild();

        expandExternalNode(node3);
        node3.getLeftChild().setValue('*');
        node3.getRightChild().setValue(6);
        Node node6 = node3.getLeftChild();
        Node node7 = node3.getRightChild();

        expandExternalNode(node4);
        node4.getLeftChild().setValue('+');
        node4.getRightChild().setValue(3);
        Node node8 = node4.getLeftChild();
        Node node9 = node4.getRightChild();

        expandExternalNode(node5);
        node5.getLeftChild().setValue('-');
        node5.getRightChild().setValue(2);
        Node node10 = node5.getLeftChild();
        Node node11 = node5.getRightChild();

        expandExternalNode(node6);
        node6.getLeftChild().setValue(3);
        node6.getRightChild().setValue('-');
        Node node12 = node6.getLeftChild();
        Node node13 = node6.getRightChild();

        expandExternalNode(node8);
        node8.getLeftChild().setValue(3);
        node8.getRightChild().setValue(1);
        Node node16 = node8.getLeftChild();
        Node node17 = node8.getRightChild();

        expandExternalNode(node10);
        node10.getLeftChild().setValue(9);
        node10.getRightChild().setValue(5);
        Node node20 = node10.getLeftChild();
        Node node21 = node10.getRightChild();

        expandExternalNode(node13);
        node13.getLeftChild().setValue(7);
        node13.getRightChild().setValue(4);
        Node node26 = node13.getLeftChild();
        Node node27 = node13.getRightChild();


        Node[] arrayBaseN = {null, root, node2, node3, node4, node5, node6, node7, node8, node9, node10, node11, node12, node13, null, null, node16, node17, null, null, node20, node21, null, null, null, null, node26, node27, null, null, null, null};
        System.out.println(postToOrder(arrayBaseN[1]));
    }
}
