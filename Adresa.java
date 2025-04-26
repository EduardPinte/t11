
public class Adresa {
	private String strada;
	private int numar;
	
	public Adresa(String strada, int numar) {
		super();
		this.strada = strada;
		this.numar = numar;
	}
	
	public  String toString() {
		return strada+ "nr:" + numar;
	}

		
}
