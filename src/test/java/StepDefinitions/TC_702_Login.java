package StepDefinitions;

import Pages.PageElements;
import Pages.ParentPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.apache.poi.ss.usermodel.*;
import java.io.FileInputStream;
import java.io.IOException;


public class TC_702_Login {
    PageElements pageElements=new PageElements();
    ParentPage parentPage=new ParentPage();

    @Then("Enter email , password and click on the button this scenario")
    public void enterEmailPasswordAndClickOnTheButton() throws IOException {
        FileInputStream fileInputStream=new FileInputStream("src/test/java/_0_Source/users.xlsx");
        Workbook workbook= WorkbookFactory.create(fileInputStream);
        Sheet sheet=workbook.getSheet("user");


        for (int i = 1; i < sheet.getPhysicalNumberOfRows() ; i++) {

        Row row=sheet.getRow(i);
        String eMail=row.getCell(0).getStringCellValue();
        String sifre=row.getCell(1).getStringCellValue();
        parentPage.myClick(pageElements.signIn);
        parentPage.mySendKeys(pageElements.email,eMail);
        parentPage.mySendKeys(pageElements.password,sifre);
        parentPage.myClick(pageElements.signInButton);
        parentPage.VerifyContainsText(pageElements.userProfilHeader,"Welcome");
        parentPage.myClick(pageElements.rightButton);
        parentPage.myClick(pageElements.signOut);


        }
    }

}
