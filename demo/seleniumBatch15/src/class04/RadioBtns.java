package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioBtns {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver" , "Drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
          //  goto syntaxprojects.com
        driver.get("http://practice.syntaxtechs.net/basic-radiobutton-demo.php");

//        click on the radio button Male
               WebElement maleBtn = driver.findElement(By.cssSelector("input[value='Male']"));
               boolean isSelectedmate= maleBtn.isSelected();
     if(!isSelectedmate){
        maleBtn.click();
    }
     isSelectedmate=maleBtn.isSelected();
        System.out.println("the status"+isSelectedmate);
}}
