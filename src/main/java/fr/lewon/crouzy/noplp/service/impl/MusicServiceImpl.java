package fr.lewon.crouzy.noplp.service.impl;

import fr.lewon.crouzy.noplp.database.entities.Song;
import fr.lewon.crouzy.noplp.database.repo.SongRepository;
import fr.lewon.crouzy.noplp.exception.AlreadyExistingSongException;
import fr.lewon.crouzy.noplp.exception.MissingParameterException;
import fr.lewon.crouzy.noplp.exception.SongNotFoundException;
import fr.lewon.crouzy.noplp.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicServiceImpl implements MusicService {

    @Autowired
    private SongRepository songRepository;

    @Override
    public Song getSongByName(String songName) throws MissingParameterException, SongNotFoundException {
        if (songName == null || songName.isEmpty()) {
            throw new MissingParameterException("songName");
        }
        Song song = this.songRepository.findByName(songName);
        if (song == null) {
            throw new SongNotFoundException(songName);
        }
        return song;
    }

    @Override
    public Song createNewSong(String songName) throws Exception {
        if (songName == null || songName.isEmpty()) {
            throw new MissingParameterException("songName");
        }
        if (this.songRepository.findByName(songName) != null) {
            throw new AlreadyExistingSongException(songName);
        }
        Song toSave = new Song();
        toSave.setName(songName);
        return this.songRepository.save(toSave);
    }

    @Override
    public List<Song> getAllSongs() {
        return this.songRepository.findAll();
    }

}
