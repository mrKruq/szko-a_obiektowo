import java.util.ArrayList;

public class Klasa {
    private String numerKlasy;
    private ArrayList<Uczen> uczniowie;
    private Nauczyciel wychowawca;

    public Klasa(String numerKlasy, Nauczyciel wychowawca) {
        this.numerKlasy = numerKlasy;
        this.wychowawca = wychowawca;
        uczniowie = new ArrayList<>();
    }
    public void dodajUczniaDoKlasy(Uczen uczen){
        if (uczniowie.contains(uczen)){
            System.out.println(uczen + "uczeń jest dodany");
        }
        else {
            uczniowie.add(uczen);
        }
    }
    /* jeszcze nie dziala
    public void usunUczniaZKlasy(Uczen uczen){
        if(uczniowie.contains(uczen)){
            uczniowie.remove(uczen);
        }
        else{
            System.out.println("Uczen jest w starej klasie");
        }
       }
     */

    public void wypiszListeUczniow(){
        for (int i = 0; i < uczniowie.size(); i++) {
            System.out.println(i+" "+uczniowie.get(i).getImie()+" "+uczniowie.get(i).getNazwisko());
        }
    }


    @Override
    public String toString() {
        return "Klasa{" +
                "numerKlasy='" + numerKlasy + '\'' +
                ", uczniowie=" + uczniowie +
                ", wychowawca=" + wychowawca +
                '}';
    }
}
