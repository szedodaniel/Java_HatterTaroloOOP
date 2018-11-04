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
public class Fajl {
    
    private String nev;
    private int meret; //kb

    public Fajl(String nev, int meret) {
        this.nev = nev;
        this.meret = meret;
    }

    public String getNev() {
        return nev;
    }
    //set nev
    public void atnevez(String fajlNev){
        this.nev = fajlNev;
    }
    public int getBMeret() {
        return this.meret*1024;
    }
    public int getKbMeret() {
        return this.meret;
    }
    
     public int getMbMeret() {
        return this.getKbMeret()/1024;
    }
      public int geGbMeret() {
        return this.getMbMeret()/1024;
    }
    private String normalizaltMeret(){
        if(this.geGbMeret()> 1){
           
            return this.geGbMeret()+"Gb";
        }
        else if(this.getMbMeret() > 1){
            
            return getMbMeret()+"Mb";
        }
        else if(this.getKbMeret() > 1){
           
            return this.getKbMeret()+"Kb";
            
        }
        else{
            
            return this.getBMeret()+"b";
        }
    }
    public String toString(){
        return String.format("%-25s %12s", this.nev, this.normalizaltMeret());
    }
    
}
