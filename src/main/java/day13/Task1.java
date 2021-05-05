package day13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("u1");
        User user2 = new User("u2");
        User user3 = new User("u3");

        user1.sendMessage(user2, "Hello");
        user1.sendMessage(user2, "How are you?");

        user2.sendMessage(user1, "Hello user 1!");
        user2.sendMessage(user1, "I am fine, thank you.");
        user2.sendMessage(user1, "And you?");

        user3.sendMessage(user1, "Hello user1!");
        user3.sendMessage(user1, "I am user3.");
        user3.sendMessage(user1, "Nice too meet you!");

        user1.sendMessage(user3, "Hello user3!");
        user1.sendMessage(user3, "Nice to meet you too!");
        user1.sendMessage(user3, "Where are you?");

        user3.sendMessage(user1, "In England");

        MessageDatabase.showDialog(user1, user3);




    }
}
