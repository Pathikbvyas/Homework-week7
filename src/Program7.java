
import java.util.Scanner;
public class Program7 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter sales ID: ");
        int id = input.nextInt();
        System.out.print("Enter seller's name: ");
        String name = input.next();
        System.out.print("Enter sales amount: ");
        double salesAmount = input.nextDouble();
        System.out.print("Enter salary basic: ");
        double salaryBasic = input.nextDouble();
        double commission = 0;
        if (salesAmount >= 50000) {
            commission = salesAmount * 35/100;
        } else if (salesAmount >= 30000) {
            commission = salesAmount * 20/100;
        } else if (salesAmount >= 20000) {
            commission = salesAmount * 10/100;
        } else if (salesAmount >= 10000) {
            commission = salesAmount * 5/100;
        }
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Sales amount: " + salesAmount);
        System.out.println("Salary basic: " + salaryBasic);
        System.out.println("Commission: " + commission);
    }
}
