//6

import java.util.Scanner;
import java.lang.Math;
import java.text.NumberFormat;


public class kendimiz1 {

   
    public static void main(String[] args) {
       double ilkMusluk, ikinciMusluk, ucuncuMusluk, t;
       
       
       Scanner input = new Scanner(System.in);
       
       System.out.println("İlk musluk havuzu kaç saatte doldurur? ");
       ilkMusluk = input.nextDouble();
       
       System.out.println("İkinci musluk havuzu kaç saatte doldurur? ");
       ikinciMusluk = input.nextDouble();
       
       System.out.println("Üçüncü musluk havuzu kaç saatte doldurur? ");
       ucuncuMusluk = input.nextDouble();
       
       t = 1 / ((1/ilkMusluk) + (1/ikinciMusluk) + (1/ucuncuMusluk));
       
       System.out.println("Havuz " + t + " saatte dolar");
       
       
       
        
    }
    
}
// Muslukların doldurma süresine göre havuzun kaç saatte dolacığını söyleyen program.
// 1. Yaz "İlk musluk havuzu kaç saatte doldurur".
// 2. Oku ilkMusluk.
// 3. Yaz "İkinci musluk havuzu kaç saatte doldurur".
// 4. Oku ikinciMusluk.
// 5. Yaz "Üçüncü musluk havuzu kaç saatte doldurur".
// 6. Oku ucuncuMusluk.
// 7. t = 1 / ((1/ilkMusluk) + (1/ikinciMusluk) - (1/ucuncuMusluk)).
// 8. Yazdır t.
// 9. dur.

