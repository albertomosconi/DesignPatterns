package it.albertomosconi.designpatters.bridge;

public class RedBorder implements Border {
    @Override
    public void drawBorder(int width) {
        System.out.println("Drawing RED border " + width + "px wide.");
    }
}
