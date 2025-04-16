public class Wydarzenie {
    private String nazwa;
    private String data;
    private String miejsce;
    private int maxLiczbaMiejsc = 100;
    private int dostepneMiejsca = 0;
    private double cena;


            public Wydarzenie(String nazwa, double cena) {
                this.nazwa = nazwa;
                this.cena = cena;
            }

            public Wydarzenie(String nazwa, double cena, String data) {
                this(nazwa, cena);
                this.data = data;
            }

            public Wydarzenie(String nazwa, double cena, String data, String miejsce) {
                this(nazwa, cena, data);
                this.miejsce = miejsce;
            }


    public String getNazwa() { return nazwa; }
    public String getData() { return data; }
    public String getMiejsce() { return miejsce; }
    public int getMaxLiczbaMiejsc() { return maxLiczbaMiejsc; }
    public int getDostepneMiejsca() { return dostepneMiejsca; }
    public double getCena() { return cena; }

    public void setCena(double cena) { this.cena = cena; }

    public void zarezerwujMiejsce() {
        if (dostepneMiejsca < maxLiczbaMiejsc) {
            dostepneMiejsca++;
        }
    }

    @Override
    public String toString() {
        return "Wydarzenie o nazwie: " + nazwa + ", dnia: " + data + ", miejsce: " + miejsce +
                ", cena: " + cena + ", dostepnosc miejsc: " + dostepneMiejsca +
                "/" + maxLiczbaMiejsc;
    }
}