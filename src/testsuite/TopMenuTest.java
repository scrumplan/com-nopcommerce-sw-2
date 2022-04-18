package testsuite;

import browserfactory.BaseTest;
import com.google.common.base.Verify;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TopMenuTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }
    @Test
    public void userShouldNavigateToComputerPageSuccessfully(){
        String expectedMessage = "Computers";

        //click on the ‘Computers’ Tab
        WebElement computerTab = driver.findElement(By.linkText("Computers"));
        computerTab.click();
        WebElement actualMessageElement = driver.findElement(By.xpath("//h1[contains(text(),'Computers')]"));
        String actualMessage = actualMessageElement.getText();
        Assert.assertEquals("computer tab is not matching",expectedMessage,actualMessage);
    }
    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully(){
        String expectedMessage = "Electronics";
        //click on the ‘Electronics’ Tab ,Verify the text ‘Electronics’
        WebElement electronics = driver.findElement(By.linkText("Electronics"));
        electronics.click();
        WebElement actualMessageElement = driver.findElement(By.xpath("//h1[contains(text(),'Electronics')]"));
        String actualMessage = actualMessageElement.getText();
        Assert.assertEquals("Electronics tab is not matching",expectedMessage,actualMessage);

    }
    @Test
    public void userShouldNavigateToApparelPageSuccessfully(){
        String expectedMessage = "Apparel";
        //click on the ‘Apparel’ Tab,Verify the text ‘Apparel
        WebElement apparel = driver.findElement(By.linkText("Apparel"));
        apparel.click();
        WebElement actualMessageElement = driver.findElement(By.xpath("//h1[contains(text(),'Apparel')]"));
        String actualMessage = actualMessageElement.getText();
        Assert.assertEquals("Apparel tab is not matching",expectedMessage,actualMessage);
    }
    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully(){
        String expectedMessage ="Digital downloads";
        //click on the ‘Digital downloads’ Tab Verify the text ‘Digital downloads’
        WebElement digitalDownloads = driver.findElement(By.linkText("Digital downloads"));
        digitalDownloads.click();
        WebElement actualMessageElement = driver.findElement(By.xpath("//h1[contains(text(),'Digital downloads')]"));
        String actualMessage = actualMessageElement.getText();
        Assert.assertEquals("Digital Downloads tab is not matching",expectedMessage,actualMessage);

    }
    @Test
    public void userShouldNavigateToBooksPageSuccessfully(){
        String expectedMessage = "Books";
        //* click on the ‘Books’ Tab ,Verify the text ‘Books’
        WebElement books = driver.findElement(By.linkText("Books"));
        books.click();
        WebElement actualMessageElement = driver.findElement(By.xpath("//h1[contains(text(),'Books')]"));
        String actualMessage = actualMessageElement.getText();
        Assert.assertEquals("Books tab is not matching",expectedMessage,actualMessage);

    }
    @Test
    public void userShouldNavigateToJewelryPageSuccessfully(){
        String expectedMessage = "Jewelry";
        //click on the ‘Jewelry’ Tab, Verify the text ‘Jewelry’
        WebElement jewelry = driver.findElement(By.linkText("Jewelry"));
        jewelry.click();
        WebElement actualMessageElement = driver.findElement(By.xpath("//h1[contains(text(),'Jewelry')]"));
        String actualMessage = actualMessageElement.getText();
        Assert.assertEquals("Jewelry tab is not matching",expectedMessage,actualMessage);

    }
    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully(){
        String expectedMessage ="Gift Cards";
         //* click on the ‘Gift Cards’ Tab,Verify the text ‘Gift Cards’
        WebElement giftCards= driver.findElement(By.linkText("Gift Cards"));
        giftCards.click();
        WebElement actualMessageElement = driver.findElement(By.xpath("//h1[contains(text(),'Gift Cards')]"));
        String actualMessage = actualMessageElement.getText();
        Assert.assertEquals("Gift card tab is not matching",expectedMessage,actualMessage);


    }
    @After
    public void tearDown() {
        closeBrowser();
    }


}
