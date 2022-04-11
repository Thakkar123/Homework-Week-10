package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowserTesting {

    public static void main(String[] args) {

            String baseurl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
            System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
            WebDriver driver = new EdgeDriver();

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
