public class Main {
    public static void main(String[] args) {
        /*
        Osoba osobaJas = new Osoba("Jaś", "Kowalski", 12);
        System.out.println("Imie: " + osobaJas.getImie());
        osobaJas.setImie("Jan");
        System.out.println("Imie nowe: "+ osobaJas.getImie());
        Osoba osobaIsia = new Osoba("Isia","Isińska");
        Osoba osobaX = new Osoba();
        System.out.println(osobaIsia.getWiek());
        System.out.println(osobaX.getWiek());



        System.out.println(osobaIsia);

         */
        System.out.println("Liczba utworzonych obiektów: "+Uczen.liczbaObiektow);
        Uczen uczenEmil = new Uczen("Emil", "Smaladzki", 7, 123);
        System.out.println(uczenEmil);
        System.out.println("Liczba utworzonych obiektów: "+Uczen.liczbaObiektow);
        Uczen uczen2 =new Uczen("Szymon","Grajek",11);
        System.out.println("Liczba utworzonych obiektów: "+Uczen.liczbaObiektow);
        Uczen uczen3 =new Uczen("Asia","Menda",12);
        System.out.println("Liczba utworzonych obiektów: "+Uczen.liczbaObiektow);
        Uczen uczen4 =new Uczen("Lucjan","Wałek",13);
        System.out.println(uczen4);
        System.out.println("Liczba utworzonych obiektów: "+Uczen.liczbaObiektow);
        Nauczyciel nauczyciel = new Nauczyciel("Ryszard", "Drań",30, "fizyka");
        Klasa klasaProg = new Klasa("3x", nauczyciel);
        klasaProg.dodajUczniaDoKlasy(uczenEmil);
        klasaProg.dodajUczniaDoKlasy(uczen2);
        klasaProg.dodajUczniaDoKlasy(uczen2);
        klasaProg.dodajUczniaDoKlasy(uczen2);
        klasaProg.dodajUczniaDoKlasy(uczen3);
        klasaProg.dodajUczniaDoKlasy(uczen4);
        System.out.println(klasaProg);
        klasaProg.wypiszListeUczniow();

        Szkola zs10 = Szkola.getSzkola();

    }
}