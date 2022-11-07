import java.util.Scanner;

public class uzunlukDegistirme {

	public static void main(String[] args) {
		double sonuc = 0;
		double m;
		String birim;
		
		Scanner input = new Scanner(System.in);
		
	while(true) {
		
		System.out.println("Metre degeri girin.");
		m = input.nextDouble();
		
		System.out.println("Hangi birime donussun?. 'mm, cm, dm, km'");
        birim = input.next();
        
        if(birim.equals("mm")) {
        	sonuc = m * 1000;
        	System.out.println(sonuc + " mm");
        	break;
        }
        else if(birim.equals("cm")) {
        	sonuc = m * 100;
        	System.out.println(sonuc + " cm");
        	break;
        }
        else if(birim.equals("dm")) {
        	sonuc = m * 10;
        	System.out.println(sonuc + " dm");
        	break;
        }
        else if(birim.equals("km")) {
        	sonuc = m / 1000;
        	System.out.println(sonuc + " km");
        	break;
        }
        else {
        	continue;
        }
	}
	}

}

/* klavyeye m cinsinden girilen uzunlugu, seçilen birime dönüştüren program
 * 
 * 1. Başla.
 * 2. sonuc = 0.
 * 3. Yaz "Metre degeri girin."
 * 4. Oku metre.
 * 5. Yaz "Neye donusturelim.".
 * 6. Oku birim.
 * 7. Eger birim == mm
 * 8. sonuc = m * 1000.
 * 9. Yaz sonuc.
 * 10. Eger birim == cm
 * 11. sonuc = m * 100.
 * 12. Yaz sonuc.
 * 13. Eger birim == dm
 * 14. sonıc = m * 10.
 * 15. Yaz sonuc.
 * 16.  Eger birim == km
 * 17. sonuc = m / 1000.
 * 18. Yaz sonuc.
 * 19. Bitir. 
 *  
 *  
 *  
 *  
 */