

package library;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Instant;

public class Home {
    WebDriver driver;


    public Home(WebDriver driver) {
        this.driver = driver;

    }

    //Locator on the page https://demo.guru99.com/
    public By detailButton = By.xpath("//button[@id='details-button']");
    public By proceedLink = By.xpath("//a[@id='proceed-link']");
    //Locator on the first page
    public By emailID = By.xpath("//td[contains(.,'Email ID')]");
    public By emailField = By.xpath("//input[@type='text']");
    public By submitButton = By.xpath("//input[@type='submit']");

    //Locator on the page Login
    public By userID_field = By.xpath("//input[@name='uid']");
    public By passWord_field = By.xpath("//input[@name='password']");


    public void EnterEmail(String strInput) {
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.elementToBeClickable(emailField));
        driver.findElement(emailField).click();
        driver.findElement(emailField).sendKeys(strInput);
        driver.findElement(submitButton).click();
    }

    public void Login(String user, String pass) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(userID_field));
        driver.findElement(userID_field).click();
        driver.findElement(userID_field).sendKeys();
        driver.findElement(passWord_field).click();
        driver.findElement(passWord_field).sendKeys();

    }
}