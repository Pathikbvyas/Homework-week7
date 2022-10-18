import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        oddeven();
    }

    public static void oddeven() {
        met1();
    }

    public static void met1() {
        Scanner sc = new Scanner(System.in);
        int a;
        String output;
        System.out.println("Enter any number");
        a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println("Entered number is Even");
        } else {
            System.out.println("Entered number is odd");
        }
    }
}