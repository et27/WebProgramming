package mk.ukim.finki.wp.id.service;

import mk.ukim.finki.wp.id.model.Artist;

import java.util.List;
import java.util.Optional;


public interface ArtistService {
    List<Artist> listArtists();
    Optional<Artist> findById(Long id);
}