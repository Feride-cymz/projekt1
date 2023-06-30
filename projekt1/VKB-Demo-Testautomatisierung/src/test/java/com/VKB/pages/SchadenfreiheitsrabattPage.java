package com.VKB.pages;
import com.VKB.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SchadenfreiheitsrabattPage extends BasePage{

    @FindBy(xpath = "//*[@class='title']")
    public WebElement sfTitle;

    @FindBy(xpath = "(//*[@type='radio'])[1]")
    public WebElement nichtAnswsndBtn;

    @FindBy(xpath = "(//*[@class='p-button-label ng-star-inserted'])[2]")
    public WebElement weiterBtn;

    @FindBy(xpath = "//*[@href='https://vkb-dev.easysend.app/schadenfreiheitsrabattuebertragung/']")
    public WebElement bitteHierClckBtn;

   @FindBy(xpath = "//*[@class='main ember-view md-primary md-default-theme md-button']")
    public WebElement startBtn;

   @FindBy(xpath = "//span[@class='checkmark']")
   public WebElement datenSchtzKlick;


   @FindBy(xpath = "//*[@class='footer-button-right']")
   public WebElement weitrSendBtn;

   @FindBy(xpath = "//*[@id='control']")
  public WebElement führerscheinSelect;

   @FindBy(xpath = "//input[@type='tel']")
   public WebElement datum2000;

  // @FindBy(xpath = "(//div[@class='content-wrapper'])[1]")
   //public WebElement nichtAnswesend;

   @FindBy(xpath = "//input[@type='email']")
   public WebElement email;

    @FindBy(xpath = "//input[@class='submit-input']")
    public WebElement pdfBtn;

    @FindBy(xpath = "//button[@class='footer-button-right']")
    public WebElement sendBtn;

    //verstorben locater

    @FindBy(xpath = "(//*[@class='p-radiobutton-icon'])[2]")
    public WebElement verstorbenbtn;

    @FindBy(xpath = "(//*[@class='p-button-label ng-star-inserted'])[2]")
    public WebElement weiterBtnn;

    @FindBy(xpath = "(//*[@type='text'])[1]")
    public WebElement führerschnSelect;

    @FindBy(xpath = "(//*[@type='text'])[2]")
    public WebElement besitzInput;

    @FindBy(xpath = "(//*[@class='title ng-star-inserted'])[1]")
    public WebElement titel;

    @FindBy(xpath = "(//*[@type='text'])[3]")
    public WebElement ausstellLands;

    @FindBy(xpath = "(//*[@type='text'])[4]")
    public WebElement rabatBerechtigerVorname;

    @FindBy(xpath = "(//*[@type='text'])[5]")
    public WebElement rabatBerechtigerNachname;

    @FindBy(xpath = "(//*[@type='text'])[6]")
    public WebElement sterbeDatum;

    @FindBy(xpath = "(//*[@type='text'])[7]")
    public WebElement bisherigerVersicher;

    @FindBy(xpath = "(//*[@type='text'])[8]")
    public WebElement verscherungsNummer;

    @FindBy(xpath = "(//*[@type='text'])[9]")
    public WebElement kennzeichen;

    @FindBy(xpath = "(//*[@class='p-button-label ng-star-inserted'])[2]")
    public WebElement zusammenFassungBtn;

    @FindBy(xpath = "(//span[@class='p-button-label ng-star-inserted'])[2]")
    public WebElement antragEinreichen;

    @FindBy(xpath = "(//*[@class='p-radiobutton-icon'])[3]")
    public WebElement anwesendBtn;

    @FindBy(xpath = "//*[@class='p-dropdown-trigger']")
    public WebElement führerscheinDropdownBtn;

    @FindBy(xpath = "//*[@aria-label='C']")
    public WebElement führerschnKlasseC;

    @FindBy(xpath = "(//*[@type='text'])[2]")
    public WebElement besitzSeit;

    @FindBy(xpath = "(//*[@class='title ng-star-inserted'])[1]")
    public WebElement titell;

    @FindBy(xpath = "(//*[@type='text'])[3]")
    public WebElement land;

    @FindBy(xpath = "(//*[@type='text'])[4]")
    public WebElement vorName;

    @FindBy(xpath = "(//*[@type='text'])[5]")
    public WebElement nachName;

    @FindBy(xpath = "(//*[@type='text'])[6]")
    public WebElement bisherigerVersiecher;

    @FindBy(xpath = "(//*[@type='text'])[7]")
    public WebElement versicherungsNummer;

    @FindBy(xpath = "(//*[@type='text'])[8]")
    public WebElement amtKennzeichen;

    @FindBy(xpath = "//*[@class='signature-pad']")
    public WebElement signatur;

    @FindBy(xpath = "//*[@class='custom-select ember-view']")
    public WebElement beziehungZumVersicherungsnehmer;

    @FindBy(xpath = "(//*[@class='dropdown-option-cust empty-state visible'])[1]")
    public WebElement dritterEhegatte;



    public void navigateToradioBtn_Mtd(String radioMenu){
        Driver.get().findElement(By.xpath("//laser-radio[text()=' "+radioMenu+" ']")).click();
    }

    public void ihreDateninput_Mtd(int index, String data){
        Driver.get().findElement(By.xpath("(//input[@type='text'])["+index+"]")).sendKeys(data);
    }

   public void angabenZumFührerSchein_Mtd(int index, String daten) {
       Driver.get().findElement(By.xpath("(//laser-input[@type='text'])[" + index + "]")).sendKeys(daten);
   }

    public void bisherigerRabattBerechtiger_Mtd(int index, String data){
      Driver.get().findElement(By.xpath("(//*[@type='text'])["+index+"]")).sendKeys(data);
    }




   /* public void führerschein_Mtd(){
        Select select = new Select(führerscheinSelect);
        select.selectByVisibleText("A");
    }*/




















}
