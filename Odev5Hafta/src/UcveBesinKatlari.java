import java.util.Scanner;

public class UcveBesinKatlari {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int sayi, a = 0, b = 0;
		boolean degerVarMi = false;
		sayi = input.nextInt();
		
		for (int i = 1; i <= (sayi/3) ; i++) {
			for (int j = 1; j <= (sayi / 5); j++) {
				if( sayi == (3 * i) + (5 * j) ) {
					System.out.println("3 * '" + i + "'" + " + " + " 5 * '" + j + "' = " + sayi + ", a = " + i + ", b = " + j );
					degerVarMi = true;
				}
			}
		}
		if(degerVarMi == false) {
			System.out.println("Karsilik gelen a ve b degeri yok. ");
	        }
		

	}

}
