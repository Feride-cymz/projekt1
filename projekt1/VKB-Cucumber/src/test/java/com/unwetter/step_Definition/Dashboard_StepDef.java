package com.unwetter.step_Definition;
import com.unwetter.pages.DashboardPage;
import com.unwetter.utilities.BrowserUtils;
import com.unwetter.utilities.ConfigurationReader;
import com.unwetter.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Dashboard_StepDef {


    DashboardPage dashboardPage=new DashboardPage();
    @Given("Der Benutzer ist auf der Loginseite")
    public void der_benutzer_ist_auf_der_loginseite() {
        Driver.get().get(ConfigurationReader.get("url"));
    }
    @When("Der Benutzer ist auf der Homepage und klickt auf Module {int}")
    public void der_benutzer_ist_auf_der_homepage_und_klickt_auf_module(int module) {
        dashboardPage.homePage(module);
    }
    @Then("Der Benutzer sollte Unwetter-Message sehen")
    public void der_benutzer_sollte_unwetter_message_sehen() {

        String expectedMessage="Meldung eines Gebäudeschadens durch Unwetter";

        Assert.assertEquals(expectedMessage,dashboardPage.dashboardMessage.getText());
    }
    @Then("Der Benutzer sollte auf die Datumsschaltfläche klicken und Tag {int} auswählen können")
    public void der_benutzer_sollte_auf_die_datumsschaltfläche_klicken_und_tag_auswählen_können(int dayNo) throws InterruptedException {
        dashboardPage.dayDatumElement(dayNo);
    }
    @Then("Der Benutzer sollte in der Wetterlage Frage einen diesen button {string} auswählen können")
    public void der_benutzer_sollte_in_der_wetterlage_frage_einen_diesen_button_auswählen_können(String radioText) {
        dashboardPage.wetterlageRadioBtn_Mtd(radioText);
    }
    @And("Der Benutzer klickt weiter button")
    public void derBenutzerKlicktWeiterButton() {
        dashboardPage.firstWeiterBtn.click();
    }

    @Then("Der Bbenutzer verifiziert Welcome Message {string}")
    public void der_bbenutzer_verifiziert_welcome_message(String expectedResult) {
        Assert.assertEquals(expectedResult,dashboardPage.verifyMessageArtDesShades.getText());

    }
    @And("Der Benutzer wählt In welchem Bereich die Eingabe {string} aus")
    public void derBenutzerWahltInWelchemBereichDieEingabeAus(String type) {
        dashboardPage.welchemBereicSelect_Mtd(type);
    }

    @Then("Der Benutzer klickt auf den zweiten Weiter-Button")
    public void der_benutzer_klickt_auf_den_zweiten_weiter_button() {
        BrowserUtils.clickWithJS(dashboardPage.zweiteWeiterBtn);

    }
    @And("Der Benutzer klickt auf den Select-Button Worin besteht die Beschädigung und wählt {string} aus")
    public void derBenutzerKlicktAufDenSelectButtonWorinBestehtDieBeschadigungUndWahltAus(String type) {
        dashboardPage.worinBestehtSelect_Mtd(type);

    }

    @And("Der Benutzer klickt für die Frage Ist in Folge der Bewschädigung Wasser eingedrungen? ja")
    public void derBenutzerKlicktFurDieFrageIstInFolgeDerBewschadigungWasserEingedrungenJa() {
        BrowserUtils.clickWithJS(dashboardPage.istinFolgeJaRadioBtn);
        BrowserUtils.waitFor(1);
    }

    @And("Der Benutzer klickt Select-Button Wie ist das Wasser ins Gebäude eingedrungen? und wählt {string} aus")
    public void derBenutzerKlicktSelectButtonWieIstDasWasserInsGebaudeEingedrungenUndWahltAus(String type) {
        BrowserUtils.clickWithJS(dashboardPage.wieIstDasWasserElement);
        BrowserUtils.waitFor(1);
        dashboardPage.wieIstDasWetterQuestion_Mtd(type);
    }

    @And("Der Benutzer klickt Sofortmassnahmen button und wählt {string} aus")
    public void derBenutzerKlicktSofortmassnahmenButtonUndWahltAus(String type) {
        dashboardPage.welcheSofortMassnahmen_Mtd(type);
    }
    @Then("Der Benutzer wählt Welche Teile die Eingabe {string} aus")
    public void der_benutzer_wählt_welche_teile_die_eingabe_aus(String type) {
        dashboardPage.welcheTeileSelect_Mtd(type);

    }

    @Then("Der Benutzer verzifiert die zweite Welcome-Message {string}")
    public void der_benutzer_verzifiert_die_zweite_welcome_message(String expectedText) {
        Assert.assertEquals(expectedText,dashboardPage.verifyMessageBeschädigungen.getText());
    }

    @And("Der Benutzer klickt für die Frage Hat sich ein Handwerker den Schaden bereits angesehen? {string}")
    public void derBenutzerKlicktFurDieFrageHatSichEinHandwerkerDenSchadenBereitsAngesehen(String arg0) {
        dashboardPage.hatSichHandwerkerNeinBtn.click();
    }

    @Then("Der Benutzer klickt für die Frage {string} {string}")
    public void der_benutzer_klickt_für_die_frage(String type) {

        dashboardPage.worinBestehtSelect_Mtd(type);
    }
    @Then("Der Benutzer klickt Select-Button {string} und wählt {string} aus")
    public void der_benutzer_klickt_select_button_und_wählt_aus() {

        BrowserUtils.clickWithJS(dashboardPage.istinFolgeJaRadioBtn);
        BrowserUtils.waitFor(1);
    }
    @Then("Der Benutzer sendet an das Eingabefeld eine Nachricht {string}")
    public void der_benutzer_sendet_an_das_eingabefeld_eine_nachricht(String type) {
        BrowserUtils.clickWithJS(dashboardPage.textFeldBtn);
        BrowserUtils.waitFor(1);
        dashboardPage.wieIstDasWetterQuestion_Mtd(type);
    }
    @Then("Der Benutzer klickt auf den Weiter-Button")
    public void der_benutzer_klickt_auf_den_weiter_button(String messageText) {
        dashboardPage.welcheRaumeInputBox_Mtd(messageText);
    }
    @Then("Der Benutzer verzifiert die dritte Welcome-Message {string}")
    public void der_benutzer_verzifiert_die_dritte_welcome_message() {
        dashboardPage.beschädigungenWeiterBtn.click();
    }
    @Then("Der Benutzer klickt {string} Button und wählt {string} aus")
    public void der_benutzer_klickt_button_und_wählt_aus(String expectedMessage) {
        Assert.assertEquals(expectedMessage,dashboardPage.verifayMessageMassnahmenPage.getText());
    }
    @Then("Der Benutzer verzifiert die vierte Welcome-Message {string}")
     public void der_benutzer_verzifiert_die_vierte_welcome_message(String expectText) {
        Assert.assertEquals(expectText,dashboardPage.verifyMessageEinreichungPage.getText());


    }



}