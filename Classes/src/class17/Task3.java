package class17;

public class Task3 {
    public static void main(String[] args) {
    }

    /*    Create a method that will accept a String as a parameter
and return a new String that consist only of vowels.
Method should be available inside the class only
where it was declared and executed by calling it is name.
     */
    //return type => String
    //name => getOnlvowels
   // parameters=> String inputStr

   private static String getOnlvowels(String inputStr){
        return inputStr.replaceAll("[^AEIOUYaeiouy]","");


    }
}
