public class Cladire extends Proprietate {
    private int suprafata;

    public Cladire(Adresa adresa, int suprafata) {
        super(adresa);
        this.suprafata = suprafata;
    }


    public double calculeazaCost() {
        return 500 * suprafata;
    }


    public void afiseaza() {
        System.out.println("Cladire: " + adresa);
        System.out.println("Suprafata: " + suprafata);
        System.out.println("Cost: " + calculeazaCost());
    }
}
