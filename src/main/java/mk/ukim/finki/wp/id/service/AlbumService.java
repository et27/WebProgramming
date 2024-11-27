package mk.ukim.finki.wp.id.service;

import mk.ukim.finki.wp.id.model.Album;

import java.util.List;
import java.util.Optional;

public interface AlbumService {
    List<Album> findAll();
    Optional<Album> findById(Long id);
}