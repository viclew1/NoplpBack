package fr.lewon.crouzy.noplp.database.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "lyric")
public class Lyric {

    @Id
    private String id;
    private Long timing;
    private String text;

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getTiming() {
        return this.timing;
    }

    public void setTiming(Long timing) {
        this.timing = timing;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
