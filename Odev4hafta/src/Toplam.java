import java.util.Scanner;

public class Toplam {

	public static void main(String[] args) {
	   int n, toplam = 0, ciftToplam = 0, tekToplam = 0;
		
	   Scanner input = new Scanner(System.in);
	   
	   System.out.println("Sayi girin.");
	   n = input.nextInt();
	   
	   for (int i = 1; i <= n; i++) {
		toplam += i;
	}
	   for (int i = 1; i <= n; i++) {
		   if((i % 2) == 0) {
			   ciftToplam += i;
		   }
		
	}
	   for (int i = 1; i <= n; i++) {
		if((i % 2) == 1) {
			tekToplam += i;
		}
	}
	   System.out.println("1'den " + n + " sayisina kadar olan sayilarin toplami: " + toplam);
	   System.out.println("1'den " + n + " cift sayisina kadar olan sayilarin toplami: " + ciftToplam);
	   System.out.println("1'den " + n + " tek sayisina kadar olan sayilarin toplami: " + tekToplam);
	}

}
/* Klavyeden girilen n sayısına göre; 1'den n'e kadar olan tam sayıların, tek tam sayıların ve 
 * çift tam sayıların toplamını hesaplayan progr.
 * 
 * Başla
 * Yaz "Sayi girin.".
 * Oku n.
 * ciftToplam = 0, tekToplam = 0, toplam = 0.
 * i = 1.,
 * Eger i <= n ise. 
 * toplam += i.
 * i++.
 * git 6'ya
 * j = 1.
 * Eger j<= n ise
 * Eger (j % 2) == 0 
 * ciftToplam += j.
 * j++
 * git 11'e
 * k = 1.
 * Eger i<=n 4'e git.
 * Eger (k % 2) == 1
 * tekToplam += k.
 * i++.
 * Git 17'ye
 * Eger k <= n ise git 13'e ve k++.
 * Yaz toplam, ciftToplam ve tekToplam.
 * 
 * 
 * 
 */
