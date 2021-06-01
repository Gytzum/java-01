package lt.bit.p0531;

import java.awt.*;
import java.util.Objects;

public class Figure {

    private Position position;
    private Color color;

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Figure figure = (Figure) o;
        return Objects.equals(position, figure.position) && Objects.equals(color, figure.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(position, color);
    }

    @Override
    public String toString() {
        return "Figure{" +
                "position=" + position +
                ", color='" + color + '\'' +
                '}';
    }
}
