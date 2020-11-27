package DayTen;

public class Main {
    public static void main(String[] args) {
        Node NodeOne = new Node(20);
        NodeOne.createAutoNode(14);
        NodeOne.createAutoNode(23);
        NodeOne.createAutoNode(11);
        NodeOne.createAutoNode(16);
        NodeOne.createAutoNode(23);
        NodeOne.createAutoNode(22);
        NodeOne.createAutoNode(27);
        NodeOne.createAutoNode(24);
        NodeOne.createAutoNode(15);
        NodeOne.createAutoNode(18);
        NodeOne.createAutoNode(5);
        NodeOne.createAutoNode(8);
        NodeOne.printTree(NodeOne);
    }
}
