package shapes;

public class Main {
    public static void main(String[] args) {
        System.out.println("what");
    }
}

class Square {
    private final int sides = 4;
    private String fillColor;
    private String lineColor;

    public Square() {}

    public void draw() {
        System.out.println("I am drawing a square");
        System.out.printf("I have %d sides", sides);
    }

    public int getSides() {
        return sides;
    }

    public String getFillColor() {
        return fillColor;
    }

    public void setFillColor(String fillColor) {
        this.fillColor = fillColor;
    }

    public String getLineColor() {
        return lineColor;
    }

    public void setLineColor(String lineColor) {
        this.lineColor = lineColor;
    }


}

class Triangle {
    private final int sides = 3;
    private String fillColor;
    private String lineColor;

    public Triangle() {}

    public void draw() {
        System.out.println("I am drawing a triangle");
        System.out.printf("I have %d sides", sides);
    }

    public int getSides() {
        return sides;
    }

    public String getFillColor() {
        return fillColor;
    }

    public void setFillColor(String fillColor) {
        this.fillColor = fillColor;
    }

    public String getLineColor() {
        return lineColor;
    }

    public void setLineColor(String lineColor) {
        this.lineColor = lineColor;
    }
}

class Octagon {
    private final int sides = 8;
    private String fillColor;
    private String lineColor;

    public Octagon() {}

    public void draw() {
        System.out.println("I am drawing an octagon");
        System.out.printf("I have %d sides", sides);
    }

    public int getSides() {
        return sides;
    }

    public String getFillColor() {
        return fillColor;
    }

    public void setFillColor(String fillColor) {
        this.fillColor = fillColor;
    }

    public String getLineColor() {
        return lineColor;
    }

    public void setLineColor(String lineColor) {
        this.lineColor = lineColor;
    }
}