package dependencyInjection;

/**
 * Sekil
 *
 * @author Merve ÖZDEMİR
 * @since 11/06/2020
 */
public abstract class Sekil {
    long boyutm2;
    String adi;

    abstract Sekil sekliOlustur();

    public long getBoyutm2() {
        return boyutm2;
    }

    public void setBoyutm2(long boyutm2) {
        this.boyutm2 = boyutm2;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }
}
