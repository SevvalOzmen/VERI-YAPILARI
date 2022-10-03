import java.util.Scanner;

public class insertionSort {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Kac sayi girilecek: ");
		int n = input.nextInt();
		int [] dizi = new int [n];
		for (int girilecekdeger = 0; girilecekdeger < n; girilecekdeger++) {
			System.out.print("Sayi = ");dizi[girilecekdeger] = input.nextInt();
		}
		
		insertionSort(dizi , n);
		System.out.println("Siralama islemi tamamlandi.");
		for (int girilecekdeger = 0; girilecekdeger < n; girilecekdeger++) {
			System.out.print("  " + dizi[girilecekdeger]);
		}
	}
	
	public static void insertionSort(int[] dizi,int n) {
		for (int i = 1; i < n; i++) {
			for (int k = 1; k > 0; k--) {
				if(dizi[k] < dizi[k-1]) {
					int temp = dizi[k];
					dizi[k] = dizi[k-1];
					dizi[k-1] = temp;
				}
			}
		}
	}

}
