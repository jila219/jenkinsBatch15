import java.util.Scanner;

public class WhileRecap {
    public static void main(String[] args) {

        int number=10;
        while (number<20){
            System.out.println(number<20);
            System.out.println(number);
            number++;

        }
        /* Creat  a bolean varibale workday and assign true creat int variable
        day
         */
        boolean workday= true;
        int day= 1;
        while (workday){
            if (day<=5){
                System.out.println("i need a day off");
            }else {
                System.out.println("i dont need any day any more");
                workday= false;

            }
            day++;
        }
        int number1= 5;

        Scanner scan1= new Scanner(System.in);
        number1= scan1.nextInt();
        while (number1!=5){
            System.out.println("please enter a name");
            number1++;

    }
}}
