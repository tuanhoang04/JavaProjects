package PR2.TUT6.EX3;

public class MovablePoint implements Movable{
    int x;
    int y;
    public MovablePoint(int x, int y){
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return "[x="+x+",y="+y+"]";
    }

    @Override
    public void moveUp() {
        y = y-1;
    }
    public void moveDown(){
        y = y+1;
    }
    public void moveRight(){
        x= x+1;
    }
    public void moveLeft(){
        x= x-1;
    }
}
