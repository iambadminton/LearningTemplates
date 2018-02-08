package HeadFirstJava.chap16;

/**
 * Created by a.shipulin on 20.12.17.
 */
public class Song  implements  Comparable<Song>{
    String title;
    String artist;
    String rating;
    String bpm;

    public Song(String title, String artist, String rating, String bpm) {
        this.title = title;
        this.artist = artist;
        this.rating = rating;
        this.bpm = bpm;
    }


    public int compareTo(Song s) {
        return this.title.compareTo(s.title);
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", rating='" + rating + '\'' +
                ", bpm='" + bpm + '\'' +
                '}';
    }
}
