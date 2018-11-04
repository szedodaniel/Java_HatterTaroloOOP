/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hattertarolooop;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Diak
 */
public class HatterTarolo {
   
    private List<Fajl> fajlRendszer;
    private long meret;
    
    public HatterTarolo(long meret){
        this.meret = meret;
        this.fajlRendszer = new ArrayList<>();
        
    }
   
    public void format(){
        this.fajlRendszer.clear();
    }
    
    public long maximalisMeret(){
        return this.meret;
    }
  
    public long foglaltKapacitas(){
        long s = 0;
        for (int i = 0; i < this.fajlRendszer.size(); i++) {
            s+=this.fajlRendszer.get(i).getKbMeret();
        }
        return s;
    }
  
    public long szabadKapacitas(){
        return this.maximalisMeret()-this.foglaltKapacitas();
    }
    public int keres(Fajl f){
        int ind = 0;
        while(ind<this.fajlRendszer.size() 
                && this.fajlRendszer.get(ind).getNev() != f.getNev() ){
            ind++;
        }
        return ind <this.fajlRendszer.size() ? ind : -1;
    }
    
    public void torol(Fajl f){
        int ind = this.keres(f);
        if(ind != -1){
            this.fajlRendszer.remove(ind);
        }
    }
    
    
    public void archival(Fajl f, HatterTarolo h){
        this.keres(f);
        h.hozzaAd(f);
        this.torol(f);
        
        
    }
    public void hozzaAd(Fajl f){
        if(f.getKbMeret() <= this.szabadKapacitas() && this.keres(f) == -1){
            this.fajlRendszer.add(f);
            
        }
    }
    public String listaz(){
        String s = String.format("%-25s %12s\n", "Faájlnév","Fájlméret");
        for (int i = 0; i < this.fajlRendszer.size(); i++) {
            s+=this.fajlRendszer.get(i)+"\n";
        }
        return s;
    }

    
}
