package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.Scanner;

public class MultiBrowserTesting {
    static String browser;
    static String baseUrl = "https://demowebshop.tricentis.com/";
    static WebDriver driver;

    public static void main(String[] args) {

        // Getting browser name input that would like to test
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your browser name that you want to test (Any of these: Chrome, Firefox or Edge : ");
        browser = scanner.next();

        // 1. Browser set up with if else condition
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong browser name, Please enter any of these; chrome, edge or firefox");
        }

        // 2. open url
        driver.get(baseUrl);

        // 3.Print title of the page
        System.out.println("The title of page is : " + driver.getTitle());

        // 4.Get current URL
        System.out.println("The current URL is: " + driver.getCurrentUrl());

        // 5.Get page source code
        System.out.println("The page source is below: \n" + driver.getPageSource());

        // 6.Navigate URL to login page
        driver.navigate().to("https://demowebshop.tricentis.com/login");

        // 7. Get current URL
        System.out.println("The current url is: " + driver.getCurrentUrl());

        // 8. Navigate back to home page
        driver.navigate().back();

        // 9. Navigate to login page
        driver.navigate().forward();

        // 10. Print current URL
        System.out.println("The current URL is: " + driver.getCurrentUrl());

        // 11. Refresh the page
        driver.navigate().refresh();

        // 12. Enter the email in the email field
        driver.findElement(By.id("Email")).sendKeys("prashant@gmail.com");

        // 13.Enter the password in the password field.
        driver.findElement(By.id("Password")).sendKeys("Pk123");

        // 14. Click on the Login Button
        driver.findElement(By.className("login-button")).click();

        // 15. Close the browser
        driver.close();
    }
}
