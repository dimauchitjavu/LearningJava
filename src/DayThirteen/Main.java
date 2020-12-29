package DayThirteen;

public class Main {
    public static void main(String[] args) {
        User lain = new User("Lain Iwakura");
        User chisa = new User("Chisa Yomoda");
        User alice = new User("Alice Mizuki");
        MessageDatabase.sendMessage(lain, chisa, "Hello");
        MessageDatabase.sendMessage(lain, chisa, "How are you?");

        MessageDatabase.sendMessage(chisa, lain, "Hi");
        MessageDatabase.sendMessage(chisa, lain, "I'm ok");
        MessageDatabase.sendMessage(chisa, lain, ":)");

        MessageDatabase.sendMessage(alice, lain, "hiii");
        MessageDatabase.sendMessage(alice, lain, "are you there");
        MessageDatabase.sendMessage(alice, lain, "??");

        MessageDatabase.sendMessage(lain, alice, "Hello");
        MessageDatabase.sendMessage(lain, alice, "...");
        MessageDatabase.sendMessage(lain, alice, "...");

        MessageDatabase.sendMessage(alice, lain, "ok");

        MessageDatabase.showDialog(lain, alice);
        MessageDatabase.showDialogAlt(lain,chisa);
    }
}
