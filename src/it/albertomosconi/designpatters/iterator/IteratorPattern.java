package it.albertomosconi.designpatters.iterator;

import it.albertomosconi.designpatters.Pattern;

public class IteratorPattern implements Pattern {
    @Override
    public void execute() {
        System.out.println("ITERATOR PATTERN");

        System.out.println();
    }

    @Override
    public String toString() {
        return "Iterator Pattern";
    }
}
