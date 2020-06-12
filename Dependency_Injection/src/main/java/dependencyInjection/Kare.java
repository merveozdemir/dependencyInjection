package dependencyInjection;

/**
 * Kare
 *
 * @author Merve ÖZDEMİR
 * @since 11/06/2020
 */
public class Kare extends Sekil {

    Sekil sekliOlustur() {
        System.out.println(getBoyutm2() + " m2 boyutunda Kare şekli oluşturuldu");
        return this;
    }
}
