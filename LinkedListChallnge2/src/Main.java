import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    private static ArrayList<Album> albums = new ArrayList<>();

    public static void main(String[] args) {
        Album album = new Album("Strombringer", "Deep Purple");
        album.addNewSong("stormbringer", 4.35);
        album.addNewSong("love don't mean a thing", 4.35);
        album.addNewSong("holy man", 4.35);
        album.addNewSong("hold on", 4.35);
        album.addNewSong("lady double dealer", 4.25);
        album.addNewSong("you can't do it right", 4.5);
        album.addNewSong("high ball shooter", 4.56);
        album.addNewSong("the gypsy", 4.35);
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

        LinkedList<Song> platList = new LinkedList<>();
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

    public static void play(LinkedList<Song> linkedList) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<Song> listIterator = linkedList.listIterator();

        if (linkedList.size() == 0) {
            System.out.println("this play list do not have any songs");
            return;
        } else {
            System.out.println("Now Playing " + listIterator.next().toString());
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
                }
                case 4 -> {
                }
                case 5 -> {
                }
                case 6 -> {
                }
            }
        }
    }
}