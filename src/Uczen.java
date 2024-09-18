public class Uczen extends Osoba{
    /*
    Uczen to klasa potomna
    Osoba to klasa bazowa
    Uczen dziedziczy wszystko? po klasie Osoba
    */
    private int nrEwidencyjny;

    public Uczen(String imie, String nazwisko, int wiek) {
        super(imie, nazwisko, wiek);//wywolujemy konstruktor klasy bazowej
    }

    public Uczen(String imie, String nazwisko, int wiek, int nrEwidencyjny) {
        super(imie, nazwisko, wiek);
        this.nrEwidencyjny = nrEwidencyjny;
    }

    @Override
    public String toString() {
        return "Uczen imie:"+getImie()+" nazwisko: "+nazwisko +
                "nrEwidencyjny=" + nrEwidencyjny +
                '}';
    }
}
