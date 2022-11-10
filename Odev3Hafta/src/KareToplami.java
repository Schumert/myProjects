import java.util.Scanner;

public class KareToplami {

	public static void main(String[] args) {
		int deger;
		int toplam = 0;


		Scanner input = new Scanner(System.in);

		System.out.println("Sayi gir. ");
		deger = input.nextInt();

		for (int i = 1; i <= deger; i++) {
			toplam += Math.pow(i, 2);
		}
		System.out.println(deger + " sayisina kadar olan sayilarin karesinin toplami: " + toplam);

	}

}
/* klavyeden girilen n sayısına göre, girilen n'e kadar olan sayıların karelerinin toplamı
 * 
 * 1. Başla
 * 2. Oku deger.
 * 3. toplam = 0.
 * 4. i = 1.
 * 5. toplam += i^2.
 * 6. i++.
 * 7. Eger i<=deger ise 5'e git.
 * 8. Yaz 
 */
