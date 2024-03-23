package PR2.TUT6.EX2;

public class FireMonster extends Monster{

public FireMonster() {
    System.out.println("child");
}

    public FireMonster(String name){
        this.name = name;
    }
    public String attack(){
        return "Fire";
    }
}
