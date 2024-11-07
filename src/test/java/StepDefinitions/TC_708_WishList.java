package StepDefinitions;

import Pages.PageElements;
import Pages.ParentPage;
import Utilities.GWD;
import io.cucumber.java.en.Then;
import io.cucumber.java.en_old.Ac;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class TC_708_WishList {
    PageElements pageElements=new PageElements();
    ParentPage parentPage=new ParentPage();
    List<WebElement> products= GWD.getDriver().findElements(By.xpath("//ol[@class='products list items product-items']/li"));
    Actions actions=new Actions(GWD.getDriver());

    @Then("Add to Wish List a item")
    public void addToWishListAItem() {
        actions.moveToElement(pageElements.women);
        parentPage.myClick(pageElements.womenTops);
        int rastgeleSayi=(int)Math.random()*(products.size());
        System.out.println(rastgeleSayi);

        parentPage.myClick(products.get(rastgeleSayi));
        parentPage.myClick(pageElements.addToWishList);
        parentPage.myClick(pageElements.rightButton);
        parentPage.myClick(pageElements.myWishList);
        actions.moveToElement(pageElements.itemWish);
        parentPage.myClick(pageElements.deleteWish);

    }
}
