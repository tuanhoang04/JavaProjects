package PR2.TUT6.EX1;

public class TestShape {
    public static void main(String[] args) {


    Shape a = new Rectangle("Blue",10,16);
    System.out.println(a);
    System.out.println(a.getArea());
    Triangle b = new Triangle("Red", 10,5);
    System.out.println(b);
    System.out.println(b.getArea());

    ((Rectangle) a).length = 20;
        System.out.println(a);
    }
}
