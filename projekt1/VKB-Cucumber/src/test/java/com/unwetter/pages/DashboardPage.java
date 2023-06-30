package com.unwetter.pages;
import com.unwetter.utilities.BrowserUtils;
import com.unwetter.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

    public class DashboardPage extends BasePage {

        @FindBy(xpath = "//*[@class='title ng-star-inserted']")
        public WebElement dashboardMessage;

        @FindBy(xpath = "//*[@class='mat-datepicker-toggle-default-icon ng-star-inserted']")
        public WebElement datumBtn;

        @FindBy(xpath = "(//*[@class='mat-calendar-body-cell-content mat-focus-indicator'])[2]")
        public WebElement dayDatumBtn;

        @FindBy(xpath = "//*[text()=' Orkan ']")
        public WebElement wetterlageRadioBtn;

        @FindBy(xpath = "//*[@class='container-buttons__button container-buttons__button--next ng-star-inserted']")
        public WebElement firstWeiterBtn;

        @FindBy(xpath = "(//*[text()='Art des Schadens'])[1]")
        public WebElement verifyMessageArtDesShades;

        @FindBy(xpath = "//*[@class='mat-select-arrow ng-tns-c27-3']")
        public WebElement welchemBereichSelectBtn;

        @FindBy(xpath = "//*[text()=' Garage ']")
        public WebElement welchemBereichSelect;

        @FindBy(xpath = "//*[@class='mat-select-arrow-wrapper ng-tns-c27-5']")
        public WebElement welcheTeileSelectBtn;

        @FindBy(xpath = "//*[text()=' Fenster '] ")
        public WebElement welcheTeileSelect;

        @FindBy(xpath= "//*[@class='container-buttons__button container-buttons__button--next ng-star-inserted']")
        public WebElement zweiteWeiterBtn;



        @FindBy(xpath = "(//*[text()='Art des Schadens'])[1]")
        public WebElement artBtn;

        //@FindBy(xpath = "//*[@class='container-buttons__button container-buttons__button--next ng-star-inserted']")
        //public WebElement artDesSchadenWeiterBtn;

        @FindBy(xpath = "//*[text()=' Beschädigungen ']")
        public WebElement verifyMessageBeschädigungen;


        @FindBy(xpath = "//*[@class='mat-select-trigger ng-tns-c27-7']")
        public WebElement worinBestehtSelectBtn;

        @FindBy(xpath = "//*[text()=' Dellen ']")
        public WebElement worinBestehtElement;

        @FindBy(xpath = "//*[@class='radio-button ng-star-inserted']")
        public WebElement istinFolgeJaRadioBtn;

        @FindBy(xpath = "(//*[@role='combobox'])[2]")
        public WebElement wieIstDasWasserQuestionBtn;

        @FindBy(xpath = "//*[@rows='5']")
        public WebElement welcheRäumeInputBox;


        @FindBy(xpath = "//*[@class='p-inputtextarea p-inputtext p-component p-element full-width block ng-pristine ng-invalid ng-touched']")
        public WebElement textFeldBtn;

        //@FindBy(xpath = "//*[@class='flex ng-star-inserted']")
        //public WebElement beschädigungenTexBtn;

        @FindBy(xpath = "//*[text()=' Dach ']")
        public WebElement wieIstDasWasserElement;


        @FindBy(xpath = "//*[@class='container-buttons__button container-buttons__button--next ng-star-inserted']")
        public WebElement beschädigungenWeiterBtn;

        @FindBy(xpath = "//*[text()=' Maßnahmen zur Behebung des Schadens '] ")
        public WebElement verifayMessageMassnahmenPage;

        @FindBy(xpath = "//*[@class='mat-select-arrow-wrapper ng-tns-c99-1']")
        public WebElement welcheSofortmassnahmenBtn;

        @FindBy(xpath = "//*[text()=' keine ']")
        public WebElement welcheSofortElement;

        @FindBy(xpath = "//*[@class='radio-button ng-star-inserted']")
        public WebElement hatSichHandwerkerNeinBtn;

        @FindBy(xpath = "//*[text()=' Weiter ']")
        public WebElement massnahmenPageWeiterBtn;

        @FindBy(xpath = " //*[text()=' Einreichung von Unterlagen ']")
        public WebElement verifyMessageEinreichungPage;


        public void homePage(int module) {
            WebElement homePageModule = Driver.get().findElement(By.xpath("(//*[@class='navbar__options__btn-option'])[" + module + "]"));
            homePageModule.click();
        }

        public void dayDatumElement(int dayNo){

            datumBtn.click();
            BrowserUtils.waitFor(1);
            WebElement dayElement = Driver.get().findElement(By.xpath("(//*[@class='mat-calendar-body-cell-content mat-focus-indicator'])[" + dayNo + "]"));
            BrowserUtils.waitFor(2);
            dayElement.click();
        }

        public void wetterlageRadioBtn_Mtd(String radioText) {
            BrowserUtils.scrollToElement(wetterlageRadioBtn);
            WebElement radioBtn = Driver.get().findElement(By.xpath("//*[text()=' " + radioText + " ']"));
            radioBtn.click();
            BrowserUtils.waitFor(2);
        }

        public void welchemBereicSelect_Mtd(String type) {

            welchemBereichSelectBtn.click();
            BrowserUtils.waitFor(2);
            WebElement selectElement = Driver.get().findElement(By.xpath("//*[text()='" + type + "']"));
            selectElement.click();
            BrowserUtils.waitFor(2);
            BrowserUtils.clickWithJS(artBtn);

        }

        public void welcheTeileSelect_Mtd(String type) {

            BrowserUtils.waitFor(1);
            BrowserUtils.clickWithJS(welcheTeileSelectBtn);
            BrowserUtils.waitFor(2);
            WebElement selectElemet2 = Driver.get().findElement(By.xpath("//*[text()='" + type + "'] "));
            selectElemet2.click();
        }

        public void worinBestehtSelect_Mtd(String type) {
            BrowserUtils.waitFor(1);
            BrowserUtils.clickWithJS(worinBestehtSelectBtn);
            BrowserUtils.waitFor(1);
            WebElement selectElement3 = Driver.get().findElement(By.xpath("//*[text()='" + type + "']"));
            selectElement3.click();
            BrowserUtils.waitFor(1);

        }

        public void wieIstDasWetterQuestion_Mtd(String type) {
            BrowserUtils.waitFor(1);
            BrowserUtils.clickWithJS(wieIstDasWasserQuestionBtn);
            BrowserUtils.waitFor(1);
            WebElement selectElement4 = Driver.get().findElement(By.xpath("//*[text()='" + type + "']"));
            selectElement4.click();
            BrowserUtils.waitFor(1);

        }

        public void welcheRaumeInputBox_Mtd(String messageText) {

            textFeldBtn.click();
            BrowserUtils.waitFor(1);
            BrowserUtils.clickWithJS(welcheRäumeInputBox);
            welcheRäumeInputBox.sendKeys(messageText);
        }

        public void welcheSofortMassnahmen_Mtd(String type) {

            welcheSofortmassnahmenBtn.click();
            BrowserUtils.waitFor(1);
            WebElement selectElement5 = Driver.get().findElement(By.xpath("//*[text()='" + type + "']"));
            selectElement5.click();
        }
}
