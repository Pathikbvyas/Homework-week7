import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        String name, result, Grade;
        int RollNo, Maths, Science, English, Total, Percentage, Marks;

        Scanner report = new Scanner(System.in);

        System.out.println("please enter your name :");
        name = report.nextLine();
        System.out.println("please enter your roll no:");
        RollNo = report.nextInt();
        System.out.println("please enter your Maths Marks :");
        Maths = report.nextInt();
        System.out.println("please enter your Science Marks:");
        Science = report.nextInt();
        System.out.println("please enter your English Marks :");
        English = report.nextInt();

        Total = Maths + Science + English;
        if (Maths >= 0 && Maths <= 100 && Science >= 0 && Science <= 100 && English >= 0) ;
        Percentage = Total / 3;

        if (Maths >= 35 && Science >= 35 && English >= 35) {
            result = "pass";
        } else {
            result = "Fail";
        }

        Grade = report.nextLine();
        if (Percentage >= 80) {
            Grade = "A";
        } else if (Percentage >= 60) {
            Grade = "A";
        } else if (Percentage >= 50) {
            Grade = "B";
        } else if (Percentage >= 35) {
            Grade = "C";
        } else {
            System.out.println("Invalid input, Marks should be between 0 to 100");
    }
        System.out.println("----------------------------------------|");
        System.out.println("|                                       | ");
        System.out.println("|             Mark Sheet                |");
        System.out.println("| ------------------------------------- |");
        System.out.println("|     Name   : "  + name +  "           | ");
        System.out.println("|   RollNo   : " + RollNo +  "          |");
        System.out.println("|---------------------------------------|");
        System.out.println("|       Subject  :  Marks               |");
        System.out.println("|---------------------------------------|");
        System.out.println("|     Maths  : " + Maths + "            |");
        System.out.println("|    Science : " + Science + "          |");
        System.out.println("|    English : " + English + "          |");
        System.out.println("|---------------------------------------|");
        System.out.println("|     Total  : " + Total + "            |");
        System.out.println("|    Percentage :" + Percentage + "     |");
        System.out.println("|     Result  : " + result + "          |");
        System.out.println("|      Grade  : " + Grade + "           |");




    }
}
