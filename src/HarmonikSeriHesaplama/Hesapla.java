package HarmonikSeriHesaplama;
import java.util.Scanner;

public class Hesapla {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("X Değerini Giriniz: ");
		int x = scan.nextInt();
		double result = 0;
		
		
		for(int i = 0; i <= x; i++) {
			result = result + (1.0 / i);
		}
		
		System.out.println(result);
		

	}

}
