package johnoliveira.u5w3d3.adapter;

public class Runner {
    public static void main(String[] args) {
        // creao un oggetto Info con i dati
        Info info = new Info();
        info.setNome("John");
        info.setCognome("Oliveira");
        info.setDataDiNascita("1998-05-15");

        // uso adapter
        InfoAdapter adapter = new InfoAdapter(info);

        // Questo UserData può usare Info grazie ad adapter
        UserData userData = new UserData();
        userData.getData(adapter);

        // ora userData contiene nomeCompleto e età presi da info
        System.out.println("Nome Completo: " + userData.getNomeCompleto());
        System.out.println("Età: " + userData.getEta());
    }
}

