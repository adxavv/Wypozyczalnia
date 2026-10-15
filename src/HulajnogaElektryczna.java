import java.lang.annotation.Inherited;

public class HulajnogaElektryczna extends PojazdElektryczny{

    public HulajnogaElektryczna(String nazwa) {
        super(nazwa, 5);

    }
    @Override
    double kosztWypozyczenia(int minuty) {
        return 3+minuty*0.6;
    }
}
