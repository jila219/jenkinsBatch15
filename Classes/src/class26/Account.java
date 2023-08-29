package class26;

public class Account {
    double balance;
    String accountNumber;
    String type;
    String accountTittle;
    public void setBalance(double balance){

    }

    public Account(double balance, String accountNumber, String type, String accountTittle) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.type = type;
        this.accountTittle = accountTittle;
    }
}
class Acountster{
    public static void main(String[] args) {
        Account account= new Account(-1000,"yjhergrg","kjhjth","hjryhrgr");
        account.balance=-586;

    }
}