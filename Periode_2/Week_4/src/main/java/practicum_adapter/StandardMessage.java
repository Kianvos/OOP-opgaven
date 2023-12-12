package practicum_adapter;

import java.time.LocalDateTime;

public final class StandardMessage implements Message{

    public final String sender;
    public final LocalDateTime datetime;
    public final String text;

    public StandardMessage(String sender, LocalDateTime datetime, String text) {
        this.sender = sender;
        this.datetime = datetime;
        this.text = text;
    }

    public String getSender() {
        return sender;
    }

    public LocalDateTime getDatetime() {
        return datetime;
    }

    public String getText() {
        return text;
    }

}