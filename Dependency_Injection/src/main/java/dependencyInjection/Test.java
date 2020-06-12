package dependencyInjection;

/**
 * Test
 *
 * @author Merve ÖZDEMİR
 * @since 11/06/2020
 */
public class Test {
    public static void main(String[] args) {
        Sekil kare = new Kare();
        kare.setAdi("Kare");
        kare.setBoyutm2(10L);

        Desen cicekDeseni = new CicekDeseni();
        cicekDeseni.setAdi("Çiçek");
        cicekDeseni.setRenk("Kırmızı");

        Sekil daire = new Daire();
        daire.setBoyutm2(3L);
        daire.setAdi("Daire");

        Desen yildizDeseni = new YildizDeseni();
        yildizDeseni.setAdi("Yıldız");
        yildizDeseni.setRenk("Sarı");

        System.out.println("------------ Çiçekli kare Halı --------");
        Hali cicekliKareHali = new Hali();
        cicekliKareHali.haliyiDoku(kare, cicekDeseni);

        cicekliKareHali.haliyiGoster();

        System.out.println("------------ Çiçekli daire Halı --------");

        Hali cicekliDaireHali = new Hali();
        cicekliDaireHali.haliyiDoku(daire, cicekDeseni);

        cicekliDaireHali.haliyiGoster();

        System.out.println("------------ Yıldızlı kare Halı --------");

        Hali yildizliKareHali = new Hali();
        yildizliKareHali.haliyiDoku(kare, yildizDeseni);

        yildizliKareHali.haliyiGoster();
    }
}
