package it.albertomosconi.designpatters.bridge;

import it.albertomosconi.designpatters.Pattern;

public class BridgePattern implements Pattern {
    @Override
    public void execute() {
        System.out.println("BRIDGE PATTERN");

        Shape greenSquare = new SquareShape(new GreenBorder(), 10);
        Shape greenCircle = new CircleShape(new GreenBorder(), 100);
        Shape redCircle = new CircleShape(new RedBorder(), 20);

        greenSquare.draw();
        greenCircle.draw();
        redCircle.draw();

        System.out.println();
    }

    @Override
    public String toString() {
        return "Bridge Pattern";
    }
}
