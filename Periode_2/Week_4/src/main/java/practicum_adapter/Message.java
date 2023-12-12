package practicum_adapter;

import java.time.LocalDateTime;

public interface Message {

    String getSender();

    LocalDateTime getDatetime();

    String getText();

}
