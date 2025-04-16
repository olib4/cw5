import java.util.ArrayList;

public class SystemRezerwacji {
    private ArrayList<Wydarzenie> wydarzenia = new ArrayList<>();
    private ArrayList<Klient> klienci = new ArrayList<>();

    public void dodajWydarzenie(Wydarzenie wydarzenie) {
        wydarzenia.add(wydarzenie);
    }

    public void dodajWydarzenie(String nazwa, double cena) {
        wydarzenia.add(new Wydarzenie(nazwa, cena));
    }

    public void dodajKlienta(Klient klient) {
        klienci.add(klient);
    }

    public void dodajKlienta(String imie, String nazwisko, String email) {
        klienci.add(new Klient(imie, nazwisko, email));
    }

    public void dokonajRezerwacji(Klient klient, Wydarzenie wydarzenie) {
        klient.dodajRezerwacje(wydarzenie);
        wydarzenie.zarezerwujMiejsce();
    }

    public Wydarzenie znajdzWydarzenie(String nazwa) {
        for (Wydarzenie w : wydarzenia) {
            if (w.getNazwa().equals(nazwa)) return w;
        }
        return null;
    }

    public Klient znajdzKlienta(String nazwisko) {
        for (Klient k : klienci) {
            if (k.getNazwisko().equals(nazwisko)) return k;
        }
        return null;
    }

    public void zmienCeneWydarzenia(String nazwa, double nowaCena) {
        Wydarzenie w = znajdzWydarzenie(nazwa);
        if (w != null) {
            w.setCena(nowaCena);
        }
    }
}
