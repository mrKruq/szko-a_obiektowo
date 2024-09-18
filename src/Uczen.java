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
}
