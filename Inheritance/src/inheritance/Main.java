package inheritance;

public class Main {

	public static void main(String[] args) {
		
		//Akademisyen a = new Akademisyen("Ahmet","a@gmail.com","05328769876","Ceng","Hoca","Ceng101");
		//System.out.println(a.getAdSoyad());
		 
		OgretimUyesi o = new OgretimUyesi("Mehmet","m@gmail.com","0555345683","CENG","Hoca","CENG102","Do�ent");

		
		
		Memurlar m = new Memurlar("Veli","veli>gmail.com","054676454343","Bilgi �slem","Tam Zamanl�");
		
		//Calisan c = new Akademisyen("Ahmet","a@gmail.com","05328769876","Ceng","Hoca","Ceng101");
		//c.giris(); //akademisyeninikni �al��t�rd�. 
		//Calisan[] girisListesi = {a,o,m};		//polymorphism
		//Calisan.listele(girisListesi); 
		
		o.derseGir(10);
		

	}
}

