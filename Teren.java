public class Teren extends Proprietate {
    private int suprafata;
    private int rang;

    public Teren(Adresa adresa, int suprafata, int rang) {
        super(adresa); 
        this.suprafata = suprafata;
        this.rang = rang;
    }

   
    public double calculeazaCost() {
        return 350.0 * suprafata / rang;
    }

    
    public void afiseaza() {
        System.out.println("Teren: " + adresa);
        System.out.println("Suprafata: " + suprafata + ", Rang: " + rang);
        System.out.println("Cost: " + calculeazaCost());
    }
}
