public class StacjaLadowania {

    void obsluz(PojazdElektryczny[] pojazdyDoLadowania){
        for(PojazdElektryczny pojazd : pojazdyDoLadowania){
            System.out.println("Aktalny poziom baterii pojazdu " + pojazd.getNazwa() + " wynosi " + pojazd.getPoziomBaterii());
            if(pojazd.getPoziomBaterii() < 50) {
                pojazd.laduj();
                System.out.println("Pojazd " + pojazd.getNazwa() + " zostal naladowany do 100%.");
            }


        }
    }
}
