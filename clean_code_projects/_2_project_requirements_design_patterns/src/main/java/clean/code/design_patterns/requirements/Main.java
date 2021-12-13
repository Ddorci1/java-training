package clean.code.design_patterns.requirements;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.println("Bine ați venit pe platforma Teatrului Național");
        System.out.println("în ce zi ați dori sa mergeți la teatru?");
        String type = reader.readLine();
        Ziua ziua = ZiuaAleasa.getZiua(type);
        System.out.println("Alegeți genul piesei");
        type = reader.readLine();

        Piesa piesa1;
        if (type.equals("drama")) {
            piesa1 = new Drama();
        } else
            if (type.equals("comedie"))
            piesa1 = new Comedie();
            else piesa1 = null;


        System.out.println(piesa1.getPiesa(ziua));
    }
}