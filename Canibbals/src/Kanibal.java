import java.util.Random;


public class Kanibal extends Pasazerowie{
	private String imie;
	private int liczbaZjedzonychMisjonarzy;
	
	public Kanibal(String imie)
	{
		this.imie=imie;
		Random rnd=new Random();
		liczbaZjedzonychMisjonarzy=rnd.nextInt(121)+10;
	}

	@Override
	public String toString() {
		return "Kanibal [imie=" + imie + ", liczbaZjedzonychMisjonarzy="
				+ liczbaZjedzonychMisjonarzy + ", getImie()=" + getImie()
				+ ", getLiczbaZjedzonychMisjonarzy()="
				+ getLiczbaZjedzonychMisjonarzy() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public int getLiczbaZjedzonychMisjonarzy() {
		return liczbaZjedzonychMisjonarzy;
	}

	public void setLiczbaZjedzonychMisjonarzy(int liczbaZjedzonychMisjonarzy) {
		this.liczbaZjedzonychMisjonarzy = liczbaZjedzonychMisjonarzy;
	}
}
