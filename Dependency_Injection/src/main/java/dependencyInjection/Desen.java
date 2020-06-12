package dependencyInjection;

/**
 * Desen
 *
 * @author Merve ÖZDEMİR
 * @since 11/06/2020
 */
public abstract class Desen {

    String adi;
    String renk;

    abstract Desen deseniCiz();

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }
}
