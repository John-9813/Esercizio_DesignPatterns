package johnoliveira.u5w3d3.adapter;


import java.time.LocalDate;
import java.time.Period;

public class Adapter implements DataSource {
    private final Info info;

    // Costruttore per Info
    public Adapter(Info info) {
        this.info = info;
    }

    @Override
    public String getNomeCompleto() {

        // unisco nome e cognome in un'unica stringa
        return info.getNome() + " " + info.getCognome();
    }

    @Override
    public int getEta() {
        // Calcolo l'età
        LocalDate dataDiNascita = LocalDate.parse((CharSequence) info.getDataDiNascita());
        return Period.between(dataDiNascita, LocalDate.now()).getYears();
    }
}

