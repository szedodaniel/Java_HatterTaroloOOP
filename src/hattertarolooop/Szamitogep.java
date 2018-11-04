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
 * @author szedo
 */
public class Szamitogep extends HatterTarolo {
    private List<HatterTarolo> hatterek;
    
    public Szamitogep() {
        super(0);
        this.hatterek = new ArrayList<>();
    }
    public void felcsatol(HatterTarolo h){
        
        this.hatterek.add(h);
        
        
    }
    public long osszKapacitas(){
        long ossz = 0;
        
        for (int i = 0; i < this.hatterek.size(); i++) {
            ossz +=this.hatterek.get(i).maximalisMeret();
        }
        return ossz;
    }
    public long osszSzabadKapacitas(){
        long ossz = 0;
        for (int i = 0; i < this.hatterek.size(); i++) {
            ossz += this.hatterek.get(i).szabadKapacitas();
        }
        return ossz;
    }
    public long osszFoglaltKapacitas(){
        long ossz = 0;
        for (int i = 0; i < this.hatterek.size(); i++) {
            ossz += this.hatterek.get(i).foglaltKapacitas();
        }
        return ossz;
    }
    
}
