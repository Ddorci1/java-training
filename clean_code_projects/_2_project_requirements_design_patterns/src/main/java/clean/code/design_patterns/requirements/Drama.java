package clean.code.design_patterns.requirements;

public class Drama implements Piesa {
    @Override
    public String getPiesa(Ziua day) {
        String piesa = "";
        piesa = piesa + "In ziua de " + day.getDay() + " va fi drama: "   + day.getDrama() + ". Veți achita biletul la casă";
        return piesa;
    }
}
