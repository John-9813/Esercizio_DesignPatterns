package johnoliveira.u5w3d3.adapter;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
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

    public Date getDataDiNascita() {return dataDiNascita;}

    public void DataDiNascita (String dataDiNascita) {this.dataDiNascita = dataDiNascita;}
}
