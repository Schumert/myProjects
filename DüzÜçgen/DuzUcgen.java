import java.util.Scanner;

public class DuzUcgen {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int satir;
		System.out.println("Satir sayisi girer misiniz acaba hi, rica etsem falan? ");
		satir = input.nextInt();
		for (int i = 1; i <= satir; i++) {
			for (int j = 1; j <= satir - i; j++) {
				System.out.print(" ");

			}
			for (int j = 1; j <= (i * 2) - 1; j++) {

				System.out.print("*");
			}

			System.out.println();
		}
     input.close();
	}
}
