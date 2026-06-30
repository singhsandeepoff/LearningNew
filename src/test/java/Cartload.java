import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class Cartload {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));


        String[] vegetables = {"Brocolli", "Cauliflower", "Cucumber"};
        driver.get("https://rahulshettyacademy.com/seleniumPractise/");
        Thread.sleep(3000);
        addItems(driver, vegetables);
        driver.findElement(By.cssSelector("img[alt='Cart']")).click();
        driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
        w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));

        driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
        driver.findElement(By.cssSelector("button.promoBtn")).click();

        w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));

        System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());


    }

    public static void addItems(WebDriver driver, String[] vegetables) {
        List<WebElement> veg = driver.findElements(By.cssSelector("h4.product-name"));
        int j = 0;

        for (int i = 0; i < veg.size(); i++) {
            //Brocolli - 1 Kg

            String[] name = veg.get(i).getText().split("-");
            // name[0] = Brocolli
            String formattedName = name[0].trim();

            //check whether the name is present in the array or not
            //convert array into array list for easy search

            List vegetableList = Arrays.asList(vegetables);

            if (vegetableList.contains(formattedName)) {
                j++;
                //click on add to cart
                driver.findElements(By.cssSelector("div[class='product-action']")).get(i).click();

                if (j == 3) {
                    break;
                }
            }

        }
    }
}
