package it.mediaplayer.media.playable;

import it.mediaplayer.media.Media;

public class Audio extends Media {
    protected int volume = 3;
    protected final int duration;

    public Audio(String mediaTitle, int duration) {
        super(mediaTitle);
        this.duration = duration;
    }

    public void play() {
        for(int i = 0; i < duration; i++) {
            System.out.println(this.mediaTitle + "!".repeat(this.volume));
        }
    }
    public void raiseVolume() {
        if(volume < 5) {
            this.volume += 1;
        }
    }

    public void lowerVolume() {
        if(volume > 0) {
            this.volume -= 1;
        }
    }
}
