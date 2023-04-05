package utilitarios;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Utils {

	static NumberFormat formatandoValores = new DecimalFormat("R$ #, ##0.00");
	//transformando de double para string
	public static String doubleToString(Double valor) {
		return  formatandoValores.format(valor);
	}
}