package nl.ooad.liamsean;

import java.util.ArrayList;
import java.util.List;

public class KortAntwoordVraag extends Vraag{
    private List<Antwoord> correcteAntwoorden;

    public KortAntwoordVraag(String vraag) {
        super(vraag);
        correcteAntwoorden = new ArrayList<>();
    }

    @Override
    public int berekenPuntenVoorAntwoord(String gegevenAntwoord) {
        for (Antwoord antwoord : correcteAntwoorden){
            if(antwoord.getAntwoord().equalsIgnoreCase(gegevenAntwoord)){
                return 1;
            }
        }
        return 0;
    }

    public void voegAntwoordToe(String antwoord) {
        this.correcteAntwoorden.add(new Antwoord(antwoord));
    }
}
