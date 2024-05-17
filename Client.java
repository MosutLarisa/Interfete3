import java.util.ArrayList;

public class Client {

    private String nume;
    private String adresa;
    private ArrayList<ContBancar> conturiBancare;
    
    public Client(String nume, String adresa) {
        this.nume = nume;
        this.adresa = adresa;
        this.conturiBancare = new ArrayList<>();
    }
    
    public String getNume() {
        return nume;
    }

    public String getAdresa() {
        return adresa;
    }

    public ArrayList<ContBancar> getConturiBancare() {
        return conturiBancare;
    }

    public boolean adaugaCont(ContBancar nouCont) {
        if (this.conturiBancare.size() < 5) {
            return this.conturiBancare.add(nouCont);
        }
        System.err.println("Clientul nu poate avea mai mult de 5 conturi bancare!");
        return false;
    }
    
    public boolean equals(Client c) {
        return this.getNume().equals(c.getNume());
    }
    
    @Override
    public String toString() {
        return "Nume: " + this.getNume() + " , Adresa: " + this.getAdresa();
    }
}
