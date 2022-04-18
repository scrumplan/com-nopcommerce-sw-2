package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        //click on the ‘Login’ link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();

        //This is from requirement
        String expectedMessage = "Welcome, Please Sign In!";

        //find the welcome text element and get the text
        WebElement actualMessageElement = driver.findElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));
        String actualMessage = actualMessageElement.getText();

        Assert.assertEquals("Login page message is not matching", expectedMessage, actualMessage);

    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        String expectedMessage = "Log out";

        //Enter valid username
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("Lalita1234@gmail.com");

        //Enter valid password
        WebElement password = driver.findElement(By.id("Password"));
        password.sendKeys("Lalita123");

        //Click on ‘LOGIN’ button
        WebElement login = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
        login.click();

        WebElement actualMessageElement = driver.findElement(By.xpath("//a[contains(text(),'Log out')]"));
        String actualMessage = actualMessageElement.getText();

        Assert.assertEquals("Log out text is not matching", expectedMessage, actualMessage);


    }

    @Test
    public void verifyTheErrorMessage() {
        String expectedMessage = "Login was unsuccessful. Please correct the errors and try again.\n"
                + "No customer account found";

        //click on the ‘Login’ link
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();

        //Enter invalid username
        WebElement username = driver.findElement(By.id("Email"));
        username.sendKeys("abcd1234@gmail.com");

        //Enter invalid password
        WebElement password = driver.findElement(By.id("Password"));
        password.sendKeys("abcd1234");

        //Click on Login button
        WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
        loginButton.click();

        //Verify the error message
        WebElement actualMessageElement = driver.findElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]"));
        String actualMessage = actualMessageElement.getText();

        Assert.assertEquals("Error Message not displayed", expectedMessage, actualMessage);

    }

    @After
    public void tearDown() {
        closeBrowser();
    }


}
