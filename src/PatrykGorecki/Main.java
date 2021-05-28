package PatrykGorecki;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {

        Song s1 = new Song("In my mind", 4,43);
        int x=0;
        Album album = new Album("MyAlbum");
        Playlist playlist = new Playlist("playlist");
        album.addSong("Stormbringer", 4,6);
        album.addSong("Love don't mean a thing", 4,22);
        album.addSong("Holy man", 4,3);
        album.addSong("Hold on", 5,6);
        album.addSong("Lady double dealer", 3,21);
        album.addSong("You can't do it right", 6,23);
        album.addSong("High ball shooter", 4,27);
        album.addSong("The gypsy", 4,2);
        album.addSong("Soldier of fortune", 3,13);

        playlist.addSong("In my mind",album);
        playlist.addSong("Soldier of fortune",album);
        playlist.addSong("The gypsy",album);
        playlist.addSong("High ball shooter",album);
        playlist.addSong("High ball shooter",album);
        playlist.addSong("Hold on",album);
        album.print();

        playlist.Play();



    }
}
