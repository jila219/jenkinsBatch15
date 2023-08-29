package class2;

import class1.Main;

import java.util.Scanner;

public class ScannerEXMPLE {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("bank Account balance");
        int bankAccount= scan.nextInt();
        while (bankAccount>0){
            System.out.println(bankAccount);
            bankAccount-=1000;
            System.out.println("bank Account Balnce is $"+bankAccount+".");

        }
        if (bankAccount==0){
            System.out.println("you are broke, go find a job");
            System.out.println("did you found a new job");
            System.out.println("did you find new job");
        }
    }
}
