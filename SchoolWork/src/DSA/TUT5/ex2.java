package DSA.TUT5;
import java.util.*;

public class ex2 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the number of strings (n): ");
            int n = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter the list of strings (each of length m):");
            String[] strings = new String[n];
            for (int i = 0; i < n; i++) {
                strings[i] = scanner.nextLine();
            }

            Arrays.sort(strings);

            System.out.println("Sorted list of strings:");
            for (String str : strings) {
                System.out.println(str);
            }

            scanner.close();
    }
}
