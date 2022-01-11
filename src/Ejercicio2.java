import java.util.Arrays;
import java.util.Scanner;

/*
 *El ejercicio nos pide escribir por pantalla una lista de numeros y que devuelva el array
 *ordenado de manera ascendente, es decir, de menor a mayor.
 */
public class Ejercicio2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] list = { 0, 0, 0, 0, 0 };
		int aux = 0;
		int count = 0;
		int datos;
//El while lo utilizaremos para dar los valores del array los cuales tienen que ser 5.
		while (count < 5) {
			datos = scan.nextInt();
			list[count] = datos;
			count++;
		}
		/*
		 * Para ordenarlos utilizaremos el metodo d ela burbuja dentro de los 2 for para
		 * recorrer el array. Para llevar a cabo el metodo de la burbuja necesitaremos
		 * la bariable aux para cambiar los valores del array segun convenga para
		 * dejarlo correctamnte ordenado.
		 */
		for (int i = 0; i < list.length - 1; i++) {
			for (int j = 0; j < list.length - i - 1; j++) {
				if (list[j + 1] < list[j]) {
					aux = list[j + 1];
					list[j + 1] = list[j];
					list[j] = aux;
				}

			}
		}
		System.out.println("El listado de numeros oredenados de manera ascendente es:" + (Arrays.toString(list)));
	}
}
