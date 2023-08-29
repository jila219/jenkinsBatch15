public class recap1 {
    public static void main(String[] args) {
        String str= "java is great";
        for (int i = 0; i <=str.length(); i++) {
            System.out.println(str.charAt(i));


        }
        int count =0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='i'){
                count++;
            }

        }
        System.out.println("letter a has appeared"+count+"many times");



    }

}
