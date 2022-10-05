package shapes;

public class Main {
    public static void main(String[] args) {
        Square s = new Square();
        s.setFillColor("Blue");
        s.setLineColor("Red");
        s.draw();
        System.out.println();

        Triangle t = new Triangle();
        t.setFillColor("Purple");
        t.setLineColor("Orange");
        t.draw();
        System.out.println();

        Octagon o = new Octagon();
        o.setFillColor("Green");
        o.setLineColor("Yellow");
        o.draw();
        System.out.println();
    }
}

class Shape {
    private String fillColor;
    private String lineColor;

    public Shape() {}

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
    public void draw() {
        System.out.printf("My fill color is %s\n", getFillColor());
        System.out.printf("My line color is %s\n", getLineColor());
    }

}

class Square extends Shape {
    private final int sides = 4;

    public Square() {}

    public void draw() {
        System.out.println("I am drawing a square");
        System.out.printf("I have %d sides\n", sides);
        super.draw();
    }

    public int getSides() {
        return sides;
    }

} // ends class Square

class Triangle extends Shape {
    private final int sides = 3;

    public Triangle() {}

    public void draw() {
        System.out.println("I am drawing a triangle");
        System.out.printf("I have %d sides\n", sides);
        super.draw();
    }

    public int getSides() {
        return sides;
    }
} // ends class Triangle

class Octagon extends Shape {
    private final int sides = 8;

    public Octagon() {}

    public void draw() {
        System.out.println("I am drawing an octagon");
        System.out.printf("I have %d sides\n", sides);
        super.draw();
    }

    public int getSides() {
        return sides;
    }
} // ends class Octagon