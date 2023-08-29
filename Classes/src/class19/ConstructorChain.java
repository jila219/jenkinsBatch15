package class19;

public class ConstructorChain {

    ConstructorChain(){

        System.out.println("Im non argument constructor");
    }
    ConstructorChain(String str){
        this();
        System.out.println(str);

    }
    ConstructorChain(int number){

    }

    public static void main(String[] args) {
        ConstructorChain obj= new ConstructorChain();
    }




}















