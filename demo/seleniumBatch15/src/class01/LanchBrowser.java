package class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LanchBrowser {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver" , "Drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.facebook.com/");
        //get the current url that is there in browser
        String URL =driver.getCurrentUrl();
        //print out url
        System.out.println(URL);
        // GET THE TITTLE OF THE WEBPAGE
        String title= driver.getTitle();
        // print title of the page
        System.out.println("the title of the page is "+ title);
        // slow down for 3 seconds
        Thread.sleep(3000);
        // close the browser
        driver.quit();





    }
}

