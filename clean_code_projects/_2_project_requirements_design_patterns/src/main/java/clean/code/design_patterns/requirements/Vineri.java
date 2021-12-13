package clean.code.design_patterns.requirements;
public class Vineri implements Ziua{
    @Override
    public String getDrama() {
        return "Jocul Ielelor";
    }

    @Override
    public String getComedy() {
        return "Omul care a văzut moartea";
    }
    @Override
    public String getDay() {return "Vineri";}
}
