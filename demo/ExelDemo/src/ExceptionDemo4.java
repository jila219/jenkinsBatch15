public class ExceptionDemo4 {
    public static void main(String[] args) {
        String name= "abeera";
        if (name.length()<8){
              throw new RuntimeException("this name is not allowed");

        }

    }
}
