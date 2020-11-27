package DayTen;
import java.awt.*;
import java.util.ArrayList;

public class Node {
    Node LeftNode;
    Node RightNode;
    double valueOfNode;

    public Node(double valueOfNode) {
        LeftNode = null;
        RightNode = null;
        this.valueOfNode = valueOfNode;
    }
    public static void drawNodes(Graphics g,Node RootNode, int x, int y, double multiplier){
        if (RootNode == null) {
            return;
        }
        g.setColor(Color.GRAY);
        int distance = (int) (150*multiplier);
        if(RootNode.LeftNode != null){
            g.drawLine(x-distance,y+30,x,y);
        }
        if(RootNode.RightNode != null){
            g.drawLine(x+distance,y+30,x,y);
        }
        g.setColor(Color.red);

        g.drawString(String.valueOf(RootNode.valueOfNode),x, y);
        RootNode.drawNodes(g,RootNode.LeftNode,x-distance,y+30, 2*multiplier/5);
        RootNode.drawNodes(g,RootNode.RightNode,x+distance,y+30,2*multiplier/5);
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
        }
        return TheNode;
    }
}

