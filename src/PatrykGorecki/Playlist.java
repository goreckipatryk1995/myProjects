package PatrykGorecki;

import java.util.*;

public class Playlist {
    private String name;
    private LinkedList<Song> songs;

    public Playlist(String name) {
        this.name = name;
        this.songs = new LinkedList<Song>();
    }
    public boolean addSong(String title, Album album){
        if(album.findSong(title)!=null){
            songs.add(album.findSong(title));
            System.out.println("Added to playlist");
            return true;
        }
        System.out.println("There is no song '"+title+"' i this album");
        return false;
    }
    public Song findSong(String title){
        for(Song song:this.songs){
            if(song.getTitle().equals(title)){
                return song;
            }
        }
        return null;
    }
    public boolean removeSong(String title){
        if(findSong(title)==null){
            System.out.println("There is not song '"+title+"' in the album");
            return false;
        }
        this.songs.remove(findSong(title));
        System.out.println("Song removed from playlist");
        return true;
    }
    public void Play(){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        boolean menu = false;
        ListIterator<Song> listIterator = songs.listIterator();
        if(songs.size() == 0) {
            System.out.println("No songs in playlist");
            quit=true;

        } else {
            System.out.println("Now playing " + listIterator.next().toString());
        }
        while (!quit){
            if(!menu) {
                System.out.println("Press 'MENU' to print menu options");
            }
            String option = scanner.nextLine().toUpperCase(Locale.ROOT);
            switch (option){
                case "QUIT":
                    quit=true;
                    break;
                case "NEXT":
                    if(!forward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        forward=true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now playing " + listIterator.next().toString());
                    }
                    else {
                        System.out.println("there is no more songs in this playlist");
                        forward=false;
                    }
                    break;
                case "BACK":
                    if(forward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        forward=false;
                        menu=false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now playing " + listIterator.previous().toString());
                    }
                    else {
                        System.out.println("this is the first song of playlist");
                        forward=true;
                        menu=false;
                    }
                    break;
                case "MENU":
                    printMenu();
                    menu=true;
                    break;
            }
        }




        }
    public void print(){
        System.out.println("Playlist name: "+this.name);
        System.out.println("songs: ");
        int i=1;
        for (Song song:this.songs){
            System.out.println(i+". "+song);
            i++;
        }
    }
    public void printMenu(){
        System.out.println("'NEXT' - next song\n'BACK' - previous song\n'QUIT' - quit");
    }



}
