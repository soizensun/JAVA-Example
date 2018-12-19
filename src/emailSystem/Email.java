package emailSystem;

public class Email {
    private String recipeint;
    private String sender;
    private String text;

    public Email(String recipeint, String text) {
        this.sender = null;
        this.sender = recipeint;
        this.text = text;
    }

    public void setRecipient(String onlineUser) {
        recipeint = onlineUser;
    }

    public String getRecipient() {
        return recipeint;
    }

    public void setSender(String onlineUser) {
        this.sender = onlineUser;
    }

    @Override
    public String toString() {
        return "From: " + sender + "\n" +
                "To: " + recipeint + "\n" +
                text + "\n";
    }
}
