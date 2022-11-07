import java.util.Scanner;

public class TamBolen {

	public static void main(String[] args) {
		int a;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Tam bolenlerini ogrenmek istediginiz sayiyi girin.");
		a = input.nextInt();
		System.out.println(a + " sayisinin tam bolenleri:");
		for (int i = 1; i <= a; i++) {
			if((a % i) == 0) {
				System.out.print(i + " ");
			}
		}

	}

}
/* Klavyeden girilen pozitif bir a sayısının tam bölenlerini hesaplayıp listeleyne program.
 * 
 * 1. Başla.
 * 2. Yaz "Tam bolenlerini ogrenmek istediginiz sayiyi girin.".
 * 3. Oku a.
 * 4. i = 1.
 * 5. Eger i<=a  
 * 5.1. Eger (a % i) == 0 
 * 5.1.1. Yaz i
 * 5.2. i++
 * 5.3.   Git 5'e
 * 6. Bitir.
 * 
 */
