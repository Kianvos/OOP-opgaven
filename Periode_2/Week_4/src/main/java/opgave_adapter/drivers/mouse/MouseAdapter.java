package opgave_adapter.drivers.mouse;

import opgave_adapter.drivers.touchscreeninput.TouchScreenInputDevice;
import opgave_adapter.ui.UserInterface;

public class MouseAdapter implements TouchScreenInputDevice {
    Mouse mouse;
    UserInterface userInterface;

    int x;
    int y;

    public MouseAdapter(Mouse mouse) {
        this.mouse = mouse;
    }

    @Override
    public void registerUserInterface(UserInterface userInterface) {
        this.userInterface = userInterface;
    }

    public void simulateUserActionMove(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void simulateUserActionClickLeft() {
        userInterface.onTouch(x, y);
    }

    public void simulateUserActionClickRight() {
        userInterface.onLongTouch(x, y);
    }
}