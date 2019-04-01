package nl.ooad.liamsean;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OdinidoConsole {

    private OdinidoController controller;

    public static void main(String[] args) {
        OdinidoConsole console = new OdinidoConsole();
        console.startProgramma();
    }

    private void startProgramma() {
        controller = new OdinidoController();

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        System.out.println("Welkom bij Odinido");

        try {
            while (!input.equalsIgnoreCase("stop")) {
                controller.reset();
                System.out.println("U kunt verschillende toetsen maken, namelijk: \r\n" +
                        "[1] Toets \"Requirements\" \r\n" +
                        "[2] Toets \"Wiskunde\" \r\n" +
                        "Om een toets te starten toetst u het nummer van de toets in.\r\n" +
                        "Indien u wil stoppen toets \"stop\"");
                input = in.readLine();

                if (input.equalsIgnoreCase("stop")) {
                    System.out.println("Bedankt voor het gebruiken van Odinido.");
                } else {
                    System.out.println("U heeft gekozen voor toets " + input);
                }

                if (input.equals("1")) {
                    startToets(in, "ODI23644129");
                } else if (input.equals("2")) {
                    startToets(in, "ODI24878686");
                } else if (!input.equalsIgnoreCase("stop")) {
                    System.out.println("Deze toets bestaat niet. Probeer het opnieuw, of typ \"stop\" om te stoppen.");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void startToets(BufferedReader reader, String toetscode) throws IOException {
        controller.startKennistoets(toetscode);
        String volgendeVraag;
        String input;
        while ((volgendeVraag = controller.getVolgendeVraag()) != null) {
            System.out.println("\r\n" + volgendeVraag);
            input = reader.readLine();
            controller.beantwoordVraag(input);
        }
        int score = controller.geneerScoreOverzicht();
        System.out.println("\r\nUw score: " + score);
        if(score == 5){
            System.out.println("Perfecte score! \r\n");
        }
    }

}
