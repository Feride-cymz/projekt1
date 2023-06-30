package com.VKB.tests;
import com.VKB.pages.HomePage;
import com.VKB.pages.SchadenfreiheitsrabattPage;
import com.VKB.utilities.BrowserUtils;
import com.VKB.utilities.ConfigurationReader;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import javax.xml.xpath.XPath;
import java.util.List;


public class Schaden_Test extends TestBase{
    HomePage homePage= new HomePage();
    SchadenfreiheitsrabattPage schadenfreiheitsrabattPage= new SchadenfreiheitsrabattPage();

    @Test
    public void test1SchdnNchtAnwsnd() throws InterruptedException {
        //schadenfreiheitsrabattPage.navigateToradioBtn_Mtd("nicht anwesend");
        schadenfreiheitsrabattPage.nichtAnswsndBtn.click();
        BrowserUtils.waitFor(1);
        schadenfreiheitsrabattPage.weiterBtn.click();
        BrowserUtils.waitFor(1);
        schadenfreiheitsrabattPage.bitteHierClckBtn.click();
        /*JavascriptExecutor jse = (JavascriptExecutor) driver;
        String path="document.querySelector(\"body > app-root > div > div > app-page >"+
                " div > div.page.ng-untouched.ng-pristine.ng-valid > div > app-section"+
                " > div > div.grid-child.grid-child__row-2-col-1-colWidth-2 > app-attribute"+
                " > div > laser-link\").shadowRoot.querySelector(\"a\")";
        WebElement element = (WebElement) jse.executeScript("return "+path);
        jse.executeScript("arguments[0].click();", element);*/
        BrowserUtils.waitFor(1);
        schadenfreiheitsrabattPage.startBtn.click();
        BrowserUtils.waitFor(1);
        schadenfreiheitsrabattPage.datenSchtzKlick.click();
        BrowserUtils.waitFor(1);



    }

    @Test
    public void test2NichtAnwesend() throws InterruptedException{

        driver.get(ConfigurationReader.get("url2"));
        BrowserUtils.waitFor(1);
        schadenfreiheitsrabattPage.ihreDateninput_Mtd(1, "Max");
        schadenfreiheitsrabattPage.ihreDateninput_Mtd(2, "Mustermann");
        schadenfreiheitsrabattPage.ihreDateninput_Mtd(4, "999999991234");
        schadenfreiheitsrabattPage.ihreDateninput_Mtd(5, "Schlossallee 42");
        schadenfreiheitsrabattPage.ihreDateninput_Mtd(6, "81234 München");
        schadenfreiheitsrabattPage.ihreDateninput_Mtd(7, "A");
        schadenfreiheitsrabattPage.datum2000.sendKeys("01.2000");
        schadenfreiheitsrabattPage.ihreDateninput_Mtd(8, "Deutschland");
        schadenfreiheitsrabattPage.ihreDateninput_Mtd(9, "Max");
        schadenfreiheitsrabattPage.ihreDateninput_Mtd(10, "Mustermann");
        schadenfreiheitsrabattPage.ihreDateninput_Mtd(11, "Allianz Versicherung");
        schadenfreiheitsrabattPage.ihreDateninput_Mtd(12, "KR999999991234");
        schadenfreiheitsrabattPage.ihreDateninput_Mtd(13, "HH-SO 1005");
        BrowserUtils.waitFor(1);
        schadenfreiheitsrabattPage.beziehungZumVersicherungsnehmer.click();
        BrowserUtils.waitFor(1);
        schadenfreiheitsrabattPage.dritterEhegatte.click();
        BrowserUtils.waitFor(1);
        schadenfreiheitsrabattPage.weitrSendBtn.click();
        BrowserUtils.waitFor(1);
        schadenfreiheitsrabattPage.nichtAnswsndBtn.click();
        BrowserUtils.waitFor(1);
        schadenfreiheitsrabattPage.email.sendKeys("maxmustermann@gmail.com");
        BrowserUtils.waitFor(1);
        schadenfreiheitsrabattPage.weitrSendBtn.click();
        BrowserUtils.waitFor(1);
        schadenfreiheitsrabattPage.weitrSendBtn.click();
        BrowserUtils.waitFor(1);
        schadenfreiheitsrabattPage.pdfBtn.click();

    }
    @Test
    public void test3Verstorben() throws InterruptedException {
        BrowserUtils.waitFor(1);
        BrowserUtils.clickWithJS(schadenfreiheitsrabattPage.verstorbenbtn);
        BrowserUtils.waitFor(2);
        schadenfreiheitsrabattPage.weiterBtn.click();
        BrowserUtils.waitFor(1);
        schadenfreiheitsrabattPage.führerschnSelect.sendKeys("A");
        BrowserUtils.waitFor(1);
        schadenfreiheitsrabattPage.besitzInput.sendKeys("04.2004");
        schadenfreiheitsrabattPage.titel.click();
        BrowserUtils.waitFor(1);
        schadenfreiheitsrabattPage.ausstellLands.sendKeys("Deutschland");
        BrowserUtils.waitFor(1);
        schadenfreiheitsrabattPage.rabatBerechtigerVorname.sendKeys("Elke");
        BrowserUtils.waitFor(1);
        schadenfreiheitsrabattPage.rabatBerechtigerNachname.sendKeys("Mustermann");
        BrowserUtils.waitFor(1);
        schadenfreiheitsrabattPage.sterbeDatum.sendKeys("16.07.2021");
        schadenfreiheitsrabattPage.titel.click();
        BrowserUtils.waitFor(1);
        schadenfreiheitsrabattPage.bisherigerVersicher.sendKeys("R+V Versicherung");
        BrowserUtils.waitFor(1);
        schadenfreiheitsrabattPage.verscherungsNummer.sendKeys("KR888888881234");
        BrowserUtils.waitFor(1);
        schadenfreiheitsrabattPage.kennzeichen.sendKeys("M-MW 123");
        BrowserUtils.waitFor(1);
        schadenfreiheitsrabattPage.zusammenFassungBtn.click();
        BrowserUtils.waitFor(1);
        schadenfreiheitsrabattPage.antragEinreichen.click();
        BrowserUtils.waitFor(1);







    }
    @Test
    public void test4Anwesend()  {
        BrowserUtils.clickWithJS(schadenfreiheitsrabattPage.verstorbenbtn);
        BrowserUtils.waitFor(1);
        schadenfreiheitsrabattPage.weiterBtnn.click();
        BrowserUtils.waitFor(1);
        schadenfreiheitsrabattPage.bisherigerRabattBerechtiger_Mtd(1,"A");
        BrowserUtils.waitFor(1);
        schadenfreiheitsrabattPage.bisherigerRabattBerechtiger_Mtd(2,"04.2004");
        BrowserUtils.waitFor(1);
        schadenfreiheitsrabattPage.titel.click();
        schadenfreiheitsrabattPage.bisherigerRabattBerechtiger_Mtd(3,"Deutschland");
        BrowserUtils.waitFor(1);
        schadenfreiheitsrabattPage.bisherigerRabattBerechtiger_Mtd(4,"Elke");
        BrowserUtils.waitFor(1);
        schadenfreiheitsrabattPage.bisherigerRabattBerechtiger_Mtd(5,"Mustermann");
        BrowserUtils.waitFor(1);
        schadenfreiheitsrabattPage.bisherigerRabattBerechtiger_Mtd(6,"16.07.2021");
        schadenfreiheitsrabattPage.titel.click();
        schadenfreiheitsrabattPage.bisherigerRabattBerechtiger_Mtd(7,"R+V Versicherung");
        BrowserUtils.waitFor(1);
        schadenfreiheitsrabattPage.bisherigerRabattBerechtiger_Mtd(8,"KR888888881234");
        BrowserUtils.waitFor(1);
        schadenfreiheitsrabattPage.bisherigerRabattBerechtiger_Mtd(9,"M-MW 123");
        BrowserUtils.waitFor(1);

    }




    @Test
    public void test5Anwesend() throws InterruptedException {
        BrowserUtils.waitFor(1);
        BrowserUtils.clickWithJS(schadenfreiheitsrabattPage.anwesendBtn);
        //schadenfreiheitsrabattPage.navigateToradioBtn_Mtd("anwesend");
        BrowserUtils.waitFor(2);
        schadenfreiheitsrabattPage.weiterBtn.click();
        BrowserUtils.waitFor(1);
        schadenfreiheitsrabattPage.führerscheinDropdownBtn.click();
        BrowserUtils.waitFor(2);
        schadenfreiheitsrabattPage.führerschnKlasseC.click();
        BrowserUtils.waitFor(1);
        schadenfreiheitsrabattPage.besitzSeit.sendKeys("10.1977");
        BrowserUtils.waitFor(1);
        schadenfreiheitsrabattPage.titell.click();
        BrowserUtils.waitFor(1);
        schadenfreiheitsrabattPage.land.sendKeys("Deutschland");
        BrowserUtils.waitFor(1);
        schadenfreiheitsrabattPage.vorName.sendKeys("Klaus");
        BrowserUtils.waitFor(1);
        schadenfreiheitsrabattPage.nachName.sendKeys("Mustermann");
        BrowserUtils.waitFor(1);
        schadenfreiheitsrabattPage.bisherigerVersiecher.sendKeys("HUK Coburg");
        BrowserUtils.waitFor(1);
        schadenfreiheitsrabattPage.versicherungsNummer.sendKeys("KR778877881234");
        BrowserUtils.waitFor(1);
        schadenfreiheitsrabattPage.amtKennzeichen.sendKeys("K-MM 999");
        BrowserUtils.waitFor(1);
        schadenfreiheitsrabattPage.signatur.click();
        BrowserUtils.waitFor(1);



    }
}




