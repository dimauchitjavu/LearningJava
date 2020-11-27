package DayTen;

import java.awt.*;
import java.awt.Canvas;
import java.awt.Graphics;
import javax.swing.JFrame;

public class Drawing extends Canvas {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Drawing");
        Canvas canvas = new Drawing();
        canvas.setSize(900, 900);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
    }
    public void paint(Graphics g) {
        Node RootNode = new Node(20);
        RootNode.createAutoNode(14);
        RootNode.createAutoNode(23);
        RootNode.createAutoNode(11);
        RootNode.createAutoNode(16);
        RootNode.createAutoNode(23);
        RootNode.createAutoNode(22);
        RootNode.createAutoNode(27);
        RootNode.createAutoNode(24);
        RootNode.createAutoNode(150);
        RootNode.createAutoNode(15);
        RootNode.createAutoNode(18);
        RootNode.createAutoNode(5);
        RootNode.createAutoNode(8);
        RootNode.createAutoNode(8);
        Node.printTree(RootNode);
        Node.drawNodes(g,RootNode, 450, 100, 1);
    }
}
