package opgave_adapter.drivers.mouse;

import java.util.function.Consumer;

public class MouseClickAdapter implements Consumer {

    Consumer<Mouse> mouseConsumer;
    private int x;
    private int y;
    public MouseClickAdapter() {

    }

    @Override
    public void accept(Object o) {

    }
}
