package mk.ukim.finki.wp.id.service;

import mk.ukim.finki.wp.id.model.Artist;
import mk.ukim.finki.wp.id.model.Song;

import java.util.List;
import java.util.Optional;


public interface SongService {
    List<Song> listSongs();
    Artist addArtistToSong(Artist artist, Song song);
    Song findByTrackId(String trackId);
    List<Song> findSongByText(String text);
    void deleteSong(Long id);
    Song findById(Long id);
    void updateSong(Song song);
}