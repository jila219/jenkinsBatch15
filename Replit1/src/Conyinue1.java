public class Conyinue1 {
    public static void main(String[] args) {
        for (int j = 1; j <= 10; j++) {
            if (j% 3 == 0) {
                System.out.println(j);
                continue;
            }
            System.out.println("hello");
        }
    }
}
