package it.albertomosconi.designpatters.proxy;

import it.albertomosconi.designpatters.Pattern;

public class ProxyPattern implements Pattern {
    @Override
    public void execute() {
        System.out.println("PROXY PATTERN");

        System.out.println();
    }

    @Override
    public String toString() {
        return "Proxy Pattern";
    }
}
