import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Album {
    private final SongsList songs;


    public Album(String name, String artistName) {
        this.songs = new SongsList();
    }

    public boolean addNewSong(String songName, double duration) {
        return this.songs.addSong(new Song(songName, duration));
    }


    public boolean addToPlaylist(int trackNumber, List<Song> playList) {
        Song checkedSong = this.songs.findSong(trackNumber);

        if (checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlaylist(String trackName, List<Song> playList) {
        Song checkedSong = this.songs.findSong(trackName);
        if (checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }
        System.out.println("This song " + trackName + "in  not in this album.");
        return false;
    }

    private class SongsList {
        private final ArrayList<Song> songs;

        public SongsList() {
            this.songs = new ArrayList<>();
        }

        public boolean addSong(Song song) {

            if (songs.contains(song)) {
                return false;
            }
            songs.add(song);
            return true;
        }


        public Song findSong(String songName) {
            for (Song item : songs) {
                if (Objects.equals(item.getName(), songName)) {
                    return item;
                }
            }
            return null;
        }

        public Song findSong(int trackNumber) {
            int index = trackNumber - 1;
            for (int i = 0; i < songs.size(); i++) {
                if (index >= 0 && index < songs.size()) {
                    return songs.get(index);
                }
            }
            return null;
        }
    }
}
