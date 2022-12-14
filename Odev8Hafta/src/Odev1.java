import java.util.Scanner;

public class Odev1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int x, n, sonuc = 0;

		System.out.println("x degeri gir.");
		x = input.nextInt();
		System.out.println("n degeri gir.");
		n = input.nextInt();

		sonuc = (int) Math.pow(1 + x / n, n);
		System.out.println(sonuc);

	}

}
// e^x değeri e^x = lim n->sonsuz (1 + x / n)^n "Binom açılımı" kullanılarak hesaplanabilmektedir. Buna göre; klavyeden girilen x ve n değerlerine göre e^x'i hesaplayan program.
