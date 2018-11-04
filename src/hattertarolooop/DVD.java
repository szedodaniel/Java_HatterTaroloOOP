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
public class DVD extends HatterTarolo {
  
    private boolean lezart;
   
    
    public DVD(){
        super(4700000);
        this.lezart = false;
    }
    public void lezar(){
        this.lezart = true;
    }

    @Override
    public void hozzaAd(Fajl f) {
       if(this.lezart){
            super.hozzaAd(f);
       }
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void torol(Fajl f) {
        if(!this.lezart){
        super.torol(f);
        }//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long szabadKapacitas() {
      
        return this.lezart ? 0 : super.szabadKapacitas(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
   

    
}
