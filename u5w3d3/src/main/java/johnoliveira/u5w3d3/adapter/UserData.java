package johnoliveira.u5w3d3.adapter;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class UserData {
    private String nomeCompleto;
    private int eta;

    public void getData(DataSource ds) {
        nomeCompleto = ds.getNomeCompleto ();
        eta = ds.getEta();
    }
}
