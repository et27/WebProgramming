package mk.ukim.finki.wp.id.repository;

import mk.ukim.finki.wp.id.bootstrap.DataHolder;
import mk.ukim.finki.wp.id.model.Artist;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ArtistRepository {

    public List<Artist> findAll(){
        return DataHolder.artistList;
    }

    public Optional<Artist> findById(Long id){
        return DataHolder.artistList.stream().filter(r->r.getId().equals(id)).findFirst();
    }
}