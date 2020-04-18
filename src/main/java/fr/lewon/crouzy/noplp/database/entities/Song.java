package fr.lewon.crouzy.noplp.database.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "song")
public class Song {

    @Id
    private String id;
    private String name;
    private String spotifyId;
    private List<Lyric> lyrics;


    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpotifyId() {
        return this.spotifyId;
    }

    public void setSpotifyId(String spotifyId) {
        this.spotifyId = spotifyId;
    }

    public List<Lyric> getLyrics() {
        return this.lyrics;
    }

    public void setLyrics(List<Lyric> lyrics) {
        this.lyrics = lyrics;
    }
}
