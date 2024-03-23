package PR2.TUT5.EX2;

public class Point {
    private float x=0;
    private float y=0;

    public Point(){};
    private Point(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return this.x;
    }
    public void setX(float newx){
        this.x=newx;
    }
    public float getY() {
        return this.y;
    }
    public void setY(float newy){
        this.y=newy;
    }

    public void setXY(float newx, float newy){
        this.x = newx;
        this.y= newy;
    }

    public float[] getXY(){
        float[] a = {this.x, this.y};
        return a;
    }
    //@Override
    public String toString(){
        return "(" + this.x+","+this.y+")";
    }
}
