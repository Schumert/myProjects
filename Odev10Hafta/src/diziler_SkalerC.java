import java.util.Scanner;

public class diziler_SkalerC {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n, num, result = 0;
		
		System.out.println("A ve B dizisi kac elemanli olsun?");
		n = input.nextInt();
		
		int[] A = new int[n];
		int[] B = new int[n];
		
		for (int i = 0; i <n ; i++) {
			System.out.println("A dizisinin " + (i + 1) + ". degerini gir.");
			num = input.nextInt();
			A[i] = num;
		}
		for (int i = 0; i <n ; i++) {
			System.out.println("B dizisinin " + (i + 1) + ". degerini gir.");
			num = input.nextInt();
			B[i] = num;
		}
		for (int i = 0; i < n; i++) {
			result += A[i] * B[i];
		}
		
		System.out.println("A . B = " + result);
		

	}

}
//Klavyeden girilen N elemanlı A ve B dizilerinin skaler çarpımını hesaplayna program
