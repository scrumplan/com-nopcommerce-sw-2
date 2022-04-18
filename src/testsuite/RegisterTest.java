package testsuite;

import browserfactory.BaseTest;
import com.google.common.base.Verify;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldNavigateToRegisterPageSuccessfully(){
        String expectedMessage ="Register";
        //click on the ‘Register’ link, Verify the text ‘Register
        WebElement register = driver.findElement(By.linkText("Register"));
        register.click();
        WebElement actualMessageElement = driver.findElement(By.xpath("//h1[contains(text(),'Register')]"));
        String actualMessage = actualMessageElement.getText();
        Assert.assertEquals("Register tab is not matching",expectedMessage,actualMessage);

    }
    @Test
    public void userShouldRegisterAccountSuccessfully(){
        String expectedMessage ="Your registration completed";
        //click on the ‘Register’ link
        WebElement register = driver.findElement(By.linkText("Register"));
        register.click();
        //Select gender radio button
        WebElement radioButton = driver.findElement(By.id("gender-female"));
        radioButton.click();
        //Enter First name
        WebElement firstName = driver.findElement(By.id("FirstName"));
        firstName.sendKeys("Lalita");
        //Enter Last name
        WebElement lastName = driver.findElement(By.id("LastName"));
        lastName.sendKeys("Desai");
        //Select Day Month and Year
        WebElement dayOfBirthday = driver.findElement(By.name("DateOfBirthDay"));
        dayOfBirthday.sendKeys("5");
        WebElement dateOfBirthMonth = driver.findElement(By.name("DateOfBirthMonth"));
        dateOfBirthMonth.sendKeys("May");
        WebElement dateOfBirthYear = driver.findElement(By.name("DateOfBirthYear"));
        dateOfBirthYear.sendKeys("1980");
        //Enter Email address
        WebElement emailId = driver.findElement(By.id("Email"));
        emailId.sendKeys("Lalita1234@gmail.com");
        // Enter Password
        WebElement password = driver.findElement(By.id("Password"));
        password.sendKeys("Lalita123");
        //Enter Confirm password
        WebElement confirmPassword = driver.findElement(By.id("ConfirmPassword"));
        confirmPassword.sendKeys("Lalita123");
        //Click on REGISTER button
        WebElement registerButton= driver.findElement(By.id("register-button"));
        registerButton.click();


    }
    @After
    public void tearDown() {
        closeBrowser();

}}
