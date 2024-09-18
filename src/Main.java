public class Main {
    public static void main(String[] args) {
        Osoba osobaJas = new Osoba("Jaś", "Kowalski", 12);
        System.out.println("Imie: " + osobaJas.imie);
        osobaJas.imie = "Jan";
        System.out.println("Imie nowe: "+ osobaJas.imie);

    }
}