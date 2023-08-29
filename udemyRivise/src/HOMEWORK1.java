public class HOMEWORK1 {
    public static void main(String[] args) {
        // creat a sting and if the string is not emty prform the following:
        //if the string has an odd number of charcters and has 3 or more
        // characters, print the charcter in the middle of string.
        // for Exmple string str hello=>
        String str= "hello";
        if (!str.isEmpty()){
            if (str.length()%2!=0&& str.length()>3){
                int middle= str.length()/2;
                System.out.println(str.charAt(middle));

            }
        }

    }
}
