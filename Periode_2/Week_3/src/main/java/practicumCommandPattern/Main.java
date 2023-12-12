package practicumCommandPattern;

public class Main {
    public static void main(String[] args) {
        BasicAVdevice television = new Television();
        BasicAVdevice radio = new Radio();
        Command commandOn = new CommandOn(radio);
        Command commandOff = new CommandOff(radio);
        Command commandVolumeUp = new CommandVolumeUp(radio);
        Command commandVolumeDown = new CommandVolumeDown(radio);
        Command commandTest = new CommandTest((Radio) radio);

        RemoteControl remoteControl = new RemoteControl();
        remoteControl.addCommand(commandOn, "Televisie aan");
        remoteControl.addCommand(commandOff, "Televisie uit");
        remoteControl.addCommand(commandVolumeUp, "Televisie volume omhoog");
        remoteControl.addCommand(commandVolumeDown, "Televisie volume omlaag");
        remoteControl.addCommand(commandTest, "Test");
        remoteControl.start();
    }
}
