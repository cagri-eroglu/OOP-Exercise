package inheritance;

public abstract class Akademisyen extends Calisan { //Akademisyenden bir nesne üretmek istemiyorum çünkðü akadeiiseyen benim ara sýnýfým.
	String bolum,gorevler;
	String dersler;
	
	
	public Akademisyen(String adSoyad, String eposta, String telefon, String bolum, String gorevler, String dersler) {
		super(adSoyad, eposta, telefon); //üst sýnýfýn constructor'ýný çaðýran metod;
		this.bolum = bolum;
		this.gorevler = gorevler;
		this.dersler = dersler;
	}


	public abstract void derseGir(int dersSaati); //bunu soyutladýk çünkü alt sýnýflarýnda kullancaz asýl.
	// BU METOD ABSTRACT OLDUÐU ÝÇÝN ALT SINIFLAR BU METODU OVERRÝDE ETMEK ZORUNDALAR.

	
	public String giris()   //overriding
	{
		return super.giris()+"A kapýsýndan";
	}

	public String getBolum() {
		return bolum;
	}


	public String getGorevler() {
		return gorevler;
	}


	public String getDersler() {
		return dersler;
	}


	public void setBolum(String bolum) {
		this.bolum = bolum;
	}


	public void setGorevler(String gorevler) {
		this.gorevler = gorevler;
	}


	public void setDersler(String dersler) {
		this.dersler = dersler;
	}
	
}
