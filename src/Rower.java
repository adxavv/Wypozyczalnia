public class Rower extends Pojazd {
    public Rower(String nazwa) {
        super(nazwa);
    }

    @Override
    double kosztWypozyczenia(int minuty) {
        if(minuty<=20){
            return 0;
        }
        else{
            return (minuty -20)*0.2;
        }
    }


}
