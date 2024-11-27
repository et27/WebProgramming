package mk.ukim.finki.wp.id.service;


import mk.ukim.finki.wp.id.model.Artist;
import mk.ukim.finki.wp.id.model.Song;
import mk.ukim.finki.wp.id.repository.ArtistRepository;
import mk.ukim.finki.wp.id.repository.SongRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SongServiceImpl implements SongService {
    private final ArtistRepository artistRepository;
    private final SongRepository songRepository;

    public SongServiceImpl(ArtistRepository artistRepository, SongRepository songRepository) {
        this.artistRepository = artistRepository;
        this.songRepository = songRepository;
    }

    @Override
    public List<Song> listSongs() {
        return songRepository.findAll();
    }

    @Override
    public Artist addArtistToSong(Artist artist, Song song) {
        return songRepository.addArtistToSong(artist,song);
    }

    @Override
    public Song findByTrackId(String trackId) {
        return songRepository.findByTrackId(trackId);
    }
    public List<Song> findSongByText(String text){
        return  songRepository.findAll().stream().
                filter(r->r.getTitle().toLowerCase().contains(text.toLowerCase())).collect(Collectors.toList());

    }

    @Override
    public void deleteSong(Long id) {
        songRepository.deleteSong(id);
    }

    @Override
    public Song findById(Long id) {
        return songRepository.findById(id);
    }

    @Override
    public void updateSong(Song song) {
        songRepository.update(song);
    }
}