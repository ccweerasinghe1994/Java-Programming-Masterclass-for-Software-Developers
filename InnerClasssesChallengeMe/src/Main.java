import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    private static List<Album> albums = new ArrayList<>();

    public static void main(String[] args) {
        Album album = new Album("Strombringer", "Deep Purple");
        album.addNewSong("stormbringer", 4.35);
        album.addNewSong("love don't mean a thing", 4.35);
        album.addNewSong("holy man", 4.35);
        album.addNewSong("hold on", 4.35);
        album.addNewSong("lady double dealer", 4.25);
        album.addNewSong("you can't do it right", 4.5);
        album.addNewSong("high ball shooter", 4.56);
        album.addNewSong("the gyps  y", 4.35);
        album.addNewSong("soldier of fortune", 4.44);
        album.addNewSong("", 4.12);
        album.addNewSong("", 4.55);

        albums.add(album);

        album = new Album("For Those About to Rock We Salute You", "AC/DC");
        album.addNewSong("For Those About to Rock (We Salute You)", 4.01);
        album.addNewSong("Put the Finger on You", 4.01);
        album.addNewSong("Let's Get It Up", 4.01);
        album.addNewSong("Inject the Venom", 4.01);
        album.addNewSong("Snowballed", 4.01);
        album.addNewSong("Evil Walks", 4.01);
        album.addNewSong("C.O.D.", 4.01);
        album.addNewSong("Breaking the Rules", 4.01);
        album.addNewSong("Night of the Long Knives", 4.01);
        album.addNewSong("Spellbound", 4.01); // DNE

        albums.add(album);

        List<Song> platList = new ArrayList<>();
        albums.get(0).addToPlaylist("high ball shooter", platList);
        albums.get(0).addToPlaylist("soldier of fortune", platList);
        albums.get(0).addToPlaylist("high ", platList);
        albums.get(0).addToPlaylist(1, platList);
        albums.get(1).addToPlaylist(1, platList);
        albums.get(1).addToPlaylist(5, platList);
        albums.get(1).addToPlaylist(3, platList);
        albums.get(1).addToPlaylist(222, platList);// DNE

        play(platList);
    }

    public static void play(List<Song> linkedList) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<Song> listIterator = linkedList.listIterator();

        if (linkedList.size() == 0) {
            System.out.println("this play list do not have any songs");
            return;
        } else {
            System.out.println("Now Playing " + listIterator.next().toString());
            printOptions();
        }

        while (!quit) {
            System.out.println("please select a option");
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0 -> {
                    quit = true;
                    System.out.println("Quiting the playlist ...");
                }
                case 1 -> {
                    if (!goingForward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("your are at the end of the play list");
                    }
                }
                case 2 -> {
                    if (goingForward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("now playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("your are at the start of the playlist");
                    }
                }
                case 3 -> {
                    if (goingForward) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("now replaying " + listIterator.previous().toString());
                            goingForward = false;
                        } else {
                            System.out.println("we are at the beginning of the playlist");
                        }
                    } else {
                        if (listIterator.hasNext()) {
                            System.out.println("now replaying " + listIterator.next().toString());
                            goingForward = true;
                        } else {
                            System.out.println("we are at the end of the playlist");
                        }
                    }
                }
                case 4 -> {
                    printSongsList(linkedList);
                }
                case 5 -> {
                    printOptions();
                }
                case 6 -> {
                    if (linkedList.size() > 0) {
                        listIterator.remove();
                        System.out.println("song removed successfully");
                        if (listIterator.hasNext()) {
                            System.out.println("now playing " + listIterator.next().toString());
                        } else if (listIterator.hasPrevious()) {
                            System.out.println("Now playing " + listIterator.previous().toString());
                        }
                    }
                }

            }
        }
    }

    public static void printOptions() {
        System.out.println("""
                press
                0 to quit the playlist
                1 to play the next song
                2 to play the previous song
                3 to replay the current song
                4 to list the songs in the playlist
                5 to print the instruction
                6 to remove the current song
                """);
    }

    public static void printSongsList(List<Song> songs) {
        final int[] index = {1};
        songs.forEach(song -> {
            System.out.println(index[0] + "." + song.toString());
            index[0]++;
        });
    }
}