import java.util.Scanner;
import java.text.NumberFormat;
import java.lang.Math;
import java.util.Locale;

public class Mortgage {

	public static void main(String[] args) {
		final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        
        int principal = 0;
        float annualInterest = 0;
        byte years = 0;
        
        Scanner scanner = new Scanner(System.in);       
        
        while(true)
        {
        System.out.print("Alinan Para (1K - 1M): ");
          principal = scanner.nextInt();
            if (principal >= 1000 && principal <= 1000000)
            {
                break;
                
            }
            System.out.println("1.000 ile 1.000.000 arasi deger gir.");
        }
        
        while(true)
        {
        System.out.print("Yillik Faiz Orani: ");
        annualInterest = scanner.nextFloat();
        if(annualInterest>=1 && annualInterest<=30)
        {           
           break;
        }
        System.out.println("1 ile 30 arasi deger gir.");
        }
        float monthlyInterest = annualInterest / MONTHS_IN_YEAR / PERCENT;
        
        while(true)
        {
        System.out.println("Kac yil surecek: ");
        years = scanner.nextByte();
            if (years>=1 && years<=30) {
            break;
            }
            System.out.println("1 ile 30 arasi deger gir.");
        }
        int numberOfPayments = years * 12;  
               
        double mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments)) 
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
        
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Ipotek: " + mortgageFormatted);

	}

}
