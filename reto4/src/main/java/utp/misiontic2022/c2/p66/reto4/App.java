package utp.misiontic2022.c2.p66.reto4;

import utp.misiontic2022.c2.p66.reto4.vista.MenuCombo;
import utp.misiontic2022.c2.p66.reto4.vista.MenuRadio;
import utp.misiontic2022.c2.p66.reto4.vista.VistaRequerimientos;

/**
 * Esta clase solo se debe usar para hacer pruebas locales,
 * no se debe subir en iMaster
 */
public class App
{
    public static void main( String[] args )
    {
        /*
        System.out.println("Requerimiento 1");
        VistaRequerimientos.requerimiento1();

        System.out.println("\nRequerimiento 2");
        VistaRequerimientos.requerimiento2();

        System.out.println("\nRequerimiento 3");
        VistaRequerimientos.requerimiento3();
*/
        MenuCombo vm = new MenuCombo();
        vm.setVisible(true);
        
        MenuRadio vmr = new MenuRadio();
        vmr.setVisible(true);
    }
}
