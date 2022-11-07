import java.util.Scanner;

public class TekSayiToplami {

	public static void main(String[] args) {
		int deger;
		int toplam = 0;

		Scanner input = new Scanner(System.in);

		System.out.println("Sayi girin.");
		deger = input.nextInt();
		for (int i = 0; i <= deger ; i++) {

			if((i % 2) == 1) {
				toplam = toplam + i;
			}
		}
		System.out.println(deger + " sayisina kadar olan tek sayilarin toplami: " + toplam);

	}

}
/* n sayısı alınacak, n sayısına göre tek sayıların toplamını bulduran programın algoritma akış 
diyagramı ve java kodu
 * 
 * 1. Başla.
 * 2. Yaz "Sayi girin.".
 * 3. Oku deger.
 * 4. i = 0;
 * 5. i++
 * 6. Eğer (i % 2) == 1
 * 6.1 toplam = toplam + i
 * 7. Eğer i <= deger ise git 5'e.
 * 8. Yazdir "deger + " sayisina kadar olan tek sayilarin toplami: " + toplam.
 */
