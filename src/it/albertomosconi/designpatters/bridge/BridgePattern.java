package it.albertomosconi.designpatters.bridge;

import it.albertomosconi.designpatters.Pattern;

public class BridgePattern implements Pattern {
    @Override
    public void execute() {
        System.out.println("BRIDGE PATTERN");

        System.out.println();
    }

    @Override
    public String toString() {
        return "Bridge Pattern";
    }
}
