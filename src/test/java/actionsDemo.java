import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class actionsDemo {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

//        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));

        driver.get("https://www.amazon.com/");
//
//        List<WebElement> items = driver.findElements(By.cssSelector("a[id='nav-link-accountList']"));
//        w.until(ExpectedConditions.visibilityOfElementLocated(By.id("nav_ya_signin")));

        Actions a = new Actions(driver);
        WebElement move = driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));

        a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("iphone").build().perform();


    }
}
