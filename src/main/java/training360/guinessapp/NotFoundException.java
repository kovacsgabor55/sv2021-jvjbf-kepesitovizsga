package training360.guinessapp;

import org.zalando.problem.AbstractThrowableProblem;
import org.zalando.problem.Status;

import java.net.URI;

public class NotFoundException extends AbstractThrowableProblem {



    public NotFoundException(String message) {
        super(URI.create("worldrecord/not-found"),
                message,
                Status.NOT_FOUND,
                message
        );
    }
}
