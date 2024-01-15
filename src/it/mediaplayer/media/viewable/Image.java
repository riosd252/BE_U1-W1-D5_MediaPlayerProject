package it.mediaplayer.media.viewable;

import it.mediaplayer.media.Media;

public class Image extends Media {
private int brightness = 2;

public Image(String mediaTitle) {
    super(mediaTitle);
}

public void view() {
    System.out.println(this.mediaTitle + "*".repeat(this.brightness));
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
