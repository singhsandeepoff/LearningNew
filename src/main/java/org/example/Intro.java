package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Intro {
    public static void main(String[] args) {
        //Invoking browser
        //ChromeDriver driver = new ChromeDriver();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://carmaacarcare.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.close();
    }
}
