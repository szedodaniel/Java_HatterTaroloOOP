/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hattertarolooop;

/**
 *
 * @author Diak
 */
public class HatterTaroloOOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fajl f1 = new Fajl("recept.docx", 689);
        Fajl f2 = new Fajl("Trónok_Harca_HD_S01.mkv",25327323);
        Fajl f3 = new Fajl("Rossz_lányok.avi", 30000);
        Fajl f4 = new Fajl("NagyiFotók.rar",350000);
        
        Szamitogep pc = new Szamitogep();
        HatterTarolo HDD = new HatterTarolo(50000000);
        pc.felcsatol(HDD);
        System.out.println("Összhely1 "+pc.osszKapacitas());
        System.out.println("Összhely1 "+pc.osszSzabadKapacitas());
        
        HatterTarolo piciHDD2 = new HatterTarolo(15000000);
        
        pc.felcsatol(piciHDD2);
        // pc.felcsatol(piciHDD2);
        System.out.println("Összhely2 "+pc.osszKapacitas());
        System.out.println("Összhely2 "+pc.osszSzabadKapacitas());
        
        
        
       
        
        
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
        
       
        HDD.hozzaAd(f1);
        HDD.hozzaAd(f2);
        HDD.hozzaAd(f2);
        HDD.hozzaAd(f3);
        HDD.hozzaAd(f4);
        System.out.println("hdd össz szabad "+HDD.szabadKapacitas());
        System.out.println("hdd2 össz szabad "+piciHDD2.szabadKapacitas());
        
        System.out.println("keres "+HDD.keres(f2));
        HDD.archival(f4, piciHDD2);
        HDD.archival(f3, piciHDD2);
        HDD.archival(f1, piciHDD2);
        HDD.archival(f2, piciHDD2);
        
        System.out.println("arch");
        System.out.println("hdd össz szabad "+HDD.szabadKapacitas());
        System.out.println("picihdd2 össz szabad "+piciHDD2.szabadKapacitas());
        
        
        System.out.println("PC összhely "+pc.osszKapacitas());
        System.out.println("PC szabad hely "+pc.osszSzabadKapacitas());
        System.out.println("PC össz foglalt hely "+pc.osszFoglaltKapacitas());
        
        
     //   System.out.println(piciHDD.listaz());
        Floppy kisFloppy = new Floppy();
        System.out.println(kisFloppy.szabadKapacitas());
        kisFloppy.hozzaAd(f1);
        
        System.out.println(kisFloppy.listaz());
        System.out.println(kisFloppy.szabadKapacitas());
       
        DVD verbatim = new DVD();
       
        verbatim.hozzaAd(f3);
        verbatim.hozzaAd(f4);
        System.out.println(verbatim.szabadKapacitas());
        verbatim.lezar();
        System.out.println(verbatim.listaz());
        System.out.println(verbatim.szabadKapacitas());
        
    }
    
}
