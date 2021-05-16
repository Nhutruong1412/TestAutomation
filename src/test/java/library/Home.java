package library;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
    public By loginButton = By.xpath("//input[@value='LOGIN']");

//locator on the Manager's Page
    public By newCustomer = By.xpath("//a[contains(text(),'New Customer')]");
    public By customerName = By.xpath("//td[contains(text(),'Customer Name')]/following-sibling::td");
    public By gender = By.xpath("//td[contains(text(),'Gender')]/following-sibling::td");
    public By dateOfBirth = By.xpath("//td[contains(text(),'Date of Birth')]/following-sibling::td");
    public By address = By.xpath("//td[contains(text(),'Address')]/following-sibling::td");
    public By city = By.xpath("//td[contains(text(),'City')]/following-sibling::td");
    public By state = By.xpath("//td[contains(text(),'State')]/following-sibling::td");
    public By pin = By.xpath("//td[contains(text(),'PIN')]/following-sibling::td");
    public By mobileNumber = By.xpath("//td[contains(text(),'Mobile Number')]/following-sibling::td");
    public By email = By.xpath("//td[contains(text(),'E-mail')]/following-sibling::td");
    public By password = By.xpath("//td[contains(text(),'Password')]/following-sibling::td");
    public By submitButtonToCreateAccount = By.xpath("//input[@value='Submit']");
    public By resetButtonToClearInformation = By.xpath("//input[@value='Reset']");


    public void EnterEmail(String strInput) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(emailField));
        driver.findElement(emailField).click();
        driver.findElement(emailField).sendKeys(strInput);
        driver.findElement(submitButton).click();
    }

    public void Login(String user, String pass) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(userID_field));
        driver.findElement(userID_field).click();
        driver.findElement(userID_field).sendKeys(user);
        driver.findElement(passWord_field).click();
        driver.findElement(passWord_field).sendKeys(pass);
        driver.findElement(loginButton).click();
    }


}