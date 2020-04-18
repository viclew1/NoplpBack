package fr.lewon.crouzy.noplp.database.repo;

import fr.lewon.crouzy.noplp.database.entities.Song;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SongRepository extends MongoRepository<Song, String> {

    Song findByName(String name);

}
