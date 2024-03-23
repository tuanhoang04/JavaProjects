package PR2.TUT5.EX2;

public class MovablePoint extends Point{
    private float x;
    private float y;
    private float xSpeed= 0;
    private float ySpeed = 0;

    MovablePoint(float x, float y, float xSpeed, float ySpeed){
        this.setX(x);
        this.setY(y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    MovablePoint(){}

    public void setXSpeed(float newXSpeed){
        this.xSpeed = newXSpeed;
    }
    public void setYSpeed(float newYSpeed){
        this.ySpeed = newYSpeed;
    }
    public void setSpeed(float newxspeed, float newyspeed){
        this.xSpeed = newxspeed;
        this.ySpeed = newyspeed;
    }
    public float getXSpeed(){
        return this.xSpeed;
    }
    public float getYSpeed(){
        return this.ySpeed;
    }
    public float[] getSpeed(){
        return new float[]{this.xSpeed,this.ySpeed};
    }

    //@Override
    public String toString(){
        return "("+getX()+"),("+getY()+"),speed=("+xSpeed+","+ySpeed+")";
    }
    public void move(){
        setX(getX()+xSpeed);
        setY(getY()+ySpeed);
    }

    public static void main(String[] args){
        MovablePoint a = new MovablePoint(1,2,3,4);
        a.move();
//        a.setSpeed(3.2f,3.5f);
        System.out.println(a);
    }
}

