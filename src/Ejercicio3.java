public class Ejercicio3 {
	public static void main(String[] args) {
// Ejemplos: el primero debería devolver que Hay Escalera mientras que el segundo no
		int[] cartas1 = { 3, 4, 5, 6, 7 };
		int[] cartas2 = { 3, 5, 6, 7, 8 };
		boolean esEscalera = true;
		int num = 0;
		int num2 = 0;
		int x = 0;
		for (int i = 0; i < cartas1.length - 1; i++) {
			num = cartas1[i];
			num2 = cartas1[i + 1];
			if (num + 1 != num2) {
				esEscalera = false;
			}
		}
// Implementa un algoritmo que sea capaz de averiguar si hay o no escalera en el array de cartas
// Piensa en el juego del póker, en el que hay escalera si las cartas son consecutivas
// Almacena tu resultado en la variable esEscalera para que funcione el mensaje final
// Mensaje final
		System.out.println(esEscalera ? "Hay Escalera" : "No hay Escalera");
	}
}
