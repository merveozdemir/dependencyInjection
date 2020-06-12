package dependencyInjection;

import sun.security.krb5.internal.crypto.Des;

/**
 * CicekDeseni
 *
 * @author Merve ÖZDEMİR
 * @since 11/06/2020
 */
public class CicekDeseni extends Desen {

    Desen deseniCiz() {
        System.out.println(this.renk +" renginde çiçek deseni oluşturuldu.");
        return this;
    }
}
