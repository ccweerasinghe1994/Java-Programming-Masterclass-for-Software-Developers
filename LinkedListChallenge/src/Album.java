import java.util.ArrayList;
import java.util.Objects;

public class Album {
    ArrayList<Song> songs;
    private String albumName;

    public Album(String albumName) {
        this.albumName = albumName;
        this.songs = new ArrayList<>();
    }

    public String getAlbumName() {
        return albumName;
    }

    public boolean addSong(Song song) {
        if (findSong(song) == null) {
            songs.add(song);
            return true;
        } else {
            return false;
        }
    }

    private Song findSong(Song song) {
        for (Song existingSong : songs) {
            if (Objects.equals(existingSong.getTitle(), song.getTitle())) {
                return song;
            }
        }
        return null;
    }

    public Song findSong(String songName) {
        for (Song existingSong : songs) {
            if (Objects.equals(existingSong.getTitle(), songName)) {
                return existingSong;
            }
        }
        return null;
    }
}
