package AutomationExercise.stepDefinitions;

import AutomationExercise.pages.PageOfGungor;
import AutomationExercise.utilities.ConfigReader;
import AutomationExercise.utilities.Driver;
import AutomationExercise.utilities.ReusableMethods;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GungorStepDef {
    PageOfGungor pageOfGungor =new PageOfGungor();
    Faker faker =new Faker();
    Actions actions = new Actions(Driver.getDriver());


    @Then("Verify that home page is visible successfully Gungor")
    public void verifyThatHomePageIsVisibleSuccessfullyGungor() {
        assertTrue(pageOfGungor.homePagelogo.isDisplayed());
    }

    @And("Add products to cart Gungor")
    public void addProductsToCartGungor() {
        pageOfGungor.addToCart.click();
    }

    @And("Click {string} button Gungor")
    public void clickCartButtonGungor() {
        pageOfGungor.cartButton.click();
    }

    @Then("Verify that cart page is displayed Gungor")
    public void verifyThatCartPageIsDisplayedGungor() {
        assertTrue(pageOfGungor.verifyCart.isDisplayed());
    }

    @And("Click Proceed To Checkout Gungor")
    public void clickProceedToCheckoutGungor() {
        pageOfGungor.proceedToCheckout.click();
    }

    @And("Fill all details in Signup and create account Gungor")
    public void fillAllDetailsInSignupAndCreateAccountGungor() {
        pageOfGungor.registerNameBox1.sendKeys(faker.name().fullName());
        pageOfGungor.registerNameBox1.sendKeys(faker.internet().emailAddress());
        pageOfGungor.signUpButton.click();
        pageOfGungor.radioButton.click();
        actions.sendKeys(Keys.TAB).sendKeys(faker.name().fullName())
                .sendKeys(Keys.TAB).sendKeys(faker.internet().password())
                .sendKeys(Keys.TAB).sendKeys("1")
                .sendKeys(Keys.TAB).sendKeys("May")
                .sendKeys(Keys.TAB).sendKeys("1995").perform();
        ReusableMethods.click(pageOfGungor.newsLetterCheckbox);
        ReusableMethods.click(pageOfGungor.optinCheckbox);
        pageOfGungor.registerNameBox2.sendKeys(faker.name().firstName());
        actions.sendKeys(Keys.TAB).sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB).sendKeys(faker.company().name())
                .sendKeys(Keys.TAB).sendKeys(faker.address().streetAddress())
                .sendKeys(Keys.TAB).sendKeys(faker.address().secondaryAddress())
                .sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("country"))
                .sendKeys(Keys.TAB).sendKeys(faker.address().state())
                .sendKeys(Keys.TAB).sendKeys(faker.address().city())
                .sendKeys(Keys.TAB).sendKeys(faker.address().zipCode())
                .sendKeys(Keys.TAB).sendKeys(faker.phoneNumber().cellPhone()).perform();
        pageOfGungor.createAccount.click();




    }

    @Then("Verify {string} and click {string} button Gungor")
    public void verifyACCOUNTCREATEDAndClickContinueButtonGungor() {
        assertTrue(pageOfGungor.verifyAccountCreated.isDisplayed());

    }

    @Then("Verify {string} at top Gungor")
    public void verifyLoggedInAsUsernameAtTopGungor() {
        assertTrue(pageOfGungor.verifyLoggedInAsMatviy.isDisplayed());
    }

    @Then("Verify Address Details and Review Your Order Gungor")
    public void verifyAddressDetailsAndReviewYourOrderGungor() {
        assertTrue(pageOfGungor.verifyAddressData1.isDisplayed());
    }

    @And("Enter description in comment text area and click {string} Gungor")
    public void enterDescriptionInCommentTextAreaAndClickPlaceOrderGungor() {
        pageOfGungor.textBox.sendKeys(ConfigReader.getProperty("Merhaba"));
    }

    @And("Enter payment details: Name on Card, Card Number, CVC, Expiration date Gungor")
    public void enterPaymentDetailsNameOnCardCardNumberCVCExpirationDateGungor() {
        pageOfGungor.cardNameBox.sendKeys(ConfigReader.getProperty("nameCard"));
        pageOfGungor.cardNumberBox.sendKeys(ConfigReader.getProperty("numberCard"));
    }

    @Then("Verify success message {string} Gungor")
    public void verifySuccessMessageYourOrderHasBeenPlacedSuccessfullyGungor() {
    }
}
