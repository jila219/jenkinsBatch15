package ClassA12;
public class StringDemo8 {
    public static void main(String[] args) {
        String str="love java";
        char c=str.charAt(2);
        System.out.println(c);
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));

        }
        int counter= 0;
        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i)=='a')
                counter++;

        }
        System.out.println(counter);

    }
}
