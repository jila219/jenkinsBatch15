import java.util.Scanner;

public class NestLoops {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String name="";
       do {
            System.out.println("Enter your name:");
            name= scanner.nextLine();


        }while (name.isBlank());
        System.out.println("hello " + name);
        for (int i= 0; i<=10; i++){
            System.out.println(i);

        }
        System.out.println("happy birthday nelson");












    }
}
