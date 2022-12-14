import java.util.Iterator;
import java.util.Scanner;

public class Dizi_Ortalamalari_Hesaplayan {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double num, n, ar = 0, geo = 1, har = 0, kohar = 0, koharPayda = 0;
		
		
		System.out.println("A dizisi kac elemanli olsun?");
		n = input.nextDouble();
		
		double[] A = new double[(int) n];
		
		for (int i = 0; i <n ; i++) {
			System.out.println("A dizisinin " + (i + 1) + ". degerini gir.");
			num = input.nextInt();
			A[i] = num;
		}
		
		
		for (int i = 0; i < n; i++) {
			ar += A[i];
		}
		ar /= n;
		
		for (int i = 0; i < n; i++) {
			geo *= A[i];
		}
		geo = Math.pow(geo, 1 / n);
		
		for (int i = 0; i < n; i++) {
			har+= 1 / A[i];
		}
		har = n / har;
		
		for (int i = 0; i < n; i++) {
			kohar += Math.pow(A[i], 2);
		}
		for (int i = 0; i < n; i++) {
			koharPayda += A[i];
		}
		kohar/= koharPayda;
		
		
		System.out.println("A dizisinin\nAritmetik Ortalamasi: " + ar + "\nGeometrik ortalamasi: " + geo + "\nHarmonik Ortalamasi: " + har + "\nKontraharmonik ortalamasi: " + kohar );
		
	}

}
// Klavyeden girilen n elemanlı A dizisinin aritmetik, geometrik, harmonik, 
// kontraharmonik ortalamasını hesaplayan program.
