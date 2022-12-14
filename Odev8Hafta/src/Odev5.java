import java.util.Random;
import java.util.Scanner;

public class Odev5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String guess;

		Random r = new Random();
		int randomNum = r.nextInt(91 - 65) + 65;
		char letter = (char) randomNum; // ürettiğimiz sayıyı ascii'deki karşılığı olan harfe dönüştürdük.
		// System.out.println(letter);

		for (int i = 1; i <= 10; i++) {
			System.out.println("Rastgele uretilen harfi tahmin etmeye calis. Canin: " + (11 - i));
			guess = input.nextLine();
			guess = guess.toUpperCase(); // küçük harfi büyüttük ki küçük harfi yanlış almasın.
			char karTahmin = guess.charAt(0);
			int asciiofTahmin = (int) karTahmin; // tahmini ascii koduna dönüştürdük.

			if (asciiofTahmin == randomNum) {
				System.out.println("Tebrikler. " + i + " denemede bildiniz.");
				System.exit(0);
			} else {
				System.out.println("Yanlis tahmin. Kalan can: " + (10 - i));
			}

		}

		System.out.println("Kaybettiniz. Cevap " + letter + " idi.");

		input.close();
	}

}
//Bilgisayarın ürettiği rastgele büyük harfin, en fazla 10 denemede tahmin edilme oyunu programı.
