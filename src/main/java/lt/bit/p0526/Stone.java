package lt.bit.p0526;

public class Stone implements IColor{
    private String color;

    public String getColor() {
        return color;
    }

    @Override
    public void darker() {

    }

    public void setColor(String color) {
        this.color = color;
    }
}
