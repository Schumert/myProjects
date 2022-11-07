import java.util.Scanner;

public class Kombinasyon {

	public static void main(String[] args) {
		int n, r, f1 = 0, f2 = 0, f3 = 0, fakt = 1, komb = 0;
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Kume sayisini soyleyin.");
		n = input.nextInt();
		
		System.out.println("Kacli kombinasyonunu alalim?");
		r = input.nextInt();
		
		for (int i = 1; i <= n; i++) {
			fakt = fakt * i;
		}
		f1 = fakt;
		
		fakt = 1;
	    
		for (int i = 1; i <= r; i++) {
			fakt = fakt * i;
		}
		f2 = fakt;
		fakt = 1;
		
		
		for (int i = 1; i <= (n-r); i++) {
			fakt = fakt * i;
		}
		f3 = fakt;
		komb = f1 / (f2 * f3);
		System.out.println(komb);
		
		

	}

}
/* Klavyeden eleman sayisi girilen bir kümenin belirtilen kombinasyonlarının sayısını hesaplayan program.
 * 
 * Başla
 * Yaz "Kume sayisini soyleyin.".
 * Oku n.
 * Yaz "Kacli kombinasyonunu alalim?".
 * Oku r.
 * fakt = 1;
 * i = 1;
 * Eğer i<=n ise
 * fakt = fakt * i;
 * i++.
 * 8'e git.
 * f1 = fakt.
 * fakt = 1;
 * i = 1;
 * Eğer i<=r ise 5'e git. 
 * fakt = fakt * i;
 * i++
 * Git 15'e.
 * f2 = fakt.
 * fakt = 1.
 * Eğer i<=(n-r) ise
 * fakt = fakt * i;
 * i++
 * Git 21'e.
 * f3 = f1 - f2.
 * komb = f1 / (f2 * f3).
 * Yaz komb.
 * Bitir.
 * 
 *
 */
