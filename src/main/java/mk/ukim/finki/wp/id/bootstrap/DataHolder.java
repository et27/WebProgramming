package mk.ukim.finki.wp.id.bootstrap;

import jakarta.annotation.PostConstruct;
import mk.ukim.finki.wp.id.model.Album;
import mk.ukim.finki.wp.id.model.Artist;
import mk.ukim.finki.wp.id.model.Song;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import jakarta.annotation.PostConstruct;
import mk.ukim.finki.wp.id.model.Artist;
import mk.ukim.finki.wp.id.model.Song;
import mk.ukim.finki.wp.id.model.Album;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DataHolder {
    public static List<Artist> artistList = new ArrayList<>();
    public static List<Song> songList = new ArrayList<>();
    public static List<Album> albumList=new ArrayList<>();

    @PostConstruct
    public void init(){
        artistList.add(new Artist("Tom","Odell", 143L, "Tom Odell bio"));
        artistList.add(new Artist("John","Legend", 144L, "John Legned bio"));
        artistList.add(new Artist("Dua","Lipa", 145L, "Dua Lipa bio"));
        artistList.add(new Artist("Christina","Perri", 146L, "Christina Perri bio"));
        artistList.add(new Artist("Kety","Perry", 147L, "Kety Perry bio"));

        Album album1= new Album("Smile", 2024,"pop");
        albumList.add(album1);
        Album album2= new Album("Love", 2016,"funk");
        albumList.add(album2);
        Album album3= new Album("Nostalgia", 1991,"pop");
        albumList.add(album3);
        Album album4= new Album("Red", 2012,"pop");
        albumList.add(album4);
        Album album5= new Album("Heart", 2023,"pop");
        albumList.add(album5);

        songList.add(new Song("Another love", "pop", 2016, "111",album2));
        songList.add(new Song("Future Nostalgia", "pop", 2016, "112", album3));
        songList.add(new Song("Perfect", "pop", 2024, "113",album1));
        songList.add(new Song("Mirrors", "pop", 2013, "114",album4));
        songList.add(new Song("All of me", "pop", 2011, "115",album5));
    }}