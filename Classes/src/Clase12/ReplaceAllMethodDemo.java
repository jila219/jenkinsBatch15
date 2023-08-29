package Clase12;

public class ReplaceAllMethodDemo {
    public static void main(String[] args) {
        String str= "FGHNGDnhbsfg123654#@^&*";
        // replaces all upper case letters from A to Z
        System.out.println(str.replaceAll("[A-Z]","#"));
        //replaces all lower case letters from a to z
        System.out.println(str.replaceAll("[a-z]","7"));
        //replaces all lower case from a-z and lower case letters from a- z
        System.out.println(str.replaceAll("[A-Za-z]","#"));
        //do not replaces all lower case from a-z and lower case letters from a- z

        System.out.println(str.replaceAll("[^A-Za-z0-9]","#"));
        //replaces all lower case from a-z and lower case letters from a- z

        System.out.println(str.replaceAll("[^A-Za-z0-9]","#"));

    }
}
