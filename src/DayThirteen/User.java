package DayThirteen;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<User> subscriptions;

    public User(String username) {
        this.username = username;
        this.subscriptions = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public void subscribe(User user){
        if(!this.isSubscribed(user))
        {
            this.subscriptions.add(user);
        }
    }

    public boolean isSubscribed(User user){
        return subscriptions.contains(user);
    }
    public boolean isFriend(User user){
        return (user.isSubscribed(this) && user.isSubscribed(user));
    }

    @Override
    public String toString() {
        return "username='" + username;
    }
}
