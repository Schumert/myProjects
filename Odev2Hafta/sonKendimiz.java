//8

import java.util.Scanner;
import java.util.Random;


public class sonKendimiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int randomSayi;
        int toplamRandomSayi = 0;
        Boolean cevap;
        
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        
        
        
        
        
        System.out.println("'true' yazarak 0-11 arası sayı al. Bir daha alırsan üstüne toplanır, amaç 21'i geçmeden en yüksek skoru yapmak. ");
        cevap = input.nextBoolean();  
        
        while(true)
        {
        
         
        
        if (cevap == true) {
            randomSayi = (int) (Math.random() * (12 - 1)) +1; 
            toplamRandomSayi = randomSayi + toplamRandomSayi;
            System.out.println("Sayı:" + randomSayi +  " Toplam Sayı:" + toplamRandomSayi);
            if (toplamRandomSayi > 21) {
                break;
                
            }
            else if (toplamRandomSayi == 21) {
                break;
                
            }
            System.out.println("'true': devam, 'false': kal");
            cevap = input.nextBoolean();
            
            if (cevap == false) {
                break;
                
            }
            else if(cevap == true)
            {
                continue;
            }
            
        }
        else {
            break;  
        }
        
        
        }
        if (toplamRandomSayi > 21) {
            
            System.out.println("Kazanamadınız. Skorunuz: " + toplamRandomSayi);
            
        }
        else if (toplamRandomSayi == 21) {
            System.out.println("Blackjack!! Tebrikler.");
        }       
        else{
            System.out.println("Skorunuz: " + toplamRandomSayi);
        }
        
        toplamRandomSayi = 0;
        
    }
    
    
}
//21'ü geçmeden en yüksek skoru yapma oyunu.
//1. toplamRandomSayi = 0;
//2. Yaz "'true' yazarak 0-11 arası sayı al. Bir daha alırsan üstüne toplanır, amaç 21'ü geçmeden en yüksek skoru yapmak. ".
//3. Oku cevap.
//4. Döngü
//5. Eğer cevap == true, değilse döngüden çık.
//5.1 0-100 arası sayı tut
//5.2 toplamRandomSayi = toplamSayi + toplamRandomSayi.
//5.3 Yazdır toplamRandomSayi.
//5.3 Eğer toplamRandomSayi > 100
//5.3.1 Döngüden çık.
//5.4 Yazdır "'true': devam, 'false': kal".
//5.5 Oku cevap.
//5.6 Eğer cevap == true, değilse döngüden çık.
//5.6.1 4'e git.
//Döngü sonrası
//6. Eğer toplamRandomSayi>100
//6.1 Yaz "Kazanamadınız" ve toplamRandomSayi
//7. Eğer toplamRandomSayi<100
//7.1 Yazdır toplamRandomSayi
//8. toplamRandomSayi = 0
//9. Dur

