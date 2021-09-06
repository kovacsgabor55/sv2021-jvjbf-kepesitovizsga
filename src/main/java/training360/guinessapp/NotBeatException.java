package training360.guinessapp;

import org.zalando.problem.AbstractThrowableProblem;
import org.zalando.problem.Status;

import java.net.URI;

public class NotBeatException extends AbstractThrowableProblem {

    public NotBeatException(String message) {
        super(URI.create("worldrecord/not-beat"),
                message,
                Status.BAD_REQUEST,
                message
        );
    }
}
