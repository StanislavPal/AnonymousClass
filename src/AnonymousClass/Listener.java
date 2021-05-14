package AnonymousClass;

public class Listener {
    private Speaker speaker;

    public Listener(Speaker speaker) {
        this.speaker = speaker;
    }

    public void listen() {
        speaker.say();
    }
}
