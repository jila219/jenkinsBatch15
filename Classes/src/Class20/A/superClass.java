package Class20.A;

public class superClass {
    superClass(){
        System.out.println("I am a constroctor from the parant class");

    }

}
class SubClass extends superClass{


    SubClass(){
        super();
        System.out.println("i am a child constructor");
    }


}