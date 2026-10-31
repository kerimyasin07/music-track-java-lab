package CENG201LAB;

public class PlayListDemo {
    public static void main (String[] args){
        System.out.println("=== Playlist Track Demo ===\n");

        Track track1 = new Track();
        Track track2 = new Track("Neon Lights");
        Track track3 = new Track("Ocean Drive", "Midnight Pulse");
        Track track4 = new Track("Neon", "Stellar echo", 300, true);
        Track track5 = new Track("Neonsa", "Stellar echo", 300, false);

        System.out.println(track1);
        System.out.println(track2);
        System.out.println(track3);
        System.out.println(track4);
        System.out.println(track5);
    }
}
