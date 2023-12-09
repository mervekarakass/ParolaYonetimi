package parolaYonetimi;

import java.util.Scanner;

public class ParolaYonetimi {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String dogruParola = "parola123";
		
		System.out.print("Parolanizi giriniz");
		String girilenParola = scanner.nextLine();
		
		if (girilenParola.equals(dogruParola)) {
			System.out.println("Giris Basarili");
		} else {
			System.out.println("Yanlis sifre girdiniz. Sifrenizi sifirlamak ister misiniz?");
			String parolaSifirlamaSorusu = scanner.nextLine();
			if (parolaSifirlamaSorusu.equalsIgnoreCase("E")) {
				parolaSifirla(scanner);
			
			} else {
				System.out.println("Program Sonlandirildi");
			}
			
		}

	}
	private static void parolaSifirla (Scanner scanner) {
		System.out.print("Yeni Parolanizi Giriniz: ");
		String yeniParola = scanner.nextLine();
		
		System.out.print("Eski Parolanizi Tekrar Giriniz: ");
		String eskiParola = scanner.nextLine();
		
		if (yeniParola.equals(eskiParola)) {
			System.out.println("Parola Olusturulamadi. Yeni Parolaniz Eskisiyle Ayni Olamaz");
		} else {
			System.out.println("Parola Olusturuldu");
		}
		
	}

}
