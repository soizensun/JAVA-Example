package emailSystem;

import java.util.ArrayList;

public class EmailSystem {
    private String onlineUser;
    ArrayList<Person> systemInbox;



    public EmailSystem() {
        this.onlineUser = null;
        this.systemInbox = new ArrayList<>();
    }

    public String getOnlineUser() {
        return onlineUser;
    }

    public void logIn(String onlineUser){
        this.onlineUser = onlineUser;
    }

    public void send(Email email){
            email.setSender(onlineUser);
            Person person = findPersonFromUsername(email.getRecipient());
            person.addInbox(email);

    }

    private Person findPersonFromUsername(String user){
        for(Person p : systemInbox){
            if(p.getUsername().equals(user)){
                System.out.println(p.getUsername());
                return p;
            }
            System.out.println(p);
        }
        Person m = new Person(user);
        systemInbox.add(m);
        return m;
    }

    public void LogOut(){
        this.onlineUser = null;
    }

    public String readLog() {
        Person user = findPersonFromUsername(onlineUser);
        return user.listMessages();
    }
}
