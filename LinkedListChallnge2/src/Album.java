import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Album {
    private String name;
    private String artistName;
    private ArrayList<Song> songs;

    public Album(String name, String artistName) {
        this.name = name;
        this.artistName = artistName;
        this.songs = new ArrayList<>();
    }

    public boolean addNewSong(String songName, double duration) {
        if (findSong(songName) == null) {
            this.songs.add(new Song(songName, duration));
            return true;
        }
        return false;
    }

    private Song findSong(String songName) {
        for (Song song : this.songs) {
            if (Objects.equals(song.getName(), songName)) {
                return song;
            }
        }
        return null;
    }

    public boolean addToPlaylist(int trackNumber, List<Song> playList) {
        int index = trackNumber - 1;
        if ((trackNumber >= 0) && (trackNumber <= this.songs.size())) {
            playList.add(this.songs.get(index));
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlaylist(String trackName, List<Song> playList) {
        Song song = findSong(trackName);
        if (song != null) {
            playList.add(song);
            return true;
        }
        System.out.println("This song " + trackName + "in  not in this album.");
        return false;
    }
}
