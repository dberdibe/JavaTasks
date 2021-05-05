package day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<User> subscriptions;

    public User(String username) {
        this.username = username;
        this.subscriptions = new ArrayList<>();
    }

    public void subscribe(User user){
        this.subscriptions.add(user);


    }

    public boolean isSubscribed(User user){
        for (User users : subscriptions){
            if (users.getUsername().equals(user.getUsername())){
                return true;
            }
        }
        return false;
    }

    public boolean isFriend(User user){
        if (this.isSubscribed(user) && isSubscribed(this)) {
            return true;
        }
        return false;
    }

    public void sendMessage(User user, String text){
        MessageDatabase.addNewMessage(this, user, text);
    }

    @Override
    public String toString() {
        return "MessageDatabase{" +
                "username='" + username + '\'' +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }
}