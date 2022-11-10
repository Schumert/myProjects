import java.util.Scanner;

public class AritmetikSayi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double sayiTop = 0, sayac = 0, sayi, sonuc;
		int sayiTam = 0;
		
		System.out.println("Bir sayi gir de aritmetik olup olmadigini soyleyem hele yav.");
		sayi = input.nextDouble();
		
		for (int i = 1; i <= sayi; i++) {
			if( (sayi % i) == 0 ) {
				sayiTop += i;
				sayac++;
			}
		}
		
		sonuc = sayiTop / sayac;
		sayiTam = (int)sonuc;
		if( (sonuc - sayiTam) == 0 ) {
			System.out.println("Aslan torunum bu yazdigin sayi bir aritmetik sayidir.");
		}
		else {
			System.out.println("Maalesef a torunum bu bir aritmetik sayi degildir.");
		}
		
		
    input.close();
	}

}
/* Klavyeden girilen bir pozitif tamsayının "aritmetik sayı" olup olmadığını söyleyen program.
 * Bir pozitif tam sayının pozitif tam bölenlerinin ortalaması, yine tamsayı ise bunlara "aritmetik sayı" denir.
 * Örneğin 6 tamsayısı (1+2+3+6)/4=3 olduğundan aritmetik sayıdır. 1,3,5,6,7,11... aritmetik sayılardır.
 * 
 * Başla
 * Yaz "Bir sayi gir de aritmek olup olmadıgını söyleyem hele yav.".
 * Oku sayi.
 * sayiTop = 0, sayac = 0
 * i = 1.
 * Eger i<=sayi
 * Eger (sayi % i) == 0
 * sayiTop += i.
 * sayac++.
 * i++
 * Git
 * Eger(sayiTop / sayac == Tam(sayiTop / sayac) 
 * Yaz "Bu yazdigin sayi aritmetik bir sayidir.".
 * degilse Yaz "Maalesef ah yegenim bu bir aritmetik sayi degildir.".
 * Dur.
 * 
 * 
 * 
 */
