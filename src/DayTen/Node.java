package DayTen;

public class Node {
    public Node(double valueOfNode) {
        LeftNode = null;
        RightNode = null;
        this.valueOfNode = valueOfNode;
    }

    Node LeftNode;
    Node RightNode;

    public double getValueOfNode() {
        return valueOfNode;
    }

    double valueOfNode;
    public void printTree(Node TheNode){
        if (TheNode != null) {
            TheNode.printTree(TheNode.LeftNode);
            System.out.println(TheNode.valueOfNode);
            TheNode.printTree(TheNode.RightNode);
        }
    }
    public void createAutoNode(int valueOfNode){
        addNode(this, valueOfNode);
    }
    public Node addNode(Node TheNode, double value){
        if(TheNode == null){
            return new Node(value);
        }
        if(TheNode.getValueOfNode() > value){
            TheNode.LeftNode = addNode(TheNode.LeftNode, value);
        }else if(TheNode.getValueOfNode() < value){
            TheNode.RightNode = addNode(TheNode.RightNode, value);
        }else {
            return TheNode;
        }
        return TheNode;
    }
}
