package class01;

import org.testng.annotations.Test;

public class priority {
    @Test(priority = 2)
    public void ATEST(){
        System.out.println("im 1");


    }
    @Test(priority = 3)
public void BTEST(){
        System.out.println("im 2");


    }
    @Test(priority = 1)
public void CTEST(){
        System.out.println("im 3");


    }
}
