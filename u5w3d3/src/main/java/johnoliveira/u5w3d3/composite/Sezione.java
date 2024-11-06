package johnoliveira.u5w3d3.composite;

import java.util.ArrayList;
import java.util.List;

public class Sezione implements LibroElement {
    private final String titolo;
    private final List<LibroElement> elementi = new ArrayList<>();

    public Sezione(String titolo) {
        this.titolo = titolo;
    }

    public void aggiungiElemento(LibroElement elemento) {
        elementi.add(elemento);
    }

    @Override
    public int getNumeroPagine() {
        int totalePagine = 0;
        for (LibroElement elemento : elementi) {
            totalePagine += elemento.getNumeroPagine();
        }
        return totalePagine;
    }

    @Override
    public void stampa() {
        System.out.println("Stampando la sezione: " + titolo);
        for (LibroElement elemento : elementi) {
            elemento.stampa();  // stampo ogni sotto-elemento della sezione
        }
    }
}

