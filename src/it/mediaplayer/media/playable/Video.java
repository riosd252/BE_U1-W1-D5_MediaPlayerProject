package it.mediaplayer.media.playable;

public class Video extends Audio {
    private int brightness = 2;

    public Video(String mediaTitle, int duration) {
        super(mediaTitle, duration);
    }

    public void play() {
        for(int i = 0; i < this.duration; i++) {
            System.out.println(this.mediaTitle + "!".repeat(this.volume) + "*".repeat(this.brightness));
        }
    }

    public void raiseBrightness() {
        if(brightness < 5) {
            this.brightness += 1;
        }
    }

    public void lowerBrightness() {
        if(brightness > 0) {
            this.brightness -= 1;
        }
    }




}
