import java.util.Scanner;
public class Program16 {
    int num;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = input.nextInt();
        if (num > 0)
            System.out.println(num + " is a positive number");
        else if (num < 0)
            System.out.println(num + " is a negative number");
        else
            System.out.println(num + " is a zero");
    }
}
