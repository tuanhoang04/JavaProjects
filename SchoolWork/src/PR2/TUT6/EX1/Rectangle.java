package PR2.TUT6.EX1;

public class Rectangle extends Shape{
    int length;
    int width;

    public Rectangle(String color, int length, int width){
        this.length = length;
        this.width = width;
        this.color = color;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public double getArea(){
        return (double) this.width*this.length;
    }

    @Override
    public String toString() {
        return "[color="+color+ ",length="+length+",width="+width+"]";
    }
}
