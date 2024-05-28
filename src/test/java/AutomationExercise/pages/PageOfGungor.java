package AutomationExercise.pages;

import AutomationExercise.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageOfGungor {
    public PageOfGungor() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //TC14

    @FindBy(xpath = "//img[@src='/static/images/home/logo.png']") public WebElement homePagelogo;
    @FindBy(xpath = "//a[text()=' Products']") public WebElement productClick;
    @FindBy(xpath = "(//a[text()='View Product'])[1]") public WebElement viewProduct;
    @FindBy(xpath = "(//i[@class='fa fa-shopping-cart'])[2]") public WebElement addToCart;
    @FindBy(xpath = "(//i[@class='fa fa-shopping-cart'])[1]") public WebElement cartButton;
    @FindBy(xpath = "//li[text()='Shopping Cart']") public WebElement verifyCart;

    @FindBy(xpath = "//button[@class='btn btn-success close-modal btn-block']") public WebElement continueShopping;
    @FindBy(xpath = "//a[text()='Proceed To Checkout']") public WebElement proceedToCheckout;
    @FindBy(xpath = "//a[u='Register / Login']") public WebElement registerLink;
    @FindBy(xpath = "//h2[b='Account Created!']") public WebElement verifyAccountCreated;
    @FindBy(xpath = "//a[text()='Continue']") public WebElement continueButton;
    @FindBy(xpath = "//a[text()=' Logged in as ']") public WebElement verifyLoggedInAsMatviy;
    @FindBy(xpath = "(//li[text()='Mrs. matviy mavi'])[1]") public WebElement verifyAddressData1;
    @FindBy(xpath = "(//li[text()='matviy'])[1]") public WebElement verifyAddressData2;
    @FindBy(xpath = "(//li[text()='matviy street, matviy company '])[1]") public WebElement verifyAddressData3;
    @FindBy(xpath = "(//li[@class='address_city address_state_name address_postcode'])[1]") public WebElement verifyAddressData4;
    @FindBy(xpath = "(//li[@class='address_country_name'])[1]") public WebElement verifyAddressData5;
    @FindBy(xpath = "(//li[@class='address_phone'])[1]") public WebElement verifyAddressData6;
    @FindBy(xpath = "//textarea[@class='form-control']") public WebElement textBox;
    @FindBy(xpath = "//a[text()='Place Order']") public WebElement placeOrderButton;
    @FindBy(xpath = "//input[@class='form-control']") public WebElement cardNameBox;
    @FindBy(xpath = "//input[@name='card_number']") public WebElement cardNumberBox;
    @FindBy(xpath = "//input[@name='cvc']") public WebElement cvcBox;
    @FindBy(xpath = "//input[@class='form-control card-expiry-month']") public WebElement expirationBox;
    @FindBy(xpath = "//input[@name='expiry_year']") public WebElement yearBox;
    @FindBy(xpath = "//button[@class='form-control btn btn-primary submit-button']") public WebElement payBox;
    @FindBy(xpath = "//p[text()='Congratulations! Your order has been confirmed!']") public WebElement verifyPlaceOlder;
    @FindBy(xpath = "//a[text()=' Delete Account']") public WebElement deleteAccountButton;
    @FindBy(xpath = "//h2[b='Account Deleted!']") public WebElement verifyAccountDeleted;
    @FindBy(xpath = "//a[text()='Continue']") public WebElement continueButton2;
    @FindBy(xpath = "//input[@name='name']") public WebElement registerNameBox1;
    @FindBy(xpath = "(//input[@name='email'])[2]") public WebElement registerEmailBox;
    @FindBy(xpath = "//button[text()='Signup']") public WebElement signUpButton;
    @FindBy(xpath = "(//input[@type='radio'])[2]") public WebElement radioButton;
    @FindBy(xpath = "//input[@id='name']") public WebElement registerNameBox2;
    @FindBy(xpath = "//input[@id='email']") public WebElement registerEmailBox2;
    @FindBy(xpath = "//input[@id='password']") public WebElement registerPassword;
    @FindBy(xpath = "//select[@id='days']") public WebElement dayData;
    @FindBy(xpath = "//select[@id='months']") public WebElement monthData;
    @FindBy(xpath = "//select[@id='years']") public WebElement yearData;
    @FindBy(xpath = "//input[@id='first_name']") public WebElement firstNameBox;
    @FindBy(xpath = "//input[@id='newsletter']") public WebElement newsLetterCheckbox;
    @FindBy(xpath = "//input[@id='optin']") public WebElement optinCheckbox;
    @FindBy(xpath = "//button[text()='Create Account']") public WebElement createAccount;
    @FindBy(xpath = "//button[text()='Create Account']") public WebElement createAccount1;
    @FindBy(xpath = "//button[text()='Create Account']") public WebElement createAccount2;
    @FindBy(xpath = "//button[text()='Create Account']") public WebElement createAccount3;
    @FindBy(xpath = "//button[text()='Create Account']") public WebElement createAccount4;







}
