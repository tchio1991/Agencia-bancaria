package utilitarios;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Utilidades {
     
	static NumberFormat formatandoValores = new DecimalFormat("R$ #,##0.00");
	
    public static String doubleToSting(Double valor) {
    	return formatandoValores.format(valor);
    }
}
