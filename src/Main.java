//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
    HulajnogaElektryczna h = new HulajnogaElektryczna("Kukirin");
    HulajnogaElektryczna h1 = new HulajnogaElektryczna("Kukirin G2 Pro");
    HulajnogaElektryczna h2 = new HulajnogaElektryczna("Kukirin G2 ");
    HulajnogaElektryczna h3 = new HulajnogaElektryczna("Kukirin New");

    SamochodElektryczny se = new SamochodElektryczny("Tesla S");
    SamochodElektryczny se2 = new SamochodElektryczny("Zeekr X9 Ultra");

    Rower r = new Rower("Cross");
    Rower r2 = new Rower("MTB");


    h.jedz(12);
    h.jedz(11);

    se.jedz(20);
    se.jedz(60);
    se.jedz(50);

    StacjaLadowania sl = new StacjaLadowania();
    PojazdElektryczny[] pojazdyDoLadowania = {h,h1,h2,h3, se, se2};
    sl.obsluz(pojazdyDoLadowania);

        h.jedz(10);
        h.jedz(11);

        se.jedz(50);
        se.jedz(100);

        System.out.println("Cennik dla 45 minut");
        r.podsumowanieWszystkichDla45Minut(45);
        h.podsumowanieWszystkichDla45Minut(45);
        se.podsumowanieWszystkichDla45Minut(45);

    }
}