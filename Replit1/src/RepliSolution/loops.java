package RepliSolution;

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        int a = 1;
        while (a <= 3) {
            System.out.println("im while loop");
            a++;

        }
        //when we do not know many times we need to repeat a block of code
        //while or do while
        int b = 1;
        do {
            System.out.println("do while");
            b++;
        } while (b >= 3);
        //ask students if they understand loops?
        //if they don't --> tell them to practice more on loops
        // if they understand --> you good move to array concept
        Scanner scanner = new Scanner(System.in);
        String answer;
        do {
        System.out.println("do you understand loops in java");
        answer = scanner.nextLine();
    } while (!answer.equalsIgnoreCase("yes"));
        System.out.println("Gretjobs, let's learn arrays now");



    }

}
