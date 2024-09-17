package HWclass01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommandsAssignment {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();

        //maximize the screen
        driver.manage().window().maximize();

        //navigate to www.google.com
        driver.navigate().to("https://www.google.com/");
        Thread.sleep(2000);

        //print the title
        String title= driver.getTitle();
        System.out.println("the current title of the page is: "+title);

        //navigate to https://www.syntaxprojects.com/
        driver.navigate().to("https://www.syntaxprojects.com/");
        Thread.sleep(2000);

        //print the title
        String title2= driver.getTitle();
        System.out.println("the current title of the page is: "+title2);

        //navigate back to www.google.com
        driver.navigate().back();
        Thread.sleep(2000);

        //refresh www.google.com site
        driver.navigate().refresh();
        Thread.sleep(2000);

        driver.close();
    }
}
