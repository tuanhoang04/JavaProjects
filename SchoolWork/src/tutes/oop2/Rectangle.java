package tutes.oop2;

public class Rectangle {
	private float length = 1.0f;
	private float width = 1.0f;
	
	public Rectangle() {}
	public Rectangle(float length, float width) {
		this.length = length;
		this.width = width;
	}
	
	public float getLength(){
		return length;
	}
	public void setLength(float newlength) {
		this.length = newlength;
	}
	
	public float getWidth() {
		return width;
	}
	public void setWidth(float newwidth) {
		this.width = newwidth;
	}
	
	public double getArea(){
		return width*length;
	}
	public double getPerimeter() {
		return (width+length)*2;
	}
	
	public String toString() {
		return "Rectangle" +"[length=" +length+",width="+width+"]";
	}

	
}
