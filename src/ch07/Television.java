package ch07;

public class Television implements RemoteControl {
    int volume = 0;

    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {

    }

    @Override
    public void volumeUp() {
        if (volume < MAX_VOLUME) {
            volume++;
        }
    }

    @Override
    public void volumeDown() {
        if (volume > MIN_VOLUME) {
            volume--;
        }
    }

    public void volumeState() {
        System.out.println("volume : " + volume);
    }
}
