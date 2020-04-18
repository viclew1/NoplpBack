package fr.lewon.crouzy.noplp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class AlreadyExistingSongException extends Exception {

    private static final long serialVersionUID = -3599603311715788913L;

    public AlreadyExistingSongException(String songName) {
        super("Already existing song : [" + songName + "]");
    }
}
