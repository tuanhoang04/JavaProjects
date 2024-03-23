package PR2.TUT5;
import java.util.Scanner;
public class EX4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please type in a number: ");
        int a = sc.nextInt();
        sc.close();
        if(a == 1) {
            System.out.println(1);
        }else{
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < a; j++) {
                    if(j==0 || j==a-1){
                        System.out.print(1);
                    }
                }
                System.out.println();
            }
        }
    }
}
