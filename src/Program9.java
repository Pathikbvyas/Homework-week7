
import java.util.Scanner;

public class Program9 {
    public static void main(String[] args) {
        Scanner letter = new Scanner(System.in);
        String a = letter.nextLine();

        switch (a.toUpperCase()){
            case "A" :
                System.out.println("City is Agra");
                break;
            case "B" :
                System.out.println("City is Baroda");
                break;
            case "C" :
                System.out.println("City is Calcutta");
                break;
            case "D" :
                System.out.println("City is Delhi");
                break;
            case "E" :
                System.out.println("City is Edinburgh");
                break;
            case "F" :
                System.out.println("City is Farnborough");
                break;

            default:
                System.out.println("Error: Invalid entry");




        }


    }
}