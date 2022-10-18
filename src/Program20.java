import java.util.Scanner;
public class Program20 {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15,};
        Scanner abc1 = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int tofind = abc1.nextInt();
        boolean found = false;
        for (int n : num) {
            if (n == tofind) {
                found = true;
                break;

            }
        }

        if (found)
            System.out.println(tofind + "    is found");
        else
            System.out.println(tofind + "     is not found");
    }
}
