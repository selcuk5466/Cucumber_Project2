package StepDefinitions;

import Pages.PageElements;
import Pages.ParentPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;

public class TC_703_AddAddress {
    PageElements pageElements=new PageElements();
    ParentPage parentPage=new ParentPage();

    @When("Enter email {string} , password {string} and click on the button for this scenario")
    public void enterEmailPasswordAndClickOnTheButtonForThisScenario(String email, String password) {
        parentPage.myClick(pageElements.signIn);
        parentPage.mySendKeys(pageElements.email,email);
        parentPage.mySendKeys(pageElements.password,password);
        parentPage.myClick(pageElements.signInButton);
    }


    @When("Open the My Account Page")
    public void openTheMyAccountPage() {
      parentPage.myClick(pageElements.rightButton);
      parentPage.myClick(pageElements.myAccount);
      parentPage.myClick(pageElements.addressBook);
    //  parentPage.myClick(pageElements.newAddress);

    }

    @Then("Enter phone {string},{string},{string},{string} and other info of form")
    public void enterPhoneAndOtherInfoOfForm(String phone, String streetAddress, String city, String zipCode) {
        parentPage.mySendKeys(pageElements.telephone, phone);
        parentPage.mySendKeys(pageElements.streetAddress,streetAddress);
        parentPage.mySendKeys(pageElements.city,city);
        parentPage.mySendKeys(pageElements.zipCode,zipCode);
        Select select=new Select(pageElements.country);
        select.selectByVisibleText("Turkey");
        parentPage.myClick(pageElements.saveAddress);
        parentPage.VerifyContainsText(pageElements.pageMessages,"saved");
        parentPage.myClick(pageElements.rightButton);
        parentPage.myClick(pageElements.signOut);
    }



}
