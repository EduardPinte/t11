public abstract class Proprietate {
    protected Adresa adresa;

    public Proprietate(Adresa adresa) {
        this.adresa = adresa;
    }

    public abstract double calculeazaCost();
    public abstract void afiseaza();
}