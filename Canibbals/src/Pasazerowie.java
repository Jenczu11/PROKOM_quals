

public abstract class Pasazerowie implements Comparable<Pasazerowie> {
	@Override
	public int compareTo(Pasazerowie o) {
		if(this.getClass().getName()==o.getClass().getName())
		{
			if(this instanceof Kanibal)
			{
				Kanibal k1=(Kanibal) this;
				Kanibal k2=(Kanibal) o;
				
				return Integer.compare(k2.getLiczbaZjedzonychMisjonarzy(), k1.getLiczbaZjedzonychMisjonarzy());
			}
			else
			{
				Misjonarz k1=(Misjonarz) this;
				Misjonarz k2=(Misjonarz) o;
				
				return Integer.compare(k2.getLiczbaNawroconych(), k1.getLiczbaNawroconych());
			}
		}
		else
			return o.getClass().getName().compareTo(this.getClass().getName());
	
	}
}
