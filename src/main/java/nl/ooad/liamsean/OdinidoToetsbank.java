package nl.ooad.liamsean;

public class OdinidoToetsbank {

    private Kennistoets toets;
    private Meerkeuzevraag mcVraag;
    private KortAntwoordVraag kaVraag;

    private Kennistoets maakToetsODI23644129() {
        toets = new Kennistoets("ODI23644129", "Requirements");

        mcVraag = new Meerkeuzevraag("Welke van de begrippen needs, features en requirements horen bij het solution domain?");
        mcVraag.voegAlternatiefToe("needs, features en requirements", false);
        mcVraag.voegAlternatiefToe("needs en requirements", false);
        mcVraag.voegAlternatiefToe("features en requirements", true);
        mcVraag.voegAlternatiefToe("alleen requirements", false);
        toets.voegVraagToe(mcVraag);

        mcVraag = new Meerkeuzevraag("Wat wordt bedoeld met \"elicit needs from stakeholders\"?");
        mcVraag.voegAlternatiefToe("Het boven tafel krijgen van de needs van belanghebbenden.", true);
        mcVraag.voegAlternatiefToe("Het documenteren van de needs van belanghebbenden.", false);
        mcVraag.voegAlternatiefToe("Het valideren van de needs van belanghebbenden.", false);
        mcVraag.voegAlternatiefToe("Het vertalen van de needs van belanghebbenden naar software features.", false);
        toets.voegVraagToe(mcVraag);

        kaVraag = new KortAntwoordVraag("Welke term wordt gebruikt voor \"the ability to describe and follow the life of a requirement, in both forwards and backwards direction\"?");
        kaVraag.voegAntwoordToe("traceability");
        kaVraag.voegAntwoordToe("tracebility");
        kaVraag.voegAntwoordToe("traceabillity");
        kaVraag.voegAntwoordToe("tracebillity");
        toets.voegVraagToe(kaVraag);

        mcVraag = new Meerkeuzevraag("In een project wordt gewerkt volgens een iteratieve en incrementele aanpak.\r\n"
                + "Aan het begin van het project heb je de requirements opgesteld.\r\n"
                + "Op welke momenten in het project kunnen de requirements gewijzigd worden?");
        mcVraag.voegAlternatiefToe("Op elk gewenst moment.", false);
        mcVraag.voegAlternatiefToe("Na elke iteratie.", true);
        mcVraag.voegAlternatiefToe("Niet meer, de requirements liggen vast.", false);
        toets.voegVraagToe(mcVraag);

        mcVraag = new Meerkeuzevraag("In welke categorie valt de volgende eis?\r\n"
                + "R1. Het systeem moet 75% van de webpagina's binnen 2 seconden tonen.\r\n "
                + "   Voor de overige pagina's mag het nooit langer dan 5 seconden duren.");
        mcVraag.voegAlternatiefToe("Functionality", false);
        mcVraag.voegAlternatiefToe("Usability", false);
        mcVraag.voegAlternatiefToe("Reliability", false);
        mcVraag.voegAlternatiefToe("Performance", true);
        mcVraag.voegAlternatiefToe("Supportability", false);
        toets.voegVraagToe(mcVraag);

        return toets;
    }

    private Kennistoets maakToetsODI24878686() {
        toets = new Kennistoets("ODI24878686", "Wiskunde");

        mcVraag = new Meerkeuzevraag("Wat is 2^3/8?");
        mcVraag.voegAlternatiefToe("1", true);
        mcVraag.voegAlternatiefToe("20", false);
        mcVraag.voegAlternatiefToe("1/2", false);
        mcVraag.voegAlternatiefToe("10", false);
        toets.voegVraagToe(mcVraag);

        kaVraag = new KortAntwoordVraag("Wat is de lengte van de schuine zijde van een rechthoekige driehoek \r\n"
                + "waarvan de andere zijden de lengten 3 en 4 hebben?");
        kaVraag.voegAntwoordToe("5");
        toets.voegVraagToe(kaVraag);

        mcVraag = new Meerkeuzevraag("Wat is 15% van 80?");
        mcVraag.voegAlternatiefToe("9", false);
        mcVraag.voegAlternatiefToe("11", false);
        mcVraag.voegAlternatiefToe("12", true);
        mcVraag.voegAlternatiefToe("13", false);
        toets.voegVraagToe(mcVraag);

        mcVraag = new Meerkeuzevraag("Wat is cos(0)?");
        mcVraag.voegAlternatiefToe("0", false);
        mcVraag.voegAlternatiefToe("1", true);
        toets.voegVraagToe(mcVraag);

        mcVraag = new Meerkeuzevraag("Hoeveel mogelijke volgordes zijn er voor een spel met 52 unieke kaarten?");
        mcVraag.voegAlternatiefToe("2^52", false);
        mcVraag.voegAlternatiefToe("52!", true);
        mcVraag.voegAlternatiefToe("52^52", false);
        toets.voegVraagToe(mcVraag);

        return toets;
    }

    public Kennistoets selecteerToets(String toetscode) {
        if (toetscode == "ODI23644129") {
            return maakToetsODI23644129();
        } else if (toetscode == "ODI24878686") {
            return maakToetsODI24878686();
        } else {
            return null;
        }
    }

}
