package letter;

public class Letter {

    private String recipient, sender, message;

    public Letter(String recipient, String sender) {
        this.recipient = recipient;
        this.sender = sender;
    }

    public Letter() {
        this(null, null);
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getSender() {
        return sender;
    }

    public String getMessage() {
        return message;
    }

    public void appendMessage(String msg) {
        if (message != null) {
            message += msg;
        } else {
            message = msg;
        }
    }

    public void insertMessage(String word, String msg) {
        int indexOfWord = message.indexOf(word);
        if (indexOfWord != -1) {
            String str1 = message.substring(0, indexOfWord + word.length());
            String str2 = message.substring(indexOfWord + word.length());
            message = str2;
        } else {
            message = msg + message;
        }
    }

    public String toString() {
        return "From: " + sender + "\nTo: " + recipient + "\n\n" + message;
    }
}
