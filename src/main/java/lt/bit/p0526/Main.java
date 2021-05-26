package lt.bit.p0526;

public class Main {
    
    public static void main(String[] args) {
        
        Brick b = new Brick();
        b.setColor("Red");
//        System.out.println("Brick color is : "+b.getColor());

        Stone s = new Stone();
        s.setColor("White");
//        System.out.println("Stone color is : " + s.getColor());
        
        IColor c = b;

        c.setColor("White");
//        System.out.println(c.getColor());

        printColor(b);
        printColor(s);
    }
    static void printColor(IColor obj) {
        System.out.println("Object color is : " + obj.getColor());
    }
}
