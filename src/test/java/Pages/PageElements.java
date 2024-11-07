package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PageElements {

    public PageElements(){
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(linkText = "Create an Account")
    public WebElement registerText;

    @FindBy(id = "firstname")
    public WebElement name;

    @FindBy(id = "lastname")
    public WebElement surname;

    @FindBy(id = "email_address")
    public WebElement enterEmail;

    @FindBy(id = "password")
    public WebElement enterPassword;

    @FindBy(id = "password-confirmation")
    public WebElement confirmPassword;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement registerButton;

    @FindBy(linkText = "Sign In")
    public WebElement signIn;

    @FindBy(id = "email")
    public WebElement email;

    @FindBy(id = "pass")
    public WebElement password;

    @FindBy(id = "send2")
    public WebElement signInButton;

    @FindBy(xpath = "(//button[@type='button'])[1]")
    public WebElement rightButton;

    @FindBy(linkText = "Sign Out")
    public WebElement signOut;

    @FindBy(xpath = "//span[@class='logged-in']")
    public WebElement userProfilHeader;

    @FindBy(linkText = "My Account")
    public WebElement myAccount;

    @FindBy(xpath = "(//div[@id='block-collapsible-nav']/ul/li)[6]")
    public WebElement addressBook;

    @FindBy(id = "telephone")
    public WebElement telephone;

    @FindBy(id = "street_1")
    public WebElement streetAddress;

    @FindBy(id = "city")
    public WebElement city;

    @FindBy(id = "zip")
    public WebElement zipCode;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement saveAddress;

    @FindBy(id = "country")
    public WebElement country;

    @FindBy(xpath = "//div[@class='page messages']")
    public WebElement pageMessages;

    @FindBy(linkText = "Add New Address")
    public WebElement newAddress;

    @FindBy(xpath = "//ul[@id='ui-id-2']/li")
    public WebElement whatsNew;

    @FindBy(xpath = "//ul[@id='ui-id-2']/li[2]")
    public WebElement women;

    @FindBy(xpath = "//ul[@id='ui-id-2']/li[3]")
    public WebElement men;

    @FindBy(xpath = "//ul[@id='ui-id-2']/li[4]")
    public WebElement gear;

    @FindBy(xpath = "//ul[@id='ui-id-2']/li[5]")
    public WebElement training;

    @FindBy(xpath = "//ul[@id='ui-id-2']/li[6]")
    public WebElement sale;

    @FindBy(xpath = "//ul[@id='ui-id-2']/li[2]/ul/li[1]")
    public WebElement womenTops;

    @FindBy(xpath = "//ul[@id='ui-id-2']/li[2]/ul/li[2]")
    public WebElement womenBottom;

    @FindBy(xpath = "//ul[@id='ui-id-2']/li[3]/ul/li[1]")
    public WebElement menTops;

    @FindBy(xpath = "//ul[@id='ui-id-2']/li[3]/ul/li[2]")
    public WebElement menBottom;

    @FindBy(xpath = "//a[@class='logo']")
    public WebElement homePage;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement addToCart;

    @FindBy(xpath = "(//span[text()='Add to Wish List'])")
    public WebElement addToWishList;

    @FindBy(xpath = "(//span[text()='My Cart'])")
    public WebElement myCart;

    @FindBy(css = "[id='cart-item-398540-qty']")
    public WebElement myCartQty;

    @FindBy(xpath = "//a[@class='action delete']")
    public WebElement myCartDelete;

    @FindBy(id = "top-cart-btn-checkout")
    public WebElement proceedToCheckout;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement next;

    @FindBy(xpath = "//div[@class='checkout-success']")
    public WebElement checkSuccess;

    @FindBy(id = "search")
    public WebElement search;

    @FindBy(xpath = "//div[@itemprop='sku']")
    public WebElement itemCode;

    @FindBy(linkText = "My Wish List")
    public WebElement myWishList;

    @FindBy(xpath = "//a[@data-role='remove']")
    public WebElement deleteWish;

    @FindBy(id = "item_10581")
    public WebElement itemWish;



    public WebElement getWebElement(String elementName){
        switch (elementName){
            case "registerText": return registerText;
            case "name":return name;
            case "surname":return surname;
            case "enterEmail":return enterEmail;
            case "enterPassword":return enterPassword;
            case "confirmPassword":return confirmPassword;
            case "registerButton":return registerButton;
            case "signIn":return signIn;
            case "email":return email;
            case "password":return password;
            case "signInButton":return signInButton;
            case "rightButton": return rightButton;
            case "signOut":return signOut;
            case "userProfilHeader":return userProfilHeader;
            case "myAccount":return myAccount;
            case "addressBook":return addressBook;
            case "telephone":return telephone;
            case "streetAddress":return streetAddress;
            case "city":return city;
            case "zipCode":return zipCode;
            case "saveAddress":return saveAddress;
            case "country":return country;
            case "pageMessages":return pageMessages;
            case "addNewAddress":return newAddress;
            case "whatsNew":return whatsNew;
            case "women":return women;
            case "men":return men;
            case "gear":return gear;
            case "training":return training;
            case "sale":return sale;
            case "womenTops":return womenTops;
            case "womenBottom":return womenBottom;
            case "menTops":return menTops;
            case "menBottom":return menBottom;
            case "homePage":return homePage;
            case "addToCart":return addToCart;
            case "addToWishList":return addToWishList;
            case "myCart":return myCart;
            case "myCartQty":return myCartQty;
            case "myCartDelete":return myCartDelete;
            case "proceedCheckout":return proceedToCheckout;
            case "next":return next;
            case "checkSuccess":return checkSuccess;
            case "search":return search;
            case "itemCode":return itemCode;
            case "myWishList":return myWishList;
            case "deleteWish":return deleteWish;
            case "itemWish":return itemWish;


        }
    return null;}


}
