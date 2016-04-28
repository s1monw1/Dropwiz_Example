package de.swirtz.dropwizard;



/**
 * @author: Simon
 * created on 28.04.2016.
 */
public class Wizard {
    private String name;

    public Wizard(String name) {
        this.name = name;
    }

    public Wizard() {
    }

    @Override
    public String toString() {
        return "Wizard{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
