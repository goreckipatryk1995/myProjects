package PatrykGorecki;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Album {
    private String name;
    private List<Song> songs;

    public Album(String name) {
        this.name = name;
        this.songs=new ArrayList<>();

    }

    public String getName() {
        return name;
    }

    public List<Song> getSongs() {
        return songs;
    }
    public Song findSong(String title){
        for(Song song:this.songs){
            if(song.getTitle().equals(title)){
                return song;
            }
        }
        return null;
    }
    public boolean addSong(String title, int mins, int seconds){

        if(findSong(title)!=null){
            System.out.println("This song is already added");
            return false;
        }
        this.songs.add(new Song(title,mins,seconds));
        System.out.println("Song: '"+title+"' added");
        return true;
    }
    public boolean removeSong(String title){
        if(findSong(title)==null){
            System.out.println("There is not song '"+title+"' in the album");
            return false;
        }
        this.songs.remove(findSong(title));
        System.out.println("Song removed from album");
        return true;
    }

    public void print(){
        System.out.println("Album title: "+this.name);
        System.out.println("songs: ");
        for (Song song:this.songs){
            System.out.println(song);
        }
    }
}
