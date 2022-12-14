import java.util.Random;
import java.util.Scanner;

public class Odev7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int guess, randomNum, count = 0;

		Random r = new Random();
		randomNum = r.nextInt(100 - 1) + 1;
		//System.out.println(randomNum);
		System.out.println("1 ile 99 arasi sayi tahmin etmeye calisin");

		while (true) {
			count++;
			guess = input.nextInt();
			if (guess > randomNum) {
				System.out.println("Daha kucuk girin.");
			} else if (guess < randomNum) {
				System.out.println("Daha buyuk girin");
			} else {
				System.out.println("Tebrikler. " + count + " denemeyle buldunuz.");
				break;
			}
		}

	}

}
//Bilgisayarın ürettiği 1-99 arası bir tamsayının tahmin edilme oyunu programı.
