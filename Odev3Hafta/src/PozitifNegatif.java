import java.util.Scanner;

public class PozitifNegatif {

	public static void main(String[] args) {
		int deger;

		Scanner input = new Scanner(System.in);

		deger = input.nextInt();
		if(deger>0) {
			print("Sayi pozitif");
		}
		else if(deger==0) {
			print("Sayi sifir");
		}
		else {
			print("Sayi negatif");
		}

	}
	static void print(String word) {
		System.out.println(word);
	}

}
/*klavyeden girilen bir tam sayının pozitif negatif veya sıfır olduğunu söyleyen programın algoritma akış diyagramı ve java kodu 
1. Başla
2. Yaz "Değer gir."
3. Oku deger.
4. Eğer deger>0
4.1 Yaz "Sayı pozitif."
5. Eğer deger==0
5.1 Yaz "Sayı sıfır."
6. Eğer deger<0
6.1 Yaz "Sayı negatif."
7. Bitir.
*/
