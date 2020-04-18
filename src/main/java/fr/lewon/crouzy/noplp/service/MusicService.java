package fr.lewon.crouzy.noplp.service;

import fr.lewon.crouzy.noplp.database.entities.Song;

import java.util.List;

public interface MusicService {

    Song getSongByName(String songName) throws Exception;

    Song createNewSong(String songName) throws Exception;

    List<Song> getAllSongs();
}
