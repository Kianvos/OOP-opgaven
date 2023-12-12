package practicum_adapter;

import java.time.LocalDateTime;

public class WhatsAppAdapter implements Message {

    private WhatsAppMsg whatsAppMsg;

    public WhatsAppAdapter(WhatsAppMsg whatsAppMsg) {
        this.whatsAppMsg = whatsAppMsg;
    }

    @Override
    public String getSender() {
        return whatsAppMsg.getWhatsAppThread().from();
    }

    @Override
    public LocalDateTime getDatetime() {
        return LocalDateTime.of(whatsAppMsg.getDate(), whatsAppMsg.getTime());
    }

    @Override
    public String getText() {
        return whatsAppMsg.getContent();
    }
}
