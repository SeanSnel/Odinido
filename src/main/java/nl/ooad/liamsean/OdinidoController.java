package nl.ooad.liamsean;

import java.util.HashMap;

public class OdinidoController {

    private OdinidoToetsbank toetsbank = new OdinidoToetsbank();
    private Kennistoets huidigeToets;
    private int huidigeVraag;
    private HashMap<Integer, String> gegevenAntwoorden;

    public void beantwoordVraag(String antwoord) {
        gegevenAntwoorden.put(huidigeVraag, antwoord);
    }

    public int geneerScoreOverzicht() {
        int score = 0;
        for (int i = 1; i <= gegevenAntwoorden.size(); i++) {
            String gegevenAntwoord = gegevenAntwoorden.get(i);
            Vraag vraag = huidigeToets.getVraag(i-1);
            score += vraag.berekenPuntenVoorAntwoord(gegevenAntwoord);
        }
        return score;
    }

    public void startKennistoets(String toetscode) {
        huidigeToets = toetsbank.selecteerToets(toetscode);
    }

    public String getVolgendeVraag() {
        Vraag vraag = huidigeToets.getVraag(huidigeVraag++);
        if(vraag == null){
            return null;
        }
        String vraagString = huidigeVraag + ": " + vraag.getVraag();
        if (vraag instanceof Meerkeuzevraag) {
            vraagString += "\r\n" + ((Meerkeuzevraag) vraag).getMogelijkeAntwoorden();
            vraagString += "Geef het antwoord dat achter het opsommingsteken staat.";
        }

        return vraagString;
    }

    public void reset() {
        huidigeVraag = 0;
        gegevenAntwoorden = new HashMap<>();
        huidigeToets = null;
    }
}
