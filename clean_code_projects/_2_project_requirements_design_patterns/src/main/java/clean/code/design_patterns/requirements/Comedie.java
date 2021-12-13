package clean.code.design_patterns.requirements;

public class Comedie implements Piesa {
    @Override
    public String getPiesa(Ziua day) {
        String piesa = "";
        piesa = piesa + "In ziua de " + day.getDay() +" va fi comedia: " + day.getComedy() + ". Veți achita biletul la casă";
        return piesa;
    }
}
