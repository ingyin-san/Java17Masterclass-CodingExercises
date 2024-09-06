import java.util.*;

public class Album {
    private String name;
    private String artist;
    private SongList songs;
    
    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }
    
    public boolean addSong(String title, double duration) {
        if (songs.findSong(title) == null) {
            songs.add(new Song(title, duration));
            return true;
        }
        return false;
    }
    
    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        if (songs.findSong(trackNumber) != null) {
            playList.add(songs.songs.get(trackNumber-1));
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }
    
    public boolean addToPlayList(String title, LinkedList<Song> playList) {
        Song song = songs.findSong(title);
        if (song == null) {
            System.out.println("The song " + title + " is not in this album");
            return false;
        }
        playList.add(song);
        return true;
    }
    
    public static class SongList {
        private ArrayList<Song> songs;
        
        private SongList() {
            this.songs = new ArrayList<>();
        }
        
        private boolean add(Song song) {
            for (int i = 0; i < songs.size(); i++) {
                if (songs.get(i).equals(song)) {
                    return false;
                }
            }
            songs.add(song);
            return true;
        }
        
        private Song findSong(String title) {
            for (Song song: songs) {
                if (song.getTitle().equals(title)) {
                    return song;
                }
            }
            return null;
        }
        
        private Song findSong(int no) {
            for (int i = 0; i < songs.size(); i++) {
                if (i == no-1) {
                    return songs.get(i);
                }
            }
            return null;
        }
    }
}
