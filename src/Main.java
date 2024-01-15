import it.mediaplayer.media.Media;
import it.mediaplayer.media.playable.Audio;
import it.mediaplayer.media.playable.Video;
import it.mediaplayer.media.viewable.Image;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {

        Media[] playlist = new Media[5];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i <= 4; i++) {

            System.out.println("What media format would you like to add? Please type image, audio or video.");
            String mediaType = scanner.nextLine();

            switch (mediaType.toLowerCase()) {
                case "image":
                    System.out.println("Please type image title:");
                    String imageTitle = scanner.nextLine();
                    Image newImage = new Image(imageTitle);
                    playlist[i] = newImage;

                    break;

                case "audio":
                    System.out.println("Please type audio title:");
                    String audioTitle = scanner.nextLine();
                    System.out.println("Please type audio duration in minutes:");
                    int audioDuration = parseInt(scanner.nextLine());
                    Audio newAudio = new Audio(audioTitle, audioDuration);
                    playlist[i] = newAudio;

                    break;

                case "video":
                    System.out.println("Please type video title:");
                    String videoTitle = scanner.nextLine();
                    System.out.println("Please type video duration in minutes:");
                    int videoDuration = parseInt(scanner.nextLine());
                    Video newVideo = new Video(videoTitle, videoDuration);
                    playlist[i] = newVideo;

                    break;

                default:
                    System.out.println("Please make sure format spelling is correct.");
            }

        }

        for (int i = 0; i <= 4; i++) {
            System.out.println("Please type a number from 1 to 5 in order select a file. Type 0 to end the process.");
            int selectedIndex = parseInt(scanner.nextLine());

            if (selectedIndex > 0 && selectedIndex < 6) {
                Media selectedMedia = playlist[selectedIndex - 1];
                if (selectedMedia instanceof Audio) {
                    ((Audio) selectedMedia).play();
                } else if (selectedMedia instanceof Image) {
                    ((Image) selectedMedia).view();
                }
            } else if (selectedIndex == 0){
                break;
            }

        }

        scanner.close();
    }
}