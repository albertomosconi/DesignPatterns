package it.albertomosconi.designpatters.bridge;

public class SquareShape extends Shape {

    private int width;

    public SquareShape(Border border, int width) {
        super(border);
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("Drawing SQUARE.");
        border.drawBorder(width);
    }
}
