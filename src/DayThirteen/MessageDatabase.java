package DayThirteen;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {
    private static List<Message> messages = new ArrayList<>();


    public static void sendMessage(User u1, User u2, String text){
        messages.add(new Message(u1, u2, text));
    }
    public static List<Message> getMessages(){
        return messages;
    }
    public static void showDialog(User u1, User u2){
        for (Message i: messages) {
            if(i.getSender() == u1 && i.getRecipient() == u2){
                System.out.println(u1.getUsername() + ": " + i.getText());
            }
            if(i.getSender() == u2 && i.getRecipient() == u1){
                System.out.println(u2.getUsername() + ": " + i.getText());
            }
        }
    }
    public static void showDialogAlt(User u1, User u2){
        for (Message i: messages) {
            if(i.getSender() == u1 && i.getRecipient() == u2){
                System.out.println(i);
            }
            if(i.getSender() == u2 && i.getRecipient() == u1){
                System.out.println(i);
            }
        }
    }
}
