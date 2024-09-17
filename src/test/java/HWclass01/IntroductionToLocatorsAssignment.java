package HWclass01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IntroductionToLocatorsAssignment {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();

        //maximize the screen
        driver.manage().window().maximize();

        //navigate to https://www.syntaxprojects.com/locator-homework.php
        driver.navigate().to("https://www.syntaxprojects.com/locator-homework.php");

        //find and enter info for Full Name:
        WebElement fullName= driver.findElement(By.id("fullName"));
        fullName.sendKeys("Full Name");

        //find and enter info for Email:
        WebElement email= driver.findElement(By.name("yourEmail"));
        email.sendKeys("something@gmail.com");

        //find and enter info for Client Name:
        WebElement clientName=driver.findElement(By.id("clientNameId"));
        clientName.sendKeys("Someclient Name");

        //find and enter info for Client ID:
        WebElement clientID=driver.findElement(By.id("ClientId"));
        clientID.sendKeys("Someclient ID");

        //find and enter info for Client Feedback:
        WebElement clientFeedback=driver.findElement(By.name("Clientfeedback"));
        clientFeedback.sendKeys("Some client feedback.");

        //find and enter info for Project Name:
        WebElement projectName= driver.findElement(By.name("ProjectName"));
        projectName.sendKeys("Someproject name");

        //find and enter info for Project Deadline Time:
        WebElement projectDeadlineTime=driver.findElement(By.name("ProjectTime"));
        projectDeadlineTime.sendKeys("Somedeadline time");

        //find and enter info for Current Address:
        WebElement currentAddress=driver.findElement(By.id("CurrentAddressId"));
        currentAddress.sendKeys("Some generic address");

        //find and enter info for Permanent Address:
        WebElement permanentAddress=driver.findElement(By.id("PermanentAddressId"));
        permanentAddress.sendKeys("Some permanent address");

        //click Click Here. button:
        WebElement click=driver.findElement(By.linkText("Click Here."));
        click.click();

        //click Submit button:
        WebElement submit=driver.findElement(By.id("btn-submit"));
        click.click();

        Thread.sleep(5000);
        driver.quit();


    }
}
