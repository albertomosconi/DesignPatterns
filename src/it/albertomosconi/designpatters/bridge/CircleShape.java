package it.albertomosconi.designpatters.bridge;

public class CircleShape extends Shape {

    private int width;

    public CircleShape(Border border, int width) {
        super(border);
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("Drawing CIRCLE.");
        border.drawBorder(width);
    }
}
