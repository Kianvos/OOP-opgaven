package opgave_adapter.ui;

import opgave_adapter.drivers.touchscreeninput.TouchScreenInputDevice;

public class WeatherStationUserInterface implements UserInterface {

    public WeatherStationUserInterface() {
        System.out.println("Weerstation PRO V1");
    }

    @Override
    public void linkTouchScreenInputDevice(TouchScreenInputDevice touchScreenInputDevice) {
        touchScreenInputDevice.registerUserInterface(this);
    }

    @Override
    public void onTouch(int x, int y) {
        System.out.println("WEERSTATION UI scherm aangeraakt "+x+","+y);
    }

    @Override
    public void onLongTouch(int x, int y) {
        System.out.println("WEERSTATION UI scherm aangeraakt [LANG]"+x+","+y);
    }
}
