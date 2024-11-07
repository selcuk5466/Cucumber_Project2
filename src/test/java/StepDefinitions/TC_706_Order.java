package StepDefinitions;

import Pages.PageElements;
import Pages.ParentPage;
import Utilities.GWD;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class TC_706_Order {
    PageElements pageElements=new PageElements();
    ParentPage parentPage=new ParentPage();
    List<WebElement> products= GWD.getDriver().findElements(By.xpath("//ol[@class='products list items product-items']/li"));
    Actions actions=new Actions(GWD.getDriver());

    @Then("Order product")
    public void orderProduct() {

        actions.moveToElement(pageElements.women);
        parentPage.myClick(pageElements.womenTops);
        int rastgeleSayi=(int)Math.random()*(products.size());
        System.out.println(rastgeleSayi);

        parentPage.myClick(products.get(rastgeleSayi));
        parentPage.myClick(GWD.getDriver().findElement(By.id("option-label-size-143-item-167")));
        parentPage.myClick(GWD.getDriver().findElement(By.id("option-label-color-93-item-59")));
        GWD.getDriver().findElement(By.id("qty")).clear();
        parentPage.mySendKeys(GWD.getDriver().findElement(By.id("qty")),"2");
        parentPage.myClick(pageElements.addToCart);
        parentPage.myClick(pageElements.myCart);
        pageElements.myCartQty.clear();
        parentPage.mySendKeys(pageElements.myCartQty,"3");
        parentPage.myClick(pageElements.proceedToCheckout);
        parentPage.myClick(pageElements.next);
        parentPage.myClick(pageElements.next);
        parentPage.VerifyContainsText(pageElements.checkSuccess,"success");
    }
}
