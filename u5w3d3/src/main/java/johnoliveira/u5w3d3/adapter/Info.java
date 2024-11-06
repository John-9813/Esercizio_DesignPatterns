package johnoliveira.u5w3d3.adapter;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Info {
    private String nome;
    private String cognome;
    private String dataDiNascita;

    public String getNome() {return nome;}

    public void setNome(String nome) {this.nome = nome;}

    public String getCognome() {return cognome;}

    public void setCognome(String cognome) {this.cognome = cognome;}

    public String getDataDiNascita() {return dataDiNascita;}

    public void DataDiNascita (String dataDiNascita) {this.dataDiNascita = dataDiNascita;}
}
