import java.util.Scanner;

public class Carpma {

	public static void main(String[] args) {
		int deger1, deger2;
		int toplam = 0;

		Scanner input = new Scanner(System.in);

		System.out.println("Ilk degeri gir.");
		deger1 = input.nextInt();
		System.out.println("Ikinci degeri gir.");
		deger2 = input.nextInt();

		for (int i = 1; i <= deger2; i++) {
			toplam += deger1;
		}
		System.out.println(deger1 + " * " + deger2 + " = " + toplam);

	}

}
/*
 * klavyeden girilen 2 pozitif tam sayıyı, çarpma operatörü kullanmadan çarpan
 * program.
 * 
 * 1. Başla 2. Oku deger1 ve deger2. 3. toplam = 0. 4. i = 1. 5. toplam +=
 * deger1 6. i++. 7. Eğer deger2<=i ise 4'e git. 8. Yazdir "deger1 + " *
 * " + deger2 + " = " + toplam.
 */