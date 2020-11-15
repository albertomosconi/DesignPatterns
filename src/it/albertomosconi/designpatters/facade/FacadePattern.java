package it.albertomosconi.designpatters.facade;

import it.albertomosconi.designpatters.Pattern;

public class FacadePattern implements Pattern {
    @Override
    public void execute() {
        System.out.println("FACADE PATTERN");

        System.out.println();
    }

    @Override
    public String toString() {
        return "Facade Pattern";
    }
}
