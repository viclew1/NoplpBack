package fr.lewon.crouzy.noplp.rest;

import fr.lewon.crouzy.noplp.database.entities.Song;
import fr.lewon.crouzy.noplp.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SongController {

    @Autowired
    private MusicService musicService;

    @GetMapping("/song/all")
    public ResponseEntity<List<Song>> getAllSongs() {
        return new ResponseEntity<>(this.musicService.getAllSongs(), HttpStatus.OK);
    }

    @GetMapping("/song")
    public ResponseEntity<Song> getSongByName(@RequestParam String songName) throws Exception {
        return new ResponseEntity<>(this.musicService.getSongByName(songName), HttpStatus.OK);
    }

    @PostMapping("/insert")
    public ResponseEntity<Song> saveSong(@RequestParam String songName) throws Exception {
        return new ResponseEntity<>(this.musicService.createNewSong(songName), HttpStatus.CREATED);
    }
}
