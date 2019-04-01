package nl.ooad.liamsean;

import java.util.ArrayList;
import java.util.List;

public class Meerkeuzevraag extends Vraag {

	private List<Antwoord> mogelijkeAntwoorden;

    public Meerkeuzevraag(String vraag) {
        super(vraag);
        mogelijkeAntwoorden = new ArrayList<>();
    }

    public void voegAlternatiefToe(String antwoord, boolean correcteAntwoord) {
        mogelijkeAntwoorden.add(new Antwoord(antwoord));
        if(correcteAntwoord){
            super.setCorrectAntwoord(new Antwoord(antwoord));
        }
    }

    public String getMogelijkeAntwoorden(){
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < mogelijkeAntwoorden.size(); i++) {
            builder.append("\t");
            builder.append((char)('a'+i));
            builder.append(") ");
            builder.append(mogelijkeAntwoorden.get(i).getAntwoord());
            builder.append("\r\n");
        }
        return builder.toString();
    }
}
