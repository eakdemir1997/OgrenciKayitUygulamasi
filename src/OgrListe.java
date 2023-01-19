import java.util.Scanner;

public class OgrListe {

	OgrNode head=null;
	OgrNode tail=null;
	OgrNode temp=null;
	OgrNode temp2=null;
	
	int numara;
	String ad;
	String soyad;
	int vize;
	int fin; //final notu
	double ortalama;
	String durum;
	
	Scanner scanner=new Scanner(System.in);
	
	void ekle() {

		System.out.println("Bilgisayar bolumune kayit olacak ogrenci bilgilerini girin:");
		
		System.out.println("numara:"); numara=scanner.nextInt();
		scanner.nextLine();
		System.out.println("ad:");     ad=scanner.nextLine();
		System.out.println("soyad:");  soyad=scanner.nextLine();
		System.out.println("vize:");   vize=scanner.nextInt();
		System.out.println("final:");  fin=scanner.nextInt();
		
		OgrNode eleman=new OgrNode(numara, ad, soyad, vize, fin);
		
		if(head==null) {
			head=eleman;
			tail=eleman;
			System.out.println("Bilgisayar bolumune kayit olacak ogrencilerin "
					+ "liste yapisi olustu ve ilk eleman eklendi");
		}
		else {
			eleman.next=head;
			head=eleman;
			System.out.println(numara+" numarali ogrenci eklendi");
		}
		
	}
	
	void sil() {
		if(head==null) {
			System.out.println("Liste bos.Silinecek ogrenci yok");
		}
		else {
			System.out.println("Silinecek ogrencinin numarasini girin:");
			numara=scanner.nextInt();
			
			if(numara == head.numara && head.next==null) { //listede tek öğrenci varsa
				head=null;
				tail=null;
				System.out.println(numara+" numarali ogrenci silindi.Listede kayitli ogrenci kalmadi");
			}
			else if(numara == head.numara && head.next!=null) { //listede birden çok eleman var ve ilk öğrenci silinecek
				head=head.next;
				System.out.println(numara+" numarali ogrenci silindi");
			}
			else {
				temp=head;
				temp2=head;
				while(temp.next != null) {
					
					if(numara==temp.numara) {
						temp2.next=temp.next;
						System.out.println(numara+" numarali ogrenci silindi");
					}
					temp2=temp;
					temp=temp.next;
				}
				if(numara==temp.numara) { //son eleman siliniyor
					temp2.next=null;
					tail=temp2;
					System.out.println(numara+" numarali ogrenci silindi");
				}
			}
		}
	}

	void yazdir() {
		if(head==null) {
			System.out.println("Liste bos");
		}
		else {
			temp=head;
			while(temp!=null) {
				System.out.println(temp.numara+" numarali ogrenci bilgileri:");
				System.out.println("ad     :"+temp.ad);
				System.out.println("soyad  :"+temp.soyad);
				System.out.println("vize   :"+temp.vize);
				System.out.println("final  :"+temp.fin);
				System.out.println("ortalama:"+temp.ortalama);
				System.out.println("durum  :"+temp.durum);
				
				temp=temp.next;
			}
		}
	}
	
	void enBasariliOgrenci() {
		if(head==null) {
			System.out.println("Liste bos");
		}
		else {
			temp=head;
			double max=temp.ortalama;
			while(temp!=null) {
				temp=temp.next;
				if(temp.ortalama>max) {
					max=temp.ortalama;
					
					numara=temp.numara;
					ad=temp.ad;
					soyad=temp.soyad;
					vize=temp.vize;
					fin=temp.fin;
					ortalama=temp.ortalama;
					durum=temp.durum;
				}
			}
			System.out.println("*** EN BASARILI OGRENCI ***");
			System.out.println(temp.numara+" numarali ogrenci bilgileri:");
			System.out.println("ad     :"+ad);
			System.out.println("soyad  :"+soyad);
			System.out.println("vize   :"+vize);
			System.out.println("final  :"+fin);
			System.out.println("ortalama:"+ortalama);
			System.out.println("durum  :"+durum);
		}
	}
}
