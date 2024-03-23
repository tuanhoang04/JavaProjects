import java.lang.Character;
public class leet1 {
    public static int lengthOfLastWord(String s) {
        String[] a = s.trim().split(" ");
        System.out.println( a[a.length-1].length());
        return a[a.length-1].length();
    }

    public static void main(String[] args) {
        lengthOfLastWord("   uoi uoi vcl ");
    }
}