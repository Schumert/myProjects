import java.util.Scanner;

public class Blackjack {

	public static void main(String[] args) {
		int randomSayi;
		int toplamRandomSayi = 0;
		String cevapStart;
		String cevapGive;
		String cevapTry;
		int firstPlayer = 0;
		int secondPlayer = 0;
		int sayac = 0;

		try (Scanner input = new Scanner(System.in)) {
			while (true) { // Restart or Quit

				System.out.println(
						"'start' yazarak 0-11 arasi sayi al. Bir daha alirsan ustune toplanir, amac 21'i gecmeden en yuksek skoru yapmak. ");
				cevapStart = input.nextLine();
				cevapStart = cevapStart.toLowerCase().trim();

				while (true) {

					if (cevapStart.equals("start")) {
						randomSayi = (int) (Math.random() * (12 - 1)) + 1;
						toplamRandomSayi = randomSayi + toplamRandomSayi;
						System.out.println("Sayi:" + randomSayi + " Toplam Sayi:" + toplamRandomSayi);

						if (toplamRandomSayi > 21) {
							break;

						} else if (toplamRandomSayi == 21) {
							break;

						}

						System.out.println("'give': devam, 'stay': kal");
						cevapGive = input.nextLine();
						cevapGive = cevapGive.toLowerCase().trim();

						if (cevapGive.equals("stay")) {
							break;

						} else if (cevapGive.equals("give")) {
							continue;
						} else {
							toplamRandomSayi = 0;
							break;
						}

					} else {
						toplamRandomSayi = 0;
						break;
					}

				} // Ana while döngüsü bitiş
				if (toplamRandomSayi > 21) {

					System.out.println("Busted: Skorunuz: " + toplamRandomSayi);

				} else if (toplamRandomSayi == 21) {
					System.out.println("\nBlackjack!! Tebrikler.");
				} else {
					System.out.println("Skorunuz: " + toplamRandomSayi);
				}

				if (sayac == 1) {
					secondPlayer = toplamRandomSayi;
					sayac++;

				} else if (sayac == 0) {
					firstPlayer = toplamRandomSayi;
					sayac++;
				}

				toplamRandomSayi = 0;
				if (sayac == 2) {

					sayac = 0;
					if (firstPlayer > 21 && secondPlayer > 21) {
						System.out.println("Iki oyuncu da kazanamadi - 1. Oyuncu: " + firstPlayer + " - 2. Oyuncu: "
								+ secondPlayer);
					} else {
						if (firstPlayer > secondPlayer && firstPlayer <= 21) {
							System.out.println(
									"1. oyuncu kazandi. - 1. Oyuncu: " + firstPlayer + " - 2. Oyuncu: " + secondPlayer);
						} else if (secondPlayer > firstPlayer && secondPlayer <= 21) {
							System.out.println(
									"2. oyuncu kazandi. - 1. Oyuncu: " + firstPlayer + " - 2. Oyuncu: " + secondPlayer);
						} else if (firstPlayer > secondPlayer && firstPlayer > 21) { // ilk oyuncu busted ve ikinci
																						// oyuncu busted değil
							System.out.println(
									"2. oyuncu kazandi. - 1. Oyuncu: " + firstPlayer + " - 2. Oyuncu: " + secondPlayer);

						} else if (secondPlayer > firstPlayer && secondPlayer > 21) { // ikinci oyuncu busted ve ilk
																						// oyuncu busted değil
							System.out.println(
									"1. oyuncu kazandi. - 1. Oyuncu: " + firstPlayer + " - 2. Oyuncu: " + secondPlayer);
						} else if (firstPlayer == secondPlayer) {
							System.out
									.println("Berabere. - 1. Oyuncu: " + firstPlayer + " - 2. Oyuncu: " + secondPlayer);
						}
					}
					firstPlayer = 0;
					secondPlayer = 0;
					System.out.println("\n'Try Again': Tekrar Oyna, 'Quit': Bitir");
					cevapTry = input.nextLine();
					cevapTry = cevapTry.toLowerCase().replaceAll("\\s+", "");
					if (cevapTry.equals("tryagain")) {
						continue;

					} else if (cevapTry.equals("quit")) {
						break;
					}
				}

			} // While of restart-quit
		}

	}

}
