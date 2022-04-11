package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowserTesting {

    public static void main(String[] args) {

        String baseurl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get(baseurl);
        System.out.println("Page Title: "+driver.getTitle());
        System.out.println("Current URL: "+driver.getCurrentUrl());
        System.out.println("Page Source: "+driver.getPageSource());

        WebElement emailelement = driver.findElement(By.id("Email"));
        emailelement.sendKeys("Prime123@gmail.com");

        WebElement passwordelement = driver.findElement(By.name("Password"));
        passwordelement.sendKeys("Prime123");

        driver.close();
    }
}
