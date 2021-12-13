package clean.code.design_patterns.requirements;
public class Miercuri implements Ziua {
    @Override
    public String getDrama() {
        return "Dictatorul";
    }

    @Override
    public String getComedy() {
        return "Doi tineri din Verona";
    }
    @Override
    public String getDay() {return "Miercuri";}
}
