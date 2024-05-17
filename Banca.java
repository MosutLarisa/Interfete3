import java.util.ArrayList;

public class Banca {

    private ArrayList<Client> clienti;
    private String codBanca;

    public Banca(String codBanca) {
        this.codBanca = codBanca;
        this.clienti = new ArrayList<>();
    }

    public void adauga(Client c) {
    	clienti.add(c);
    }

    public boolean afiseazaInformatiiClient(String numeClient) {
        for (Client c : clienti) {
            if (c.getNume().equals(numeClient)) {
                System.out.println(c);
                for (ContBancar cont : c.getConturiBancare()) {
                    System.out.println(cont.getSumaTotala() + " " + cont.getTip());
                }
                return true;
            }
        }
        return false;
    }
}
