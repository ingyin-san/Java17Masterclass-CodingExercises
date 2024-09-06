import java.util.*;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;
    
    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }
    
    public boolean addSong(String title, double duration) {
        if (findSong(title) == null) {
            songs.add(new Song(title, duration));
            return true;
        }
        return false;
    }
    
    private Song findSong(String title) {
        for (Song song: songs) {
            if (song.getTitle().equals(title)) {
                return song;
            }
        }
        return null;
    }
    
    public boolean addToPlayList(int no, LinkedList<Song> list) {
        if (no >= 1) {
            list.add(songs.get(no-1));
            return true;
        }
        return false;
    }
    
    public boolean addToPlayList(String title, LinkedList<Song> list) {
        Song song = findSong(title);
        if (song == null) {
            return false;
        }
        list.add(song);
        return true;
    }
}
