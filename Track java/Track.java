package CENG201LAB;

public class Track {
    private String title;
    private String artist;
    private int durationSeconds;
    private boolean isExplicit;

    public Track(){               //default constructor.
        this("Unknown Title", "Unknown Artist", 0, false);
    }

    public Track(String title){    //Title-only constructor.
        this(title, "Unknown Artist", 0, false);
    }

    public Track(String title, String artist){  //title-artist only constructor.
        this(title, artist, 0, false);
    }

    public Track(String title, String artist, int durationSeconds, boolean isExplicit){
        this.title = title;
        this.artist = artist;
        this.isExplicit = isExplicit;

        if (durationSeconds < 0){
            System.out.println("ERROR. invalid duration seconds.");
            this.durationSeconds = 0;
        } else {
            this.durationSeconds = durationSeconds;
        }
    }

    //GETTER METHODS.
    public String getTitle(){
        return title;
    }

    public String getArtist(){
        return artist;
    }

    public int getDurationSeconds(){
        return durationSeconds;
    }

    public boolean getIsExplicit(){
        return isExplicit;
    }

    public String getDurationFormatted(){
        int minutes = durationSeconds / 60;
        int seconds = durationSeconds % 60;
        return String.format("%d:%02d", minutes, seconds);
    }

    @Override
    public String toString(){
        if (isExplicit){
            return "\"" + title + "\" by " + artist + " " + getDurationFormatted() + " [EXPLICIT]";
        } else {
            return "\"" + title + "\" by " + artist + " " + getDurationFormatted();
        }
    }
}