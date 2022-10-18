import java.util.Scanner;
public class Program13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input any number :");
        int day = sc.nextInt();

        System.out.println(getDayName(day));
    }

    //get the name for the week
    public static String getDayName(int day) {
        String dayName = ("");
        switch (day) {
            case 1:
                dayName = (" Monday");
                break;
            case 2:
                dayName = (" Tuesday");
                break;
            case 3:
                dayName = (" Wednesday");
                break;
            case 4:
                dayName = ("Thursday");
                break;
            case 5:
                dayName = (" Friday");
                break;
            case 6:
                dayName = (" Saturday");
                break;
            case 7:
                dayName = ("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }
        return  dayName;
    }


}