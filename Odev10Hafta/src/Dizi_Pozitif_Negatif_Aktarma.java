import java.util.Scanner;

public class Dizi_Pozitif_Negatif_Aktarma {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n, num, bArray = 0, cArray=0;
		
		System.out.println("A dizisi kac elemanli olsun?");
		n = input.nextInt();
		int[] A = new int[n];
		int[] B = new int[n];
		int[] C = new int[n];
		
		for (int i = 0; i <n ; i++) {
			System.out.println("A dizisinin " + (i + 1) + ". degerini gir.");
			num = input.nextInt();
			A[i] = num;
		}
		
		for (int i = 0; i < n; i++) {
			if(A[i] == 0) {
				continue;
			}
			else if(A[i] < 0) {
				C[cArray] = A[i];
				System.out.println("C dizisinin " + (cArray + 1) + ". elemani: " + C[cArray]);
				cArray++;
			}
			else {
				B[bArray] = A[i];
				System.out.println("B dizisinin " + (bArray + 1) + ". elemani: " + B[bArray]);
				bArray++;
			}
		}
	}

}
//Klavyeden girilen N elemanli bir A dizisindeki pozitif elemanlari B dizisine ve negatif elemanlari da 
// C dizisine yerleştiren program.