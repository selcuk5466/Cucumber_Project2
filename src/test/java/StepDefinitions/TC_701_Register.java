package StepDefinitions;

import Pages.PageElements;
import Pages.ParentPage;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class TC_701_Register {
    PageElements pageElements=new PageElements();
    ParentPage parentPage=new ParentPage();


    @Given("Navigate to Magento")
    public void navigateToMagento() {
        GWD.getDriver().get("https://magento.softwaretestingboard.com/");
    }

    @Then("Click on the register linktext")
    public void clickOnTheRegisterLinktext() {
        parentPage.myClick(pageElements.registerText);
    }

    @Then("Enter {string},{string},{string},{string} and click on the register button")
    public void enterAndClickOnTheRegisterButton(String firstname, String lastname, String email, String password) {
        parentPage.mySendKeys(pageElements.name,firstname);
        parentPage.mySendKeys(pageElements.surname,lastname);
        parentPage.mySendKeys(pageElements.enterEmail,email);
        parentPage.mySendKeys(pageElements.enterPassword,password);
        parentPage.mySendKeys(pageElements.confirmPassword,password);
        parentPage.myClick(pageElements.registerButton);

    }


}
