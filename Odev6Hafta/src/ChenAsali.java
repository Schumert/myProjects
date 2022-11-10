import java.util.Scanner;

public class ChenAsali {

	public static void main(String[] args) {
	   Scanner input = new Scanner(System.in);
	   
	   int sayi, chen;
	   
	   System.out.println("Hayatinda hic durup dusundun mu hic 'Chen Asalini' nasil bulurum?\nHIC GEREK YOK!!! Ben bulurum.\nSadece sayini soyle.");
       sayi = input.nextInt();
       chen = sayi + 2;
       
       for (int i = 2; i < sayi; i++) {
		if( (sayi % i) == 0 ) {
			System.out.println("Girdigin sayi asal degil ki 'Chen Asali' olsun.");
			return;
		}
		
	}
       for (int i = 2; i < chen; i++) {
		if ( (chen % i) == 0 ) {
			System.out.println("'Chen Asali' degil bu ama neyseki girdigin sayi asal. Fiuh.");
			return;
		}
	}
       System.out.println("Yuppi! Girdigin sayi bir 'Chen Asali'.");
       
       input.close();
	}

}
/* Klavyeden girilen sayının "Chen Asalı" olup olmadığını test eden program.
 * Eger a asal sayısının 2 fazlası (a+2) da asal ise bu tür sayılar "Chen asalı" olarak adlandırılmaktadır. Örn. 3, 5, 11, 17, 29...
 * 
 * 1.Başla.
 * 2.Yaz "Sayi gir.".
 * 3.Oku sayi.
 * 4.chen = sayi + 2
 * 5.i = 2.
 * 6.Eger i<sayi
 * 6.1.Eger (sayi % i) == 0
 * 6.1.1.Yaz "Girdiginiz sayi asal degildir.".
 * 6.1.2.Dur.
 * 6.2.i++
 * 6.3.Git 6'ya
 * 7.i = 2.
 * 8.Eger i<chen.
 * 8.1. Eger(chen % i) == 0.
 * 8.1.1.Yaz "Girdiginiz sayi asaldir ama chen asali degildir.".
 * 8.1.2Dur.
 * 8.2.i++.
 * 8.3.Git 8'e.
 * 9.Yaz "Girdiginiz sayi chen asalidir.".
 * 10.Dur.
 * 
 * 
 */
