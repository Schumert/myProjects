import java.util.Scanner;

public class Dizi_Polinom {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n, b, katsayi = 0, poly = 0;
		
		System.out.println("Polinomun derecesini soyle.");
		n = input.nextInt();
		System.out.println("X degerini gir.");
		b = input.nextInt();
		
		int[] derece = new int[n+1];
		
		
		System.out.println("x^0'in katsayisindan baslayarak " + (n+1) + " kadar katsayi girin.");
		for (int i = 0; i < n+1 ; i++) {
			System.out.println("Katsayi gir.");
			katsayi = input.nextInt();
			derece[i] = katsayi; 
			
		}
		for (int i = 0; i < n + 1; i++) {
			poly += derece[i] * Math.pow(b, i);
		}
		System.out.println("X = " + b + " icin cevap: " + poly);
		
		

	}

}
//Katsayilari klavyeden girilen n. dereceden polinomun  x = b için degerini hesaplayan program.
