package steps;

import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


public class MyStepdefs {
    WebDriver driver = new ChromeDriver();

    @After
    public void tearDown() {
        driver.quit();
    }


    @Given("^I navigate to (.*)$")
    public void iNavigateToHttpsApDelrttestAchillesCom(String url) {
        // System.setProperty("webdriver.chrome.driver", "C:\\Users\\deepti.harish\\desktop\\chromedriver.exe");

        driver.get(url);
    }

    @And("^I login as (.*) and (.*)$")
    public void iLoginAs(String username, String password) throws InterruptedException {

        WebElement usernameElement = driver.findElement(By.id("UserName"));
        assertNotNull(usernameElement);
        // Thread.sleep(1000);

        WebElement passwordElement = driver.findElement(By.id("Password"));
        assertNotNull(passwordElement);
        //Thread.sleep(1000);

        WebElement buttonElement = driver.findElement(By.id("Login"));
        assertNotNull(buttonElement);

        usernameElement.sendKeys(username);
        //Thread.sleep(5000);
        passwordElement.sendKeys(password);
        //Thread.sleep(5000);
        buttonElement.click();
        Thread.sleep(1000);
    }

    @Then("^I check Achilles logo is dispalyed$")
    public void iVerifyAchillesLogoIsDispalyed() {

        String imageFile = driver.findElement(By.xpath("/html/body/div[1]/header/div/img")).getAttribute("src");
        //WebElement imageFile=driver.findElement(By.xpath("//img[contains(@src, '/Content/Supplier/images/logos/logo.png')"));
        Assert.assertNotNull(imageFile);
        //System.out.println(imageFile);
        //driver.close();

    }

    @Then("^I check the menu options ([\\w\\s\\d-]+) and ([\\w\\s\\d-]+) and ([\\w\\s\\d-]+) is displayed$")
    public void iVerifyTheMenuOptionsHomeMyWorkspaceInformationCentreIsDisplayed(String arg1, String arg2, String arg3) {
        Assert.assertNotNull(arg1);
        Assert.assertNotNull(arg2);
        Assert.assertNotNull(arg3);
        WebElement menu1 = driver.findElement(By.xpath("/html/body/div/nav//div/ul/li[1]"));
        String value1 = menu1.getText();
        Assert.assertEquals(arg1, value1);
        //System.out.println(value1);
        WebElement menu2 = driver.findElement(By.xpath("/html/body/div/nav//div/ul/li[2]"));
        String value2 = menu2.getText();
        Assert.assertEquals(arg2, value2);
        //System.out.println(value2);
        WebElement menu3 = driver.findElement(By.xpath("/html/body/div/nav//div/ul/li[3]"));
        String value3 = menu3.getText();
        Assert.assertEquals(arg3, value3);
        // System.out.println(value3);

    }


    @Then("^I check that (.*) is displayed$")
    public void iVerifyQuickSearchIsDisplayed(String arg1) {
        WebElement quickSearch = driver.findElement(By.xpath("html/body/div[1]/div/div/section/div/div/div[1]/h3"));
        String value = quickSearch.getText();
        assertEquals(arg1, value);
        //System.out.println(value);
    }

    @Then("^I check (.*) link is dispalyed$")
    public void iVerifyAdvancedSearchLinkIsDispalyed(String arg1) {
        WebElement advancedSearch = driver.findElement(By.id("advanced"));
        String value = advancedSearch.getText();
        Assert.assertEquals(arg1, value);
        // System.out.println(value);

    }

    @Then("^I check footer (.*) is displayed$")
    public void iVerifyFooterAchillesInformationLimitedIsDisplayed(String arg0) {
        WebElement footer = driver.findElement(By.xpath("html/body/footer/div/span"));
        String value = footer.getText();
        Assert.assertEquals(arg0, value);
        System.out.println(value);

    }

    @And("^I go to (.*) page$")
    public void iGoToAdvancedSearchPage(String arg0) throws InterruptedException {
        WebElement advancedSearch = driver.findElement(By.id("advanced"));
        String value = advancedSearch.getText();
        Assert.assertEquals(arg0, value);
        advancedSearch.click();
        Thread.sleep(1000);
    }

    @Then("^I check the buyer user displayed is (.*)$")
    public void iCheckTheBuyerUserDisplayedIs(String arg1) {
        WebElement userName = driver.findElement(By.xpath("html/body/div[1]/header/div/div/ul/li/div/button"));
        String value = userName.getText();
        Assert.assertEquals(arg1, value);
        System.out.println(value);
    }


    @And("^I click on (.*) and go to (.*) menu$")
    public void iClickOnTheProspectsMenu(String menuName, String sublink) throws InterruptedException {
        //WebElement menuName=driver.findElement(By.xpath("html/body/div[1]/div/div/div[2]/div[2]/ul/li[3]/div/div[1]/a[text()='"+ menu +"']"));
        // String text= menuName.getText();
        //System.out.println(text);
        // Assert.assertEquals(menu,text);

        //Actions actions = new Actions(driver);
        //WebElement menuHoverLink = driver.findElement(By.linkText("Sales"));
        //Thread.sleep(2000);
        //actions.moveToElement(menuHoverLink);
        //Thread.sleep(2000);
        //WebElement subMenuName = driver.findElement(By.xpath("/html/body//div[1]/div/div/div[2]/div[2]/ul/li[3]/div/div[2]/div/ul/li/a[text()='" + sublink + "']"));
        //Thread.sleep(2000);
        //actions.moveToElement(subMenuName);
        //Thread.sleep(2000);
       // actions.click();
        //actions.perform();
        //Thread.sleep(5000);

        //String text2=subMenuName.getText();
        //System.out.println(text2);
        //subMenuName.click();
        //String value=menu.getText();
        //Assert.assertEquals(arg1,value);
        //System.out.println(value);
        WebElement menuName1=driver.findElement(By.xpath("html/body/div[1]/div/div/div[2]/div[2]/ul/li[3]/div/div[1]/a[text()='"+ menuName +"']"));
       Actions builder=new Actions(driver);
        builder.moveToElement(menuName1).build().perform();
        WebDriverWait wait= new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body//div[1]/div/div/div[2]/div[2]/ul/li[3]/div/div[2]/div/ul/li/a[text()='" + sublink + "']")));
 WebElement submenu1=driver.findElement(By.xpath("html/body//div[1]/div/div/div[2]/div[2]/ul/li[3]/div/div[2]/div/ul/li/a[contains(text(), '"+ sublink +"')])"));
submenu1.click();

    }

    @Then("^the (.*) page is displayed$")
    public void theSalesProspectsPageIsDisplayed(String title) throws Throwable {

        WebElement pageTitle = driver.findElement(By.xpath("html/body/div[2]/div[1]/form/div/span/div[2]/div/div[1]/h4[text()='" + title + "']"));
        String titleText = pageTitle.getText();
        System.out.println(titleText);
        Assert.assertEquals(title, titleText);

    }
}















