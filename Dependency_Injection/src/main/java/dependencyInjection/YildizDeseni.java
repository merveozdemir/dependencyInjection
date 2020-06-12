package dependencyInjection;

/**
 * BocekDeseni
 *
 * @author Merve ÖZDEMİR
 * @since 11/06/2020
 */
public class YildizDeseni extends Desen {

    Desen deseniCiz() {
        System.out.println(this.renk + " renginde yıldız deseni oluşturuldu.");
        return this;
    }
}
