public abstract class Pojazd {
    private String nazwa;
    private int przebieg;
    public Pojazd(String nazwa){
        this.nazwa = nazwa;
        this.przebieg = 0;
    }
    void jedz(int km){
        this.przebieg = this.przebieg + km;
        System.out.println("Przejechano " + km + " km.");
        System.out.println("Aktualny przebieg " + this.przebieg);


    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getPrzebieg() {
        return przebieg;
    }

    public void setPrzebieg(int przebieg) {
        this.przebieg = przebieg;
    }

    abstract double kosztWypozyczenia(int minuty);

    void wyswietlPodsumowania(int minuty) {
        System.out.println(nazwa + " przebieg: " + przebieg + " koszt na " + minuty + "minut to " + kosztWypozyczenia(minuty));
    }

    public void podsumowanieWszystkichDla45Minut(int minuty){
        System.out.println("Koszt przejechania 45 minut pojazdem: " +
                 " wynosi: " + kosztWypozyczenia(minuty) + "PLN.");

    }
}
