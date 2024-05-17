public class ContLei extends ContBancar {
    
    private final static String TIP = "LEI";
    
    public ContLei(String numarCont, float suma) {
        super(numarCont, suma);
    }

    @Override
    public float getSumaTotala() {
        return this.getSuma();
    }
    
    @Override
    public String getTip() {
        return TIP;
    }
}
