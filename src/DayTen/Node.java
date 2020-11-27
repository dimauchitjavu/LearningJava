package DayTen;

public class Node {
    private Node LeftNode;
    private Node RightNode;
    private double valueOfNode;

    public Node(double valueOfNode) {
        LeftNode = null;
        RightNode = null;
        this.valueOfNode = valueOfNode;
    }

    public static void printTree(Node RootNode){
        if (RootNode == null) {
            return;
        }
        RootNode.printTree(RootNode.LeftNode);
        System.out.println(RootNode.valueOfNode);
        RootNode.printTree(RootNode.RightNode);
    }
    public void createAutoNode(int valueOfNode){
        addNode(this, valueOfNode);
    }
    private Node addNode(Node TheNode, double value){
        if(TheNode == null){
            return new Node(value);
        }
        if(TheNode.valueOfNode > value){
            TheNode.LeftNode = addNode(TheNode.LeftNode, value);
        }else if(TheNode.valueOfNode < value){
            TheNode.RightNode = addNode(TheNode.RightNode, value);
        }else {
            return TheNode;
        }
        return TheNode;
    }
}
