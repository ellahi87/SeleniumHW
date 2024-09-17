package HWclass01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FireFoxBrowserAssignment {

    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();

        //go to https://www.syntaxprojects.com/
        driver.get("https://www.syntaxprojects.com/");

        //maximize the screen
        driver.manage().window().maximize();

        //print the current url
        String currentURL=driver.getCurrentUrl();
        System.out.println("the current url of the website is: "+currentURL);

        //print the title
        String title= driver.getTitle();
        System.out.println("the current title of the page is: "+title);

        driver.close();

    }
}
