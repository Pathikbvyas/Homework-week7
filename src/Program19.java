import java.util.Scanner;
public class Program19 {

    public static void main(String[] args) {
        averagevalue();
    }
    public static void averagevalue() {

        int[] arr = new int[]{10, 20, 30, 40, 50};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int sum = scanner.nextInt();
        for (int i = 0; i < arr.length; i++)
            sum = sum + arr[i];
        double averagevalue = sum / arr.length;
        System.out.println("average value is:      " + averagevalue);

    }
}
