package productv4;

public class Music extends Product{


    private String artist;
    private String label;

    public Music() {
        super();
        artist = "";
        label = "";
        count++;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    @Override
    public String toString() {
        return super.toString() + " by " + artist + label;
    }
}
