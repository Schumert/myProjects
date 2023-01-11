import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Methodlar {
	
 static int row = 5;
 static int column = 5;
 
	public static void main(String[] args) throws InterruptedException {
		Scanner input = new Scanner(System.in);
		System.out.println("Karelerin toplami: " + KarelerToplami());
		
		System.out.println("Girilen sayi asal mi?: " + AsalMi());

		int[] arrayOne = { 9, 6, 7, 5, 1 };
		System.out.println("\nDizi:" + Arrays.toString(arrayOne));
		ArrayKucukBuyuk(arrayOne);
		System.out.println("Dizinin kucukten buyuge siralanisi:\n " + Arrays.toString(arrayOne));
		
		System.out.println("\nRastgele 2d dizi:\n" + Arrays.deepToString(Random2dArray(100, row, column)));
		
		int[][] arrayTwo = Random2dArray(100, row, column);
		int[][] arrayThree = Random2dArray(100, row, column);
		System.out.println("\nIlk dizi:\n" + Arrays.deepToString(arrayTwo));
		System.out.println("Ikinci dizi:\n" + Arrays.deepToString(arrayThree));
		System.out.println("Iki dizinin toplami:\n" + Arrays.deepToString(DiziToplami2d(arrayTwo, arrayThree)));
		
		YildizUcgen();

	}

	public static int KarelerToplami() {
		System.out.println("\nSayi gir. Girdigin sayiya kadar kareleri alip toplayacagim.");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int sonuc = 0;
		for (int i = 1; i <= n; i++) {
			sonuc += i * i;
		}
		return sonuc;
	}

	public static boolean AsalMi() {
		System.out.println("\nSayi gir asal mi degil mi bakayim.");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		boolean check = true;
		for (int i = 2; i < n; i++) {
			if ((n % i) == 0) {
				check = false;
				break;
			}
		}
		return check;
	}
   
	//kabarcık sıralama(bubble sort)
	public static void ArrayKucukBuyuk(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - i - 1; j++) { // array.lenght-i-1 'deki 1 dizi dışına çıkmasını
																// engelliyor.
				int temp = array[j];
				if (array[j] > array[j + 1]) {
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}

		}
	}
	//random2dDizi
	public static int[][] Random2dArray(int boundary, int row, int column) {
		int[][] array2d = new int[row][column];
		for (int i = 0; i < array2d.length; i++) {
			for (int j = 0; j < array2d[i].length; j++) {
				array2d[i][j] = (int) (Math.random() * (boundary + 1) + 0);
			}
		}
		return array2d;
		
		
	}
	public static int[][] DiziToplami2d(int[][] A, int[][] B) {
		int[][] C = new int[row][column];
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[i].length; j++) {
				C[i][j] = A[i][j] + B[i][j];
			}
		}
		return C;
	}
	public static void YildizUcgen() throws InterruptedException {
		System.out.println("\nGirdigin deger kadar yuksek ucgen cizecegim.");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < i; j++) {
				Thread.sleep(10);
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
/*
 * 1'den n'e kadar olan sayıların kareleri toplamını yazdıran metot. 
 * Girilen sayının asallığını kontrol edip yazdıran metot Bir diziyi küçükten büyüğe doğru sıralayıp döndüren metot. 
 * İki boyutlu bir diziyi 0 ve girilen üst sınır arası random değer atayıp döndüren metot .
 * İki boyutlu dizilerin toplamını bir dizi olarak döndüren metot. 
 * Dışarıdan alınan n değerine göre artarak giden yıldız üçgeni methodu.
 * 
 */
