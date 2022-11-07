//1.

import java.util.Scanner;

public class JavaÖdev {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int tabanU, yukseklik, alan;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Üçgenin taban uzunluğunu girin: ");
        tabanU = input.nextInt();
        System.out.println("Üçgenin yüksekliğini girin: ");
        yukseklik = input.nextInt();
        
        alan = (yukseklik * tabanU) / 2;
        System.out.println(alan);
    }
    
}
//Üçgenin alanını veren program.
//1. Yaz "Üçgenin taban uzunluğunu girin: "
//2. Oku tabanU
//3. Yaz "Üçgenin yüksekliğini girin: "
//4. Oku yukseklik
//5. alan = (yukseklik * tabanU) / 2
//6. Yazdır alan
//7. Dur
