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
public class CD extends HatterTarolo {
     private boolean irasVedett;
    public CD(){
        super(716000);
        this.irasVedett = false;
    }

    public void pocokAtBillent(){
        this.irasVedett = !this.irasVedett;
    }
    
    @Override
    public void format() {
        if (!this.irasVedett){
            super.format();
        }
    }

    @Override
    public void torol(Fajl f) {
        if (!this.irasVedett){
            super.torol(f);
        }
    }

    @Override
    public void hozzaAd(Fajl f) {
        if (!this.irasVedett){
            super.hozzaAd(f); 
        }
    }
    
}
