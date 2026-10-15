public abstract class PojazdElektryczny extends Pojazd {
    private int poziomBaterii;
    private int zuzycieNaKm;
    public PojazdElektryczny(String nazwa, int zuzycieNaKm) {
        super(nazwa);
        this.zuzycieNaKm = zuzycieNaKm;
        this.poziomBaterii = 100;
    }
    public int getZuzycieNaKm() {
        return zuzycieNaKm;
    }

    public void setZuzycieNaKm(int zuzycieNaKm) {
        this.zuzycieNaKm = zuzycieNaKm;
    }

    public void setPoziomBaterii(int poziomBaterii) {
        this.poziomBaterii = poziomBaterii;
    }




    @Override
    void jedz(int km){
        if(czyWystartuje(km)){

            super.jedz(km);
            this.poziomBaterii = this.poziomBaterii-(km*zuzycieNaKm);
            System.out.println("Aktualny poziom baterii " + this.poziomBaterii);
        }
        else
            System.out.println("Nie wystartuje, zbyt malo baterii!");
    }
    public boolean czyWystartuje(int km){
        if(km*zuzycieNaKm <= poziomBaterii) {
            return true;
        }
        else
            return false;

    }
    public int getPoziomBaterii() {
        return poziomBaterii;
    }
    public void laduj(){
        this.poziomBaterii = 100;
    }
}
