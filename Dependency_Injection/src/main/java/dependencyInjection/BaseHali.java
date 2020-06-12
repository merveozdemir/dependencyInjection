package dependencyInjection;

/**
 * Hali
 *
 * @author Merve ÖZDEMİR
 * @since 11/06/2020
 */
public abstract class BaseHali {

    private Sekil sekil;
    private Desen desen;

    void haliyiDoku(Sekil sekil, Desen desen){
        this.sekil = sekil.sekliOlustur();
        this.desen = desen.deseniCiz();
    }

    void haliyiGoster(){
        System.out.println(getSekil().getBoyutm2() + " m2 boyutunda "+ getDesen().getRenk()+ " renginde "+ getDesen().getAdi() +" desenli "+getSekil().getAdi() +" bir halıdır.");
    }

    public Sekil getSekil() {
        return sekil;
    }

    public void setSekil(Sekil sekil) {
        this.sekil = sekil;
    }

    public Desen getDesen() {
        return desen;
    }

    public void setDesen(Desen desen) {
        this.desen = desen;
    }
}
