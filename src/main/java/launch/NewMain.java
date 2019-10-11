/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package launch;

import Adapter.Medico;
import Facade.Facede;
import java.time.LocalTime;
import java.util.ArrayList;

/**
 *
 * @author Julio
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Facede fac = Facede.rConstructora();
        Medico med = (Medico) fac.getUsuarios().get("nikolas");
        ArrayList<Medico> medi=fac.Traer("12/10/2019", "07:00");
        System.out.println(medi.size());
    }
    
}
