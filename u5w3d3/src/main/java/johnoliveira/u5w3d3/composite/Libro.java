package johnoliveira.u5w3d3.composite;

import java.util.ArrayList;
import java.util.List;

public class Libro {
    private final String titolo;
    private final List<String> autori = new ArrayList<>();
    private final double prezzo;
    private final List<LibroElement> elementi = new ArrayList<>();

    public Libro(String titolo, double prezzo) {
        this.titolo = titolo;
        this.prezzo = prezzo;
    }

    public void aggiungiAutore(String autore) {
        autori.add(autore);
    }

    public void aggiungiElemento(LibroElement elemento) {
        elementi.add(elemento);
    }

    public int getNumeroTotalePagine() {
        int totalePagine = 0;
        for (LibroElement elemento : elementi) {
            totalePagine += elemento.getNumeroPagine();
        }
        return totalePagine;
    }

    public void stampaLibro() {
        System.out.println("Stampando il libro: " + titolo);
        System.out.println("Autori: " + String.join(", ", autori));
        System.out.println("Prezzo: " + prezzo + " €");
        for (LibroElement elemento : elementi) {
            elemento.stampa();
        }
    }
}

