import java.util.Scanner;
import java.util.regex.Pattern;

public class ScannerClass022 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter your name");
        String name= scanner.nextLine();
        System.out.println("Enter your mobile Number");
        long number= scanner.nextLong();
        System.out.println("Enter your age");
        int age= scanner.nextInt();
        System.out.println("your name is " +name + " ,your age is " + age + " and your mobile number is " + number);

    }

}
