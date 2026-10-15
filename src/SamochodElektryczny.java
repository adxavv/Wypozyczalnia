public class SamochodElektryczny extends PojazdElektryczny {

    public SamochodElektryczny(String nazwa){
        super(nazwa, 1);

    }

    @Override
    double kosztWypozyczenia(int minuty) {
        if(minuty<=15){
            return 15;
        }
        else{
            return minuty*1.5;
        }
    }






}
