package nl.ooad.liamsean;

import java.util.ArrayList;
import java.util.List;

public class Kennistoets {

    private String code;
    private String naam;
    private List<Vraag> vragen;

    public Kennistoets(String code, String naam) {
        this.code = code;
        this.naam = naam;
        this.vragen = new ArrayList<>();
    }

    public Vraag getVraag(int vraagnr) {
        if (vraagnr < vragen.size()) {
            return vragen.get(vraagnr);
        } else {
            return null;
        }
    }

    public void voegVraagToe(Vraag vraag) {
        vragen.add(vraag);
    }
}
