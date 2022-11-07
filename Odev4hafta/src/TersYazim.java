import java.util.Scanner;

public class TersYazim {

	public static void main(String[] args) {
		int a, b = 0, k = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Sayi gir ters yazdirayim.");
		a = input.nextInt();
		
		while(a > 0) {
			k = a % 10;
			b = (b * 10) + k;
			a = a / 10;
		}
		System.out.println(b);

	}


}
/* Klavyeden girilen pozitif tam sayinin tersten yazilmiş sayisal degerini elde eden program.
 * 
 * 1. Başla
 * 2. b = 0.
 * 3. Yaz "Bir tam sayi degeri gir.".
 * 4. Oku a.
 * 5. Eger a > 0 ise
 * 5.1 k = a % 10
 * 5.2 b = (b * 10) + 2.
 * 5.3 a = a / 10.
 * 5.4 Git 5'e
 * 6. Yazdir b.
 * 7. Bitir.
 * 
 */
