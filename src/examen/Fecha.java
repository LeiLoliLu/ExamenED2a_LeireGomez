package examen;
/**
 * Clase Fecha, contiene un metodo que valida una fecha que consta de anio, mes y dia.
 * 
 * @author daw108
 * @version 1.2
 */
public class Fecha {
	private static boolean fechaValida;
	/**
	 * Metodo que valida la una fecha correspondiente. Comprueba que el dia mes y anio sean mayor que 0, 
	 * luego que el mes no sea mayor que 12 al igual que el dia no lo sea de 31.
	 * 
	 *	Si el mes es 2, los dias no deben exceder los 28 dias.
	 *	Si el mes es par, los dias no deben exceder 30 dias, y, en caso contrario, no deben exceder los 31.
	 *
	 *	Teniendo en cuenta todas estas condiciones, el metodo devuelve un booleano 'fechaValida', que sera False o true a corde a los datos introducidos.
	 *
	 * @param anio
	 * 			int, representa el anio de la fecha.
	 * @param mes
	 * 			int, representa el mes de la fecha.
	 * @param dia
	 * 			int, representa el dia de la fecha.
	 *
	 * @return fechaValida:
	 * 			booleano, devuelve true si la fecha es valida y false si no lo es.
	 */
	public static boolean validarFecha(int anio, int mes, int dia) {
		fechaValida = false;
		if ((dia > 0) && (mes > 0) && (anio > 0)) {
			if ((mes <= 12) && (dia <= 31)) {
				if (mes == 2) {
					fechaValida = dia <= 28;
				} else if (mes % 2 == 0) {
					fechaValida = dia <= 30;
				} else {
					fechaValida = dia <= 31;
				}
			}
		}
		return fechaValida;
	}
}