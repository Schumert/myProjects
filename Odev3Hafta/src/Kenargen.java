import java.util.Scanner;

public class Kenargen {

	public static void main(String[] args) {
		int kenar1, kenar2, kenar3;

		Scanner input = new Scanner(System.in);

		System.out.println("1. kenari girin");
		kenar1 = input.nextInt();

		System.out.println("2. kenari girin.");
		kenar2 = input.nextInt();

		System.out.println("3. kenari girin.");
		kenar3 = input.nextInt();

		if(kenar1 == kenar2 && kenar1==kenar3)
		{
			System.out.println("Bu bir eskenar.");
		}
		else if( (kenar1 == kenar2 && kenar1 != kenar3) || (kenar1 == kenar3 && kenar1 != kenar2) || (kenar2 == kenar3 && kenar2 != kenar1)) {
			System.out.println("Bu bir ikizkenar.");
		}
		else {
			System.out.println("Bu bir cesitkenar.");
		}

	}

}
/*klavyeden 3 kenarı girilne üçgenin eşkenar, ikizkenar veya çeşitkenar olduğunu söyleyen programın algoritma
akış diyagramı ve java kodu
 *
 * 1. Başla
 * 2. Yaz "3 kenar değeri girin ki size bunun nekenar olduğunu söyleyeyim.".
 * 3. Oku kenar1, kenar2, kenar3
 * 4. Eger kenar1==kenar2 ve kenar1==kenar3
 * 4.1 Yaz "Bu bir eşkenar.".
 * 5. Eger (kenar1==kenar2 ve kenar1!=kenar3)  veya (kenar1==kenar3 ve kenar1!=kenar2) veya (kenar2==kenar3 ve kenar2!=kenar1)
 * 5.1 Yaz "Bu bir ikizkenar.".
 * 6. Hiçbiri değilse
 * 6.1 Yaz "Bu bir çeşitkenar.".
 * 7. Bitir.
 */