package practicumCommandPattern;

public class CommandVolumeUp implements Command{
    BasicAVdevice basicAVdevice;

    public CommandVolumeUp(BasicAVdevice basicAVdevice) {
        this.basicAVdevice = basicAVdevice;
    }

    @Override
    public void execute() {
        basicAVdevice.volumeUp();
    }
}
