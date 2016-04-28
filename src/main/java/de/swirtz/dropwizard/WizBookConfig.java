package de.swirtz.dropwizard;

import io.dropwizard.Configuration;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.*;
/**
 * @author: Simon
 * created on 28.04.2016.
 */
public class WizBookConfig extends Configuration {

    @NotEmpty
    private String greeting;

    public String getGreeting() {
        return greeting;
    }
}
