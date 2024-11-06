package johnoliveira.u5w3d3.composite;

public class Pagina implements LibroElement {
    private final int numeroPagina;

    public Pagina(int numeroPagina) {
        this.numeroPagina = numeroPagina;
    }

    @Override
    public int getNumeroPagine() {
        return 1;  // Parto dalla prima pagina
    }

    @Override
    public void stampa() {
        System.out.println("Stampando la pagina " + numeroPagina);
    }
}

