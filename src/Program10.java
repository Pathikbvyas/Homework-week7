import java.util.Scanner;

public class Program10 {
    public static void main(String[] args) {
        char a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number :");
        int No1 = sc.nextInt();

        System.out.println("Enter the second number :");
        int No2 = sc.nextInt();

        System.out.println("Enter the operator you want (+,-,*,/ :");
        a = sc.next().charAt(0);

        if (a == '+') {
            System.out.println("Addition of " + No1 + "+" + No2 + "=" + (No1 + No2));
        } else if (a == '-') {
            System.out.println("Substraction of " + No1 + "-" + No2 + "=" + (No1 - No2));
        } else if (a == '*') {
            System.out.println("Multiplication of " + No1 + "*" + No2 + "=" + (No1 * No2));
        } else if (a == '/') {
            System.out.println("Division of " + No1 + "/" + No2 + "=" + (No1 / No2));
        } else {
            System.out.println("Operator are not available");
        }
    }
}
