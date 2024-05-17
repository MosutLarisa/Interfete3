public class ContEuro extends ContBancar {

    private static final float COEFICIENT = 36000;
    private static final float DOBANDA = 0.3f;
    private static final int MAX = 500;
    private static final int MIN = 0;
    private final static String TIP = "EURO";

    public ContEuro(String numarCont, float suma) {
        super(numarCont, suma);
    }

    @Override
    public float getSumaTotala() {
        return getSuma() * COEFICIENT;
    }

    public float getDobanda() {
        if (getSuma() > MAX || getSuma() < MIN)
            return DOBANDA;
        return 0;
    }

    @Override
    public String getTip() {
        return TIP;
    }
}
