package practicum_adapter;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        MessageViewer messageViewer = new MessageViewer();
        List<Message> messages = MessageInbox.getInstance().getMessages();

        WhatsAppReader whatsAppReader = new WhatsAppReader();
        for (WhatsAppMsg whatsAppMsg : whatsAppReader.fetchMessages()) {
            WhatsAppAdapter whatsAppAdapter = new WhatsAppAdapter(whatsAppMsg);
            messages.add(whatsAppAdapter);
        }

        messageViewer.view(messages);
    }
}
