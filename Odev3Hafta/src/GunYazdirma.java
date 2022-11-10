import java.util.Scanner;

public class GunYazdirma {

	public static void main(String[] args) {
		int deger;

		Scanner input = new Scanner(System.in);

		System.out.println("1'den 7'ye kadar deger girin.");
		deger = input.nextInt();
		switch (deger) {
		  case 1:
			  System.out.println("Pazartesi");
			  break;
		  case 2:
			  System.out.println("Sali");
			  break;
		  case 3:
			  System.out.println("Çarşamba");
			  break;
		  case 4:
			  System.out.println("Perşembe");
			  break;
		  case 5:
			  System.out.println("Cuma");
			  break;
		  case 6:
			  System.out.println("Cumartesi");
			  break;
		  case 7:
			  System.out.println("Pazar");
			  break;

		}

	}

}
/* 1 ve 7 arasında bir tam sayı girilecek, bu tam sayıya göre haftanın ilgili gününü yazdıran programın algoritma akış diyagramı ve 
java kodu
 * 
 * 1. Başla.
 * 2. Oku deger.
 * 3. Eger deger==1
 * 3.1. Yaz "pst".
 * 4. Eger deger==2
 * 4.1. Yaz "salı"
 * 5. Eger deger==3
 * 5.1. Yaz "çş".
 * 6. Eger deger==4
 * 6.1 Yaz "pş.".
 * 7 Eger deger==5
 * 7.1 Yaz "cuma".
 * 8. Eger deger==6
 * 8.1 Yaz "cmt.".
 * 9. Eger deger==7
 * 9.1. Yaz "pazar".
 * 10. Bitir.
 */
