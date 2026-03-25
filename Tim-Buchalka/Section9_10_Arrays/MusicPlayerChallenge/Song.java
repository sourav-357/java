package Section9_10_Arrays.MusicPlayerChallenge;

/*the most basic class*/
public class Song {
     private String title;
     private double duration;

     public String getTitle() {
          return title;
     }

     public double getDuration() {
          return duration;
     }

     public Song(String title, double duration) {
          this.title = title;
          this.duration = duration;
     }

     @Override
     public String toString() {
          return "Song{" +
                    "title='" + title + '\'' +
                    ", duration=" + duration +
                    '}';
     }
}
