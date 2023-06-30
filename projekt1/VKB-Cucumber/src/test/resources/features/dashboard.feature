Feature: Unwetter Menu Page
@wip
Scenario: The User should be go to unwetterschaden page
    Given  Der Benutzer ist auf der Loginseite
    When Der Benutzer ist auf der Homepage und klickt auf Module 2
    Then Der Benutzer sollte Unwetter-Message sehen
    And Der Benutzer sollte auf die Datumsschaltfläche klicken und Tag 4 auswählen können
    And Der Benutzer sollte in der Wetterlage Frage einen diesen button "Orkan" auswählen können
    And Der Benutzer klickt weiter button
    Then Der Bbenutzer verifiziert Welcome Message "Art des Schadens"
    And Der Benutzer wählt In welchem Bereich die Eingabe " Garage " aus
    And Der Benutzer wählt Welche Teile die Eingabe " Fenster " aus
    And Der Benutzer klickt auf den zweiten Weiter-Button
    Then Der Benutzer verzifiert die zweite Welcome-Message "Beschädigungen"
    And Der Benutzer klickt auf den Select-Button Worin besteht die Beschädigung und wählt " Dellen " aus
    And Der Benutzer klickt für die Frage Ist in Folge der Bewschädigung Wasser eingedrungen? ja
    And Der Benutzer klickt Select-Button Wie ist das Wasser ins Gebäude eingedrungen? und wählt " Dach " aus
    And Der Benutzer sendet an das Eingabefeld eine Nachricht "Erste und zweite Räume wurden beschädigt"
    And Der Benutzer klickt auf den Weiter-Button
    Then Der Benutzer verzifiert die dritte Welcome-Message " Maßnahmen zur Behebung des Schadens "
    And Der Benutzer klickt Sofortmassnahmen button und wählt "keine" aus
    And Der Benutzer klickt für die Frage Hat sich ein Handwerker den Schaden bereits angesehen? "Nein"
    And Der Benutzer klickt auf den Weiter-Button
    Then Der Benutzer verzifiert die vierte Welcome-Message " Einreichung von Unterlagen "