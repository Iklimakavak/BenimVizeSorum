package benimSinavSorum;
import java.util.Scanner;

public class BenimSinavSorum {

	  public static void main(String[] args) {
		 menuGoster();
		 Scanner scan = new Scanner(System.in);
		 int kontrol = scan.nextInt();
		 if(kontrol == 1) {
		     System.out.println("A deđerini giriniz: ");
			 int a = scan.nextInt();
			 System.out.println("B deđerini giriniz: ");
			 int b = scan.nextInt();
			 KokKontrolEt kok = new KokKontrolEt(a, b);
		     System.out.println(kok);
		 }
		 else if(kontrol == 2) {
			 System.out.print("A deđerini giriniz: ");
			 int a = scan.nextInt();
			 System.out.print("B deđerini giriniz: ");
			 int b = scan.nextInt();
			 System.out.print("C deđerini giriniz: ");
			 int c = scan.nextInt();
			 KokKontrolEt kok = new KokKontrolEt(a, b,c);
		     System.out.println(kok);
		 }
		 else {
		        System.out.println("Hatalý giriţ yapýldý");

		 }
		  

	    }
	    private static void menuGoster(){
	        System.out.println("1. ve 2. dereceden denklem çözümü yapabilirsiniz");
	        System.out.println("Örnek kök deđerleri 6 8 2");
	        KokKontrolEt kok = new KokKontrolEt(6, 8 ,2);
		    System.out.println(kok);
	        System.out.println("Denklem derecenizi seçiniz: (1 veya 2)");
	    }

}
