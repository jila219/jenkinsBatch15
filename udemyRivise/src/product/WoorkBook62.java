package product;

public class WoorkBook62 {
    public static void main(String[] args) {
        String aisles[]= {"apples","bananas","candy","chocolate","coffee","tea"};
        System.out.println("do you sel coffee?");
        for (int i = 0; i < aisles.length; i++) {
            if (aisles[i].equals("coffee")) {
                System.out.println("we have that in aisle "+i);
                break;
            }

        }



    }



}
