/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan3.BangunRuang;

/**
 *
 * @author Muhammad Islahuddin
 */
public class Kubus {
    public int sisi;
    
    public Kubus(int s){
        sisi = s;
    }
    public int LuasKubus(){
    return 6*sisi;
    }
    public int VolumeKubus(){
    return sisi*sisi*sisi;
    }
}
