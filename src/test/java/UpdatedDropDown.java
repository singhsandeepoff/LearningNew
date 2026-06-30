import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class UpdatedDropDown {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected()); // should return false
        driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
        System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected()); // should return true

        //count the number of checkboxes

        System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());



        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(1000);

//        int i=1;
//        while(i<5)
//        {
//            driver.findElement(By.id("hrefIncAdt")).click();
//            i++;
//        }
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
        for (int i=1;i<5;i++)
        {
            driver.findElement(By.id("hrefIncAdt")).click();
        }

        driver.findElement(By.id("btnclosepaxoption")).click();
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());


    }
}

