package it.albertomosconi.designpatters.proxy;

import it.albertomosconi.designpatters.Pattern;

public class ProxyPattern implements Pattern {
    @Override
    public void execute() {
        System.out.println("PROXY PATTERN");

        Image image = new ProxyImage("cats_and_dogs.jpg");

        // the image will be loaded from disk.
        image.display();

        // the image is already loaded, no need to load it again.
        image.display();

        System.out.println();
    }

    @Override
    public String toString() {
        return "Proxy Pattern";
    }
}
