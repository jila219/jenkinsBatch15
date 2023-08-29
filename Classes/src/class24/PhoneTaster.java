package class24;

public class PhoneTaster {
    public static void main(String[] args) {
        Phone[] phones={new iphone(),new google(),new samsang()};
        for (Phone po:phones) {
            po.displayPucture();
            po.sendtext();
            po.unlockPhone();


        }
    }
}
