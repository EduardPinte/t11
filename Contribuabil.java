import java.util.ArrayList;
import java.util.List;

public class Contribuabil {
    private String nume;
    private String cnp;
    private List<Proprietate> proprietati = new ArrayList<>();

    public Contribuabil(String nume, String cnp) {
        this.nume = nume;
        this.cnp = cnp;
    }

    public void adaugaProprietate(Proprietate p) {
        proprietati.add(p);
    }

    public void genereazaFluturas() {
        System.out.println("Contribuabil: " + nume);
        System.out.println("Proprietati:");
        double sumaTotala = 0;
        for (int i = 0; i < proprietati.size(); i++) {
            Proprietate p = proprietati.get(i);
            p.afiseaza();
            sumaTotala += p.calculeazaCost();
        }

        System.out.println("Suma totala: " + sumaTotala);
    }
}
