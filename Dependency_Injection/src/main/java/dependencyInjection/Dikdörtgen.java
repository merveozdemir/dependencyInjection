package dependencyInjection;

/**
 * Dikdörtgen
 *
 * @author Merve ÖZDEMİR
 * @since 11/06/2020
 */
public class Dikdörtgen extends Sekil {

    Sekil sekliOlustur() {
        System.out.println(getBoyutm2() + " m2 boyutunda Dikdörtgen şekli oluşturuldu");
        return this;
    }
}
