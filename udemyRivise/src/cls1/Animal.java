package cls1;

public  abstract class Animal {

   abstract void speak();
   void sleep(){
      System.out.println("Animals sleep 5 hours");
   }


}
class dog extends Animal{
   @Override
   void speak() {
      System.out.println("gggg");
   }
}
 class cat extends Animal{



    @Override
    void speak() {


    }
 }
