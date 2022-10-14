import java.util.*;

public class PlayList {
    private final String playlistName;
    LinkedList<Song> songs;

    public PlayList(String playlistName) {
        this.playlistName = playlistName;
        songs = new LinkedList<>();
    }

    public boolean addSong(ArrayList<Album> albums, String albumName, String songName) {
        Album album = findAlbum(albums, albumName);
        if (album == null) {
            return false;
        }
        Song existingSong = album.findSong(songName);
        if (existingSong == null) {
            return false;
        }
        this.songs.add(existingSong);
        return true;
    }

    private Album findAlbum(ArrayList<Album> albums, String albumName) {
        for (Album album : albums) {
            if (Objects.equals(album.getAlbumName(), albumName)) {
                return album;
            }
        }
        return null;
    }


    public void startApp() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" PLAYLIST NAME : " + playlistName);
        appPrintOptions();

        boolean quit = false;

        while (!quit) {
            System.out.println("please select a option (press 0 to see the options)");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 0 -> appPrintOptions();
                case 1 -> startSongs();
                case 2 -> quit = true;
            }
        }
    }

    private void printOptions() {
        System.out.println("""
                press
                o to list the options
                1 to list the songs
                2 to forward to next track
                3 to bo back to previous track
                4 to replay the current song
                5 ro remove the current song
                6 to stop the playlist
                """);
    }

    private void appPrintOptions() {
        System.out.println("""
                press
                o to list the options
                1 to start the app
                2 to stop the app
                """);
    }

    private void listSongs() {
        System.out.println("Songs in playlist " + this.playlistName);
        for (Song song : songs) {
            System.out.println("Song name -> " + song.getTitle());
        }
    }

    private void startSongs() {

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        ListIterator<Song> songListIterator = songs.listIterator();
        boolean goingForward = true;
        if (songs.isEmpty()) {
            System.out.println("there are no songs in this playlist");
        } else {
            System.out.println("now playing Song : " + songListIterator.next().getTitle());
            printOptions();
        }

        while (!quit) {
            System.out.println("please select a option ");
            int songOption = scanner.nextInt();
            switch (songOption) {
                case 0 -> printOptions();
                case 1 -> listSongs();
                case 2 -> {
                    if (!goingForward) {
                        if (songListIterator.hasNext()) {
                            songListIterator.next();
                        }
                        goingForward = true;
                    }
                    if (songListIterator.hasNext()) {
                        System.out.println("now playing song : " + songListIterator.next().getTitle());
                    } else {
                        System.out.println("There are no songs");
                        goingForward = false;
                    }
                }
                case 3 -> {
                    if (goingForward) {
                        if (songListIterator.hasPrevious()) {
                            songListIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (songListIterator.hasPrevious()) {
                        System.out.println("now playing song : " + songListIterator.previous().getTitle());
                    } else {
                        System.out.println("you are at the start of the playlist");
                        goingForward = true;
                    }
                }
                case 4 -> {
                    if (songListIterator.hasPrevious()) {
                        songListIterator.previous();
                        System.out.println("replaying the song : " + songListIterator.next().getTitle());
                    } else {
                        System.out.println("replaying the song : " + songListIterator.next().getTitle());
                    }
                }
                case 5 -> {
                    if (songListIterator.hasNext()) {
                        songListIterator.remove();
                        System.out.println("removed the current song");
                    } else {
                        System.out.println("there are no songs to remove");
                    }
                }

                case 6 -> quit = true;
            }
        }
    }

}
