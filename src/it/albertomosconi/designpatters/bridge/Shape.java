package it.albertomosconi.designpatters.bridge;

public abstract class Shape {

    protected Border border;

    protected Shape(Border border) {
        this.border = border;
    }

    public abstract void draw();

}
