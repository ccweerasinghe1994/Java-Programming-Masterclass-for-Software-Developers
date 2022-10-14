import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Songs application");
        Song song = new Song("a", "1");
        Song song2 = new Song("b", "1");
        Song song3 = new Song("c", "1");
        Song song4 = new Song("d", "1");
        Song song6 = new Song("e", "1");
        Song song5 = new Song("f", "1");
        Song song7 = new Song("g", "1");

        Album album1 = new Album("album1");
        Album album2 = new Album("album2");

        album1.addSong(song);
//        album1.addSong(song2);
//        album1.addSong(song3);
//        album1.addSong(song4);

        album2.addSong(song5);
//        album2.addSong(song6);
//        album2.addSong(song7);


        ArrayList<Album> albums = new ArrayList<>();
        albums.add(album1);
        albums.add(album2);

        PlayList playList = new PlayList("party");

        playList.addSong(albums, "album1", "a");
        playList.addSong(albums, "album1", "b");
        playList.addSong(albums, "album1", "c");
        playList.addSong(albums, "album1", "d");
        playList.addSong(albums, "album2", "f");
        playList.addSong(albums, "album2", "e");
        playList.addSong(albums, "album2", "g");

        playList.startApp();

    }
}