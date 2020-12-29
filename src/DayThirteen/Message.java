package DayThirteen;

import java.sql.Timestamp;
import java.util.Date;

public class Message {
    private User sender;
    private User recipient;
    private String text;
    private Date date;

    public Message(User sender, User recipient, String text) {
        this.sender = sender;
        this.recipient = recipient;
        this.text = text;
        this.date = new Date();
    }

    public User getSender() {
        return sender;
    }

    public User getRecipient() {
        return recipient;
    }

    public String getText() {
        return text;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "FROM: " + sender.getUsername() +
        "\nTO:" + recipient.getUsername() +
        "\nON:" + date + "\n" +
        text;
    }
}
