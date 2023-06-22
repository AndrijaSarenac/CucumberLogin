package Steps;

import Pages.LoginPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepsDefinition {

    public static WebDriver driver;
    public LoginPage loginPage;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        loginPage = new LoginPage();
    }
    @Given("User is on Login page")
    public void user_is_on_login_page() {
        driver.get("https://the-internet.herokuapp.com/login");
    }

    @When("User inserts username {string}")
    public void userInsertsUsername(String username) {
        loginPage.insertUsername(username);
    }

    @And("User inserts password {string}")
    public void userInsertsPassword(String password) {
        loginPage.insertPassword(password);
    }

    @And("User clicks on Login button")
    public void userClicksOnLoginButton() {
        loginPage.clickOnLogin();
    }

    @Then("User is logged in")
    public void userIsLoggedIn() {
    }

}
