package emailSystem;

import java.util.ArrayList;

public class Person {
    private String username;
    private ArrayList<Email> inbox;

    public Person(String username) {
        this.username = username;
        inbox = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public void addInbox(Email email) {
        inbox.add(email);
    }

    public ArrayList<Email> getInbox() {
        return inbox;
    }

    public String listMessages() {
        StringBuffer messagesStr = new StringBuffer();
        for (Email msg : inbox) {
            messagesStr.append(msg.toString()+"---------\n");
        }
        return messagesStr.toString();
    }
}
