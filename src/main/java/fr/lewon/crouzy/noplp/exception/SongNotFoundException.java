package fr.lewon.crouzy.noplp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class SongNotFoundException extends Exception {

    private static final long serialVersionUID = 1629710752318454642L;

    public SongNotFoundException(String name) {
        super("Song not found : [" + name + "]");
    }

}
