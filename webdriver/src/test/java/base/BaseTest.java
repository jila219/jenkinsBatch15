package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.util.List;

public class BaseTest {
    private WebDriver driver;

    public void setUp(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\kaoul\\OneDrive\\Desktop\\chromedriver.exe");
        driver= new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");



        WebElement inputslink= driver.findElement(By.linkText("Inputs"));
        inputslink.click();





        System.out.println(driver.getTitle());

    }

    public static void main(String[] args) {
        BaseTest test= new BaseTest();
        test.setUp();

    }

}
