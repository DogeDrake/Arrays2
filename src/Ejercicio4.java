import java.util.Scanner;

//Para poder contar todos los "clumps" usamos una variable tipo booleana
class Ejercicio4 {
	public static int countClumps(int[] nums) {
		boolean clump = false;
		int nclump = 0;
// cuando el numero actual y el siguiente cambiamos la variable booleana a true y sumamos clump
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == nums[i + 1] && !clump) {
				clump = true;
				nclump++;
			}
//si el siguiente numero es distinto al anterior volvemos la booleana false para confirmar que el clump ha acabado
			else if (nums[i] != nums[i + 1]) {
				clump = false;
			}
		}
		return nclump;
	}

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int[] nums = new int[5];
		System.out.println("Enter values into the array:");
		for (int i = 0; i < nums.length; i++)
			nums[i] = scanner.nextInt();
		System.out.println("Clumps:" + countClumps(nums));
	}
}