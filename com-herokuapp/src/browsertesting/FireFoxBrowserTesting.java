package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowserTesting {
    public static void main(String[] args) {

        String baseurl = "http://the-internet.herokuapp.com/login";
        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        // get method will launch the url
        driver.get(baseurl);

        // to get the title of page we use the getTitle method and here we are assigning that title to string variable title and print
        String title = driver.getTitle();
        System.out.println("Current Title: "+title);

        //Get current URL we use getCurrentUrl method, here we are using method inside print statement
        System.out.println("Current URL: "+driver.getCurrentUrl());

        // Get page source we use getPageSource method
        System.out.println("Page Source: "+driver.getPageSource());

        // Find the email field element
        WebElement emailField = driver.findElement(By.id("username"));
        // Sending email to email field element
        emailField.sendKeys("prime123@gmail.com");

        // Find the password field element
        WebElement passwordfield = driver.findElement(By.name("password"));
        // Sending password to password field element
        passwordfield.sendKeys("Prime123");

        driver.close();
    }
}
