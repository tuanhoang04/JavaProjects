package PR2.TUT6.EX2;

public class TestMonster {
    public static void main(String[] args) {

        StoneMonster a = new StoneMonster("John");
        Monster b = new WaterMonster("Alex");
        Monster c = new FireMonster("Dylan");

        System.out.println(a.ThrowHands());
        System.out.println(b.name);
        System.out.println(c.attack());
        System.out.println(a.attack());
        Monster x = new Monster();
    }
}
