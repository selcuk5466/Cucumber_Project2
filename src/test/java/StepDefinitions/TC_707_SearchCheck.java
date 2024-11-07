package StepDefinitions;

import Pages.PageElements;
import Pages.ParentPage;
import Utilities.GWD;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class TC_707_SearchCheck {
    PageElements pageElements=new PageElements();
    ParentPage parentPage=new ParentPage();
    WebElement product= GWD.getDriver().findElement(By.xpath("//ol[@class='products list items product-items']/li"));

    @Then("Enter product code in search placeholder and check")
    public void enterProductCodeInSearchPlaceholderAndCheck() {
        parentPage.mySendKeys(pageElements.search,"MJ08"+ Keys.ENTER);
        parentPage.myClick(product);
        parentPage.VerifyContainsText(pageElements.itemCode,"MJO8");

    }
}
