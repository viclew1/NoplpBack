package fr.lewon.crouzy.noplp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class MissingParameterException extends Exception {

    private static final long serialVersionUID = 3816912723606498250L;

    public MissingParameterException(String parameterName) {
        super("Needed parameter empty or null : [" + parameterName + "]");
    }
}
