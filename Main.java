
public class Main {

	public static void main(String[] args) {
		Contribuabil contribuabil = new Contribuabil("Ghita Marcel", "1234567890123");

   
        contribuabil.adaugaProprietate(new Cladire(new Adresa("E Mario", 332), 65));
        contribuabil.adaugaProprietate(new Teren(new Adresa("I Marcel", 45), 6, 5));
        contribuabil.adaugaProprietate(new Cladire(new Adresa("Lunca", 14), 10));

        contribuabil.genereazaFluturas();
    }


	

}
