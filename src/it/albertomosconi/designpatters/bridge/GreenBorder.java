package it.albertomosconi.designpatters.bridge;

public class GreenBorder implements Border {
    @Override
    public void drawBorder(int width) {
        System.out.println("Drawing GREEN border " + width + "px wide.");
    }
}
