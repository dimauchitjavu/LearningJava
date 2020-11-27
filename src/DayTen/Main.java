package DayTen;

public class Main {
    public static void main(String[] args) {
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
    }
}
