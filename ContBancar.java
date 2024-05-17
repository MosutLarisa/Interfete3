public abstract class ContBancar implements SumaTotala {

    private String numarCont;
    private float suma;

    public ContBancar(String numarCont, float suma) {
        this.numarCont = numarCont;
        this.suma = suma;
    }

    public float getSuma() {
        return suma;
    }

    public void setSuma(float suma) {
        this.suma = suma;
    }

    public String getNumarCont() {
        return numarCont;
    }

    public void setNumarCont(String numarCont) {
        this.numarCont = numarCont;
    }

    public void transfera(ContBancar destinatar, float suma) {
        if (this instanceof ContLei) {
            this.setSuma(this.getSuma() - suma);
            destinatar.setSuma(destinatar.getSuma() + suma);
        } else {
            System.out.println("Doar conturile în lei pot utiliza funcția de transfer!");
        }
    }

    public abstract String getTip();

    @Override
    public String toString() {
        return this.getNumarCont() + " , " + this.getSumaTotala() + " " + this.getTip();
    }
}
