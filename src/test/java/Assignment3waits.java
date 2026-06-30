import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Assignment3waits {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.manage().window().maximize();

        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));

        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("password")).sendKeys("Learning@830$3mK2");
        driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();
        w.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
        driver.findElement(By.id("okayBtn")).click();

        WebElement dropDown = driver.findElement(By.cssSelector("select.form-control"));
        Select dropdown = new Select(dropDown);

        Thread.sleep(3000);
        dropdown.selectByVisibleText("Consultant");

        driver.findElement(By.id("terms")).click();
        driver.findElement(By.id("signInBtn")).click();

        List<WebElement> items = driver.findElements(By.cssSelector("button[class*='btn-info']"));
        w.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));

        for (int i = 0; i < items.size(); i++)
        {
            items.get(i).click();
        }
        driver.findElement(By.partialLinkText("Checkout")).click();}

}

