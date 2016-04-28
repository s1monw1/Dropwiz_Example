package de.swirtz.dropwizard;

import io.dropwizard.Application;
import io.dropwizard.setup.Environment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author: Simon
 * created on 28.04.2016.
 */
public class WizBookApp extends Application<WizBookConfig> {

    private static final Logger LOGGER = LoggerFactory.getLogger(WizBookApp.class);

    public static void main(String[] args) throws Exception {
        new WizBookApp().run(args);
    }
    public void run(WizBookConfig wizBookConfig, Environment environment) throws Exception {
            LOGGER.info(wizBookConfig.getGreeting() + ", starting WizBook..");
        environment.jersey().register(new WizardResource(new WizardStore()));
    }
}
