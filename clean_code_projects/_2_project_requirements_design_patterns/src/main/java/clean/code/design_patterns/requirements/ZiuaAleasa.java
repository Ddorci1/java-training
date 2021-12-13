package clean.code.design_patterns.requirements;
public class ZiuaAleasa{
    public ZiuaAleasa() {
    }

    public static Ziua getZiua(String type) {
        if (type.equals("luni"))
            return new Luni();
         else if (type.equals("marti"))
            return new Marti();
          else if (type.equals("miercuri"))
              return new Miercuri();
            else if (type.equals("joi"))
              return new Joi();
            else if (type.equals("vineri") )
                return new Vineri();
            else if (type.equals("sambata"))
                return new Sambata();
            else if (type.equals("duminica"))
            return new Duminica();
                else return null;
        }
    }
