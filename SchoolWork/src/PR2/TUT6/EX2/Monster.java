package PR2.TUT6.EX2;
public class Monster {
    String name;
    public Monster() {
        if (getClass() == Monster.class) {
            throw new RuntimeException("Error: Cannot directly create an instance of Monster. Please create an instance of a subclass.");
        }
    }
    public String attack(){
     return "";
    }
    public String ThrowHands(){
        return "hands";
    }
}
