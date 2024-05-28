package AutomationExercise.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PagesOfSemra {

    @FindBy (xpath = "//div[@class='header-middle']") public WebElement homePageS;
    @FindBy (xpath = "//a[@href=\"/login\"]") public WebElement signUpLoginButtonS;
    @FindBy (xpath = "//h2[text()=\"New User Signup!\"]") public WebElement newUserSignupS;
    @FindBy (xpath = "//input[@name=\"name\"]") public WebElement nameS;
    @FindBy (xpath = "//input[@data-qa=\"signup-email\"]") public WebElement emailS;
    @FindBy (xpath = "//input[@data-qa=\"signup-email\"]") public WebElement signupNewUserS;
    @FindBy (xpath = "//h2[@class='title text-center']/b[text()=\"Enter Account Information\"]") public WebElement enterAccountInfoS;
    @FindBy (xpath = "//input[@id='id_gender1']") public WebElement mrS;
    @FindBy (xpath = "//input[@id='name']") public WebElement nameBosluguS;
    @FindBy (xpath = "//input[@id='email']") public WebElement emailBosluguS;
    @FindBy (xpath = "//input[@id='password']") public WebElement passwordBosluguS;
    @FindBy (xpath = "//div[@id='uniform-days']") public WebElement DateOfDayS;
    @FindBy (xpath = "//div[@id='uniform-months']") public WebElement DateOfMonthS;
    @FindBy (xpath = "//div[@id='uniform-years']") public WebElement DateOfYearS;
    @FindBy (xpath = "//div[@id='uniform-newsletter']") public WebElement checkboxNewspaperS;
    @FindBy (xpath = "//input[@id='optin']") public WebElement checkboxReceiveSpecaialOffersS;
    @FindBy (xpath = "//input[@id='first_name']") public WebElement AdressInfoFirstNameS;
    @FindBy (xpath = "//input[@id='last_name']") public WebElement AdressInfoLastNameS;
    @FindBy (xpath = "//input[@id='company']") public WebElement CompanyNameS;
    @FindBy (xpath = "//input[@id='address1']") public WebElement adressS;






}