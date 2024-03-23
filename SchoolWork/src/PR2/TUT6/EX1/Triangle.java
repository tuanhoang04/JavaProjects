package PR2.TUT6.EX1;

public class Triangle extends Shape{
    int base;
    int height;
    public Triangle(String color, int base, int height){
        this.color = color;
        this.base = base;
        this.height = height;
    }
    public double getArea(){
        return (double) (base * height) /2;
    }
    public String toString(){
        return "[color="+color+",base="+base+",height="+height+"]";
    }
}
