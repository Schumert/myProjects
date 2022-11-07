import java.util.Scanner;

public class PayPayda {

	public static void main(String[] args) {
		int a, b, c = 0, k = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Pay degerini gir.");
		a = input.nextInt();
		
		System.out.println("Payda degerini gir.");
		b = input.nextInt();
		
		System.out.print(a/b + "."); 
		for (int i = 0; i <= 10; i++) {
			c = a / b;
		    k = a % b;
			a = k * 10;
			if(i > 0) { // 3'ü tekrar yazdırmasın diye
				
			
			System.out.print(c);
			}
		}
		
		

	}

}
/* pay payda giriyoz, basamak degerleriyle yazdirma programı?????.
 * 
 * 1. Başla
 * 2. Yaz "pay gir.".
 * 3. Oku a.
 * 4. Yaz "payda gir.".
 * 5. Oku b.
 * 6. c = 0.
 * 7. k = 0.
 * 8. i = 0.
 * 9. Eger i <= 10 ise
 * 9.1. c = a / b
 * 9.2. k = a % b
 * 9.3. a = k * 10
 * 9.4. i++
 * 9.5. Git 9'a
 * 10. Yaz c. 
 */
