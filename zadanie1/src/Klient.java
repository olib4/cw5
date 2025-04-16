import java.util.ArrayList;

public class Klient {
    private String imie;
    private String nazwisko;
    private String email;
    private ArrayList<Wydarzenie> listaRezerwacji = new ArrayList<>();


    public Klient(String imie, String nazwisko, String email) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }



    public String getImie() { return imie; }
    public String getNazwisko() { return nazwisko; }

    public void dodajRezerwacje(Wydarzenie wydarzenie) {
        listaRezerwacji.add(wydarzenie);
    }

    public void anulujRezerwacje(Wydarzenie wydarzenie) {
        listaRezerwacji.remove(wydarzenie);
    }

    public void wyswietlRezerwacje() {
        for (Wydarzenie w : listaRezerwacji) {
            System.out.println(w);
        }
    }
}
