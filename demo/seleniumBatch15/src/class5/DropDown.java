package class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver" , "Drivers/chromedriver.exe");

        WebDriver driver= new ChromeDriver();
        driver.manage().window();

        driver.get
        WebElement dropDown= driver.findElement(By.xpath("//select[@id='select-demo']"));

    }
}
