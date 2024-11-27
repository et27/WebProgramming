package mk.ukim.finki.wp.id.repository;

import mk.ukim.finki.wp.id.model.Album;

import mk.ukim.finki.wp.id.bootstrap.DataHolder;
import mk.ukim.finki.wp.id.model.Album;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class AlbumRepository {
    public List<Album> findAll(){
        return DataHolder.albumList;
    }
    public Optional<Album> findById(Long id){
        return DataHolder.albumList.stream().filter(x->x.getId().equals(id)).findFirst();
    }
}