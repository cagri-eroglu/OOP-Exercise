package inheritance;

public class Asistan extends Akademisyen{
	private String yuksekLisans;

	public Asistan(String adSoyad, String eposta, String telefon, String bolum, String gorevler, String dersler,
			String yuksekLisans) {
		super(adSoyad, eposta, telefon, bolum, gorevler, dersler);
		this.yuksekLisans = yuksekLisans;
	}
	
	@Override
	public String giris()
	{
		return "Asistan" + super.giris();
	}
	public String getYuksekLisans() {
		return yuksekLisans;
	}

	public void setYuksekLisans(String yuksekLisans) {
		this.yuksekLisans = yuksekLisans;
	}

	@Override
	public void derseGir(int dersSaati) {
		System.out.println(getAdSoyad()+" "+getDersler()+"Dersine" +"sat:"+dersSaati+"Asistan olarak Girdi");
		
	}
	
	
}
