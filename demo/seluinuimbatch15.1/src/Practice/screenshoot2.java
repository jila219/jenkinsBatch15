package Practice;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class screenshoot2 {
    public static void main(String[] args) throws IOException {
        //tell your project where the webdriver is located
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        //creat an instance of webdriver
        WebDriver driver = new ChromeDriver();
        // max the windows
        driver.manage().window().maximize();
        //go to syntax Hrms application and login and go to the pim option
        // go to the website
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
        //username Text box
        WebElement username= driver.findElement(By.xpath("//input[@id='ctl00_MainContent_username']"));
        username.sendKeys("Tester");
        //password field
        WebElement pass= driver.findElement(By.xpath("//input[@id='ctl00_MainContent_password']"));
        pass.sendKeys("test");
        //password filed
        TakesScreenshot ss= (TakesScreenshot) driver;
        // take sceern shot as file
        File sourceFile =ss.getScreenshotAs(OutputType.FILE);
        // saved the file in computer
        FileUtils.copyFile(sourceFile,new File("C:/Users/kaoul/IdeaProjects/demo/seluinuimbatch15.1/src/screenshot/abc.png"));


    }
}
