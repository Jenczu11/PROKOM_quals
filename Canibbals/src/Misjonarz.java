import java.util.Random;


public class Misjonarz extends Pasazerowie{
	private String imie;
	private Wyznanie wyznanie;
	private int liczbaNawroconych;
	public Misjonarz(String imie)
	{
		this.imie=imie;
		Wyznanie[] tab=Wyznanie.values();
		Random rnd=new Random();
		wyznanie=tab[rnd.nextInt(5)];
		liczbaNawroconych=rnd.nextInt(46);
	}
	@Override
	public String toString() {
		return "Misjonarz [imie=" + imie + ", wyznanie=" + wyznanie
				+ ", liczbaNawroconych=" + liczbaNawroconych + ", getImie()="
				+ getImie() + ", getWyznanie()=" + getWyznanie()
				+ ", getLiczbaNawroconych()=" + getLiczbaNawroconych()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	public String getImie() {
		return imie;
	}
	public void setImie(String imie) {
		this.imie = imie;
	}
	public Wyznanie getWyznanie() {
		return wyznanie;
	}
	public void setWyznanie(Wyznanie wyznanie) {
		this.wyznanie = wyznanie;
	}
	public int getLiczbaNawroconych() {
		return liczbaNawroconych;
	}
	public void setLiczbaNawroconych(int liczbaNawroconych) {
		this.liczbaNawroconych = liczbaNawroconych;
	
	}
}
