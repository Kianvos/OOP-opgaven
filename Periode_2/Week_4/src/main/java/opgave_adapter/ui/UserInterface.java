package opgave_adapter.ui;

import opgave_adapter.drivers.touchscreeninput.TouchScreenInputDevice;

public interface UserInterface {

    void linkTouchScreenInputDevice(TouchScreenInputDevice touchScreenInputDevice);
    void onTouch(int x, int y);
    void onLongTouch(int x, int y);

}
