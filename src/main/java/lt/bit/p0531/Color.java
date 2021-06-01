package lt.bit.p0531;

import java.util.Objects;

//final public class Color {
//
//    public static final Color YELLOW = new Color("Yellow");
//    public static final Color BLACK= new Color("Black");
//    public static final Color WHITE = new Color("White");
//
//
//    final private String name;
//
//    private Color(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    @Override
//    public String toString() {
//        return "Color{" +
//                "name='" + name + '\'' +
//                '}';
//    }
//}

public enum Color {
    YELLOW(255,255,0),
    BLACK(0,0,0),
    WHITE(255,255,255);

    private int r,g,b;

    Color(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getG() {
        return g;
    }

    public void setG(int g) {
        this.g = g;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
