package RepliSolution;

import java.util.Scanner;

public class Conditionalstatment025 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("In:");
        int num = scanner.nextInt();
        //DO NOT CHANGE ABOVE CODE!  Write your code below
        if (num>0){
            System.out.println(num +" "+"is positive");

        } else if (num <0){
            System.out.println(num+ " "+"is negative");


            }else if (num==0){
            System.out.println("entred number is equals to 0");
        }


    }
}
