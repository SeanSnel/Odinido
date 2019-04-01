package nl.ooad.liamsean;

public class Vraag {

	private String vraag;

	private int teVerdienenPunten;

	private Antwoord correctAntwoord;

	public Vraag(String vraag) {
		this.vraag = vraag;
		this.teVerdienenPunten = 1;
	}

    public int berekenPuntenVoorAntwoord(String antwoord) {
		if (antwoord.equalsIgnoreCase(correctAntwoord.getAntwoord())){
			return 1;
		}
		return 0;
	}

	public void setCorrectAntwoord(Antwoord antwoord){
		this.correctAntwoord = antwoord;
	}

	public String getVraag(){
		return vraag;
	}

}
