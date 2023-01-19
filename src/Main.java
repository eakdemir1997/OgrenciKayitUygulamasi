import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int secim=-1;
		OgrListe bilBolum=new OgrListe();
		Scanner scanner=new Scanner(System.in);
		
		while(secim!=0) {
			System.out.println("Bilgisayar bolumu kayit uygulamasi");
			System.out.println("1 yeni kayit");
			System.out.println("2 kayit sil");
			System.out.println("3 kayitlari listele");
			System.out.println("4 en basarili ogrenci bilgileri");
			System.out.println("0 cikis yapin");
			System.out.println("seciminiz:");
			
			secim=scanner.nextInt();
			
			if(secim==1) {
				bilBolum.ekle();
			}
			else if(secim==2) {
				bilBolum.sil();
			}
			else if(secim==3) {
				bilBolum.yazdir();
			}
			else if(secim==4) {
				bilBolum.enBasariliOgrenci();
			}
			else if(secim==0) {
				System.out.println("Program sonlaniyor");
				break;
			}
			else {
				System.out.println("Hatali secim yaptiniz");
			}
		}
		
		

	}

}
