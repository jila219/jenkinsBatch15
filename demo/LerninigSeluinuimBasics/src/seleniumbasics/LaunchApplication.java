package seleniumbasics;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchApplication {
    public static void main(String[] args) {
        //1. open the browser
        

    }
}

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\kaoul\\Downloads\\selenium instalation files\\chromedriver_win32 (6)\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")
        
    }
