package johnoliveira.u5w3d3.composite;

public class Runner {
    public static void main(String[] args) {
        // creo il libro
        Libro libro = new Libro("Il mio libro", 29.99);
        libro.aggiungiAutore("Mario Rossi");
        libro.aggiungiAutore("Lucia Bianchi");

        // creo pagine e sezioni
        Pagina pagina1 = new Pagina(1);
        Pagina pagina2 = new Pagina(2);
        Pagina pagina3 = new Pagina(3);

        Sezione sezione1 = new Sezione("Introduzione");
        sezione1.aggiungiElemento(pagina1);
        sezione1.aggiungiElemento(pagina2);

        Sezione sezione2 = new Sezione("Capitolo 1");
        sezione2.aggiungiElemento(pagina3);

        Sezione sezionePrincipale = new Sezione("Indice");
        sezionePrincipale.aggiungiElemento(sezione1);
        sezionePrincipale.aggiungiElemento(sezione2);

        libro.aggiungiElemento(sezionePrincipale);

        // stampo numero pagine e libro
        System.out.println("Numero totale di pagine: " + libro.getNumeroTotalePagine());
        libro.stampaLibro();
    }
}

