import java.util.Scanner;

public class Fonksiyon {

	public static void main(String[] args) {
		int y, x;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("X degeri girin.");
		x = input.nextInt();
		
		y = (x*x)-(5*x)+3;
		if(y > 0) {
			System.out.println(y + " Fonksiyon pozitif.");
		}
		else if(y < 0) {
			System.out.println(y + " Fonksiyon negatif.");
		}
		else {
			System.out.println(y + " Fonksiyonun kokudur.");
		}

	}

}
/*  İşaret(signum) fonksiyonu verilmiştir. Tanıma göre f(x) fonksiyonunun işaretini söyleyen program. 
 * 
 *  Başla.
 *  y = 0.
 *  Yaz "x degeri girin."
 *  Oku x.
 *  y = x^2-5x+3
 *  Eger y > 0
 *  Yaz "fonksiyon pozitif".
 *  Eger y < 0
 *  Yaz "fonksiyon negatif".
 *  Eger y == 0
 *  Yaz "fonksiyonun kökü bu".
 *  Bitir.
 */
