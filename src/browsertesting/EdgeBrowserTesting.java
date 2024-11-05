package browsertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

/**
 * Project-1 - ProjectName: com-tricentis
 * BaseUrl = https://demowebshop.tricentis.com/
 * 1. Set up Chrome browser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current URL.
 * 5. Print the page source.
 * 6. Navigate to Url. “https://demowebshop.tricentis.com/login ”
 * 7. Print the current URL.
 * 8. Navigate back to the home page.
 * 9. Navigate to the login page.
 * 10. Print the current URL.
 * 11. Refresh the page.
 * 12. Enter the email in the email field.
 * 13. Enter the password in the password field.
 * 14. Click on the Login Button.
 * 15. Close the browser.
 */
public class EdgeBrowserTesting {

    public static void main(String[] args) {

        String baseUrl = "https://demowebshop.tricentis.com/";

        // 1. Launch the chrome browswer
        WebDriver driver = new EdgeDriver();

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
