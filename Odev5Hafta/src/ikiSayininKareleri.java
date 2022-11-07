import java.util.Scanner;

public class ikiSayininKareleri {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        
		int sayi, a = 0, b = 0;
		boolean degerVarMi = false;
		
		System.out.println("Bir sayi gir.");
		sayi = input.nextInt();
		
		for (int i = 1; i <= Math.sqrt(sayi); i++) {
			for (int j = 1; j <= ( (j * j) + (i * i) ); j++) {
				if(sayi == ( (i * i) + (j * j) ) ) {
					System.out.println(i + " sayisinin karesi + " + j + " sayisinin karesi = " + sayi );
					degerVarMi = true;
				}
			}
		}
		if(degerVarMi == false) {
			System.out.println("Bu sayi iki sayinin kareleri toplami seklinde yazilamiyor, uzgunummmmm.");
		}
	}

}
