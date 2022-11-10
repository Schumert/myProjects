import java.util.Scanner;

public class DostSayilar {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int m, n, mTop = 0, nTop = 0;
		
		System.out.println("Sayilarin da dost olabildigini biliyor muydun? BILMIYOR MUYDUN?! Oyleyse iki cift sayi gir de ogren.\nOnce ilkini gir.\n");
		System.out.println("Iki sayinin da dost olabilmesi icin ilk sayinin tam bolenleri toplami ikinci sayiya ve\nikinci sayinin tam bolenleri toplami ilk sayiya esit olmalidir.");
		m = input.nextInt();
		System.out.println("Simdi ise digerini...");
		n = input.nextInt();
		
		System.out.println("Ilk sayinin kendisi haric tam bolenleri:");
		for (int i = 1; i < m; i++) {
			if ( (m % i) == 0 ) {
				System.out.print(i + " ");
				mTop+=i;
			}
			
		}
		System.out.print("-> Sayilarinin toplami -> " + mTop);
		System.out.println("\n");
		
		System.out.println("Ikinci sayinin kendisi haric tam bolenleri:");
		for (int i = 1; i < n; i++) {
			if ( (n % i ) == 0 ) {
				System.out.print(i + " ");
				nTop+=i;
			}
		}
		System.out.print(" -> Sayilarinin toplami -> " + nTop);
		System.out.println("\n");
		if (mTop == n && nTop == m) {
			System.out.println("Bu ikisinin ateste dovulmus birer dostluklari var. BFF diyorum hani.\nBu iki sayi 'Dost Sayilar' idir.\"");
		}
		else {
			System.out.println("Bu ikisi maalesef ki dost degiller. Uzulme, sansini bir daha dene diyorum.");
		}
		input.close();
	}

}
/* (m,n) tamsayı çifti için: m'nin kendisi hariç tam bölenlerinin toplamı n'ye ve n'nin kendisi hariç 
 * tam bölenlerinin toplamı m'ye eşitse bu iki sayıya "dost sayilar" denir. Bunu tespit eden program.
 * 
 * 1.Başla
 * 2.Yaz "Sayıların da dost olabildigini biliyor muydun?\n BILMIYOR MUYDUN?!\n Oyleyse iki cift sayi gir de ogren."
 * 3.Oku m, n.
 * 4.mTop = 0, nTop = 0.
 * 5.i = 1.
 * 6.Eger i<m
 * 6.1.Eger (m % i) == 0
 * 6.1.1.mTop+=m
 * 6.2.i++.
 * 6.3.Git 6'ya.
 * 7.i = 1.
 * 8.Eger i<n
 * 8.1Eger (n % i) == 0
 * 8.1.1nTop+=n.
 * 8.2.i++.
 * 8.3.Git 8'e.
 * 9.Eger(mTop == nTop)
 * 9.1.Yaz "Bu ikisinin ateşte dovulmus birer dostluklari var. BFF diyorum hani.\n m ve n 'Dost Sayilar' idir.".
 * 9.2.degilse Yaz "Bu ikisi maalesef ki dost degiller. Uzulme, sansini bir daha dene diyorum.".
 * 
 */
