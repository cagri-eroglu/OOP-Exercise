package inheritance;

public class OgretimUyesi extends Akademisyen{
	String unvan;

	public OgretimUyesi(String adSoyad, String eposta, String telefon, String bolum, String gorevler, String dersler,
			String unvan) {
		super(adSoyad, eposta, telefon, bolum, gorevler, dersler);
		this.unvan = unvan;
	}
	
	
	public String getUnvan() {
		return unvan;
	}


	public void setUnvan(String unvan) {
		this.unvan = unvan;
	}


	public String giris()
	{
		return this.unvan + " " + super.giris();
	}
	@Override
	public void derseGir(int dersSaati) {
		System.out.println(getUnvan()+getAdSoyad()+" "+getDersler()+"saat : "+dersSaati+" Dersine Girdi");
		
	}
}
