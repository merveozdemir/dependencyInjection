package dependencyInjection;

import java.nio.channels.SelectionKey;

/**
 * Daire
 *
 * @author Merve ÖZDEMİR
 * @since 11/06/2020
 */
public class Daire extends Sekil {
    Sekil sekliOlustur() {
        System.out.println(getBoyutm2() +" m2 boyutunda Daire şekli oluşturuldu");
        return this;
    }
}
