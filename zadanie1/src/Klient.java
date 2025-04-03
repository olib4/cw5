import java.util.ArrayList;

public class Klient {

        private String imie;
        private String nazwisko;
        private String email;
        private ArrayList<Wydarzenie> listaRezerwacji;

        public Klient(String imie, String nazwisko, String email) {
            this.imie = imie;
            this.nazwisko = nazwisko;
            this.email = email;
            this.listaRezerwacji = new ArrayList<>();
        }


    }

