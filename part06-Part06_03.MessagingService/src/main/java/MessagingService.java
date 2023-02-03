import java.util.ArrayList;

public class MessagingService {
    private ArrayList<Message> seznam;

    public MessagingService() {
        this.seznam = new ArrayList<>();
    }


    public void add(Message message) {
        if (message.getContent().length() <= 280) {
            this.seznam.add(message);
        }
    }
        public ArrayList<Message> getMessages() {
    return seznam;
    }
}

