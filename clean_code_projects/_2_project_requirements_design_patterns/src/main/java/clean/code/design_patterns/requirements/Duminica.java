package clean.code.design_patterns.requirements;
public class Duminica implements Ziua{
    @Override
    public String getDrama() {
        return "Hamlet";
    }

    @Override
    public String getComedy() {
        return "O scrisoare pierduta";
    }
    @Override
    public String getDay() {return "Duminica";}
}
