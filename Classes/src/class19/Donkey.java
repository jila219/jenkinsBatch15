package class19;

public class Donkey {
    String name;
    int age;
    double weight;
    Donkey(String name, int age){
        this.name=name;
        this.age=age;
    }
    void print(){
        System.out.println("DONKEY "+name+" age is "+age);
    }
}
