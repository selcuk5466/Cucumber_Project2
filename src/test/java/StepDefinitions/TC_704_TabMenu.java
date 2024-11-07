package StepDefinitions;

import Pages.PageElements;
import Pages.ParentPage;
import Utilities.GWD;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class TC_704_TabMenu {
    PageElements pageElements=new PageElements();
    ParentPage parentPage=new ParentPage();
    Actions actions=new Actions(GWD.getDriver());
    List<WebElement> tabMenu=GWD.getDriver().findElements(By.xpath("//ul[@id='ui-id-2']/li"));
    List<WebElement> womentopsList= GWD.getDriver().findElements(By.xpath("//ul[@id='ui-id-2']/li[2]/ul/li[1]/ul/li"));
    List<WebElement> womenBottomList=GWD.getDriver().findElements(By.xpath("//ul[@id='ui-id-2']/li[2]/ul/li[2]/ul/li"));
    List<WebElement> mentopsList= GWD.getDriver().findElements(By.xpath("//ul[@id='ui-id-2']/li[3]/ul/li[1]/ul/li"));
    List<WebElement> menBottomList=GWD.getDriver().findElements(By.xpath("//ul[@id='ui-id-2']/li[3]/ul/li[2]/ul/li"));
    List<WebElement> gearList= GWD.getDriver().findElements(By.xpath("//ul[@id='ui-id-2']/li[4]/ul/li"));
    List<WebElement> trainingList=GWD.getDriver().findElements(By.xpath("//ul[@id='ui-id-2']/li[5]/ul/li"));


    @When("Enter email , password and click on the button")
    public void enterEmailPasswordAndClickOnTheButtonGeneral() {
        parentPage.myClick(pageElements.signIn);
        parentPage.mySendKeys(pageElements.email,"zgh28602@gmail.com");
        parentPage.mySendKeys(pageElements.password,"em234AL.UUAM?");
        parentPage.myClick(pageElements.signInButton);
    }

    @Then("Check Tab Menu buttons")
    public void checkTabMenuButtons() {

        listMethod(tabMenu);
        listMethod(womentopsList,pageElements.women,pageElements.womenTops);
        listMethod(womentopsList,pageElements.women,pageElements.womenBottom);
        listMethod(gearList,pageElements.gear);
        listMethod(trainingList, pageElements.training);



    }

    public void listMethod(List<WebElement> list,WebElement element1,WebElement element2) {
        for (WebElement liste : list) {
            actions.moveToElement(element1).moveToElement(element2);
            parentPage.myClick(liste);
            parentPage.myClick(pageElements.homePage);
        }
    }

    public void listMethod(List<WebElement> list) {
        for (WebElement liste : list) {
            parentPage.myClick(liste);
            parentPage.myClick(pageElements.homePage);
        }
    }

    public void listMethod(List<WebElement> list,WebElement element1) {
        for (WebElement liste : list) {
            actions.moveToElement(element1);
            parentPage.myClick(liste);
            parentPage.myClick(pageElements.homePage);
        }
    }
}
