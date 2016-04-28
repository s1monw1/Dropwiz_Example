package de.swirtz.dropwizard;

import jersey.repackaged.com.google.common.base.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * created on 28.04.2016.
 */
public class WizardStore {
    private static final Logger LOGGER = LoggerFactory.getLogger(WizardStore.class);

    private List<Wizard> wizards;

    public WizardStore() {
        this.wizards = new ArrayList<Wizard>();
    }

    public void store(Wizard wizard) {
        LOGGER.info("add {}", wizard);
        wizards.add(wizard);
    }

    public Wizard get(String name) {
        LOGGER.info("get {}", name);
        java.util.Optional<Wizard> first = wizards.stream().filter(w -> w.getName().equals(name)).findFirst();
        Wizard wizard = first.orElse(new Wizard("null"));LOGGER.info("get found{}", wizard);
        return wizard;
    }
}
