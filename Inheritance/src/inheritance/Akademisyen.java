package inheritance;

public abstract class Akademisyen extends Calisan { //Akademisyenden bir nesne �retmek istemiyorum ��nk�� akadeiiseyen benim ara s�n�f�m.
	String bolum,gorevler;
	String dersler;
	
	
	public Akademisyen(String adSoyad, String eposta, String telefon, String bolum, String gorevler, String dersler) {
		super(adSoyad, eposta, telefon); //�st s�n�f�n constructor'�n� �a��ran metod;
		this.bolum = bolum;
		this.gorevler = gorevler;
		this.dersler = dersler;
	}


	public abstract void derseGir(int dersSaati); //bunu soyutlad�k ��nk� alt s�n�flar�nda kullancaz as�l.
	// BU METOD ABSTRACT OLDU�U ���N ALT SINIFLAR BU METODU OVERR�DE ETMEK ZORUNDALAR.

	
	public String giris()   //overriding
	{
		return super.giris()+"A kap�s�ndan";
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
