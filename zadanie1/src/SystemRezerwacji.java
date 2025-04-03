import java.util.ArrayList;

public class SystemRezerwacji {


    private ArrayList<Wydarzenie> listaWydarzen;
    private ArrayList<Klient> listaKlientow;


    public SystemRezerwacji() {
        this.listaWydarzen = new ArrayList<>();
        this.listaKlientow = new ArrayList<>();
    }


    public void dodajWydarzenie(String nazwa, String data, String miejsce, double cena) {
        Wydarzenie noweWydarzenie = new Wydarzenie(nazwa, data, miejsce, cena);
        listaWydarzen.add(noweWydarzenie);
    }


    public void dodajKlienta(String imie, String nazwisko, String email) {
        Klient nowyKlient = new Klient(imie, nazwisko, email);
        listaKlientow.add(nowyKlient);
    }

}
