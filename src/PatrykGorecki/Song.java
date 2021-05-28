package PatrykGorecki;

import java.util.Objects;

public class Song {
    private String title;
    private Length length;

    public Song(String title, int min, int seconds) {
        this.title = title;
        this.length = new Length(min,seconds);
    }

    public String getTitle() {
        return title;
    }

    public Length getLenth() {
        return length;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return title.equals(song.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }

    @Override
    public String toString() {
        return   "'" + title + '\''
                 + length;
    }
    public class Length {
        private int min;
        private int seconds;

        public Length(int min, int seconds) {
            this.min = min;
            if(seconds>=60){
                this.seconds=0;
            }
            this.seconds = seconds;
        }

        @Override
        public String toString() {
            return "(" +
                    "min=" + min +
                    ", seconds=" + seconds +
                    ')';
        }
    }
}
