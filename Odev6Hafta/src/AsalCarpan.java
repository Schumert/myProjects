import java.util.Scanner;

public class AsalCarpan {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int sayi, check = 2;
		
		System.out.println("Girilen sayinin asal carpanlarini bulmaliyim! Cabuk sayi gir.");
		sayi = input.nextInt();
		int sonuc = sayi; //sayi değeri değişeceğinden yeni bir değişkene atadım ki yazdırabileyim.
		
		while(check<=sayi) {
			if( (sayi % check) == 0 && check < sayi ) {
				System.out.print(check + " * ");
				sayi = sayi / check;
			}
			else if( (sayi % check) == 0 && check == sayi  ) {  
				System.out.print(check + " = " + sonuc );
				sayi = sayi / check;
			}
			else {
				check++;
			}
			
		}
		
		
		input.close();
	}

}
/* Klavyeden girilen 1'den büyük tamsayının asal-çarpanlarını bulan program
 * 
 * 1.Başla
 * 2.check = 2.
 * 3.Yaz "Sayi gir."
 * 4.Oku sayi.
 * 5.Eger check <= sayi ise
 * 5.1.Eger (sayi % check) == 0, degilse check++
 * 5.1.1.Yaz check
 * 5.1.2 sayi = sayi / check.
 * 5.2 5'e git.
 * 
 */
