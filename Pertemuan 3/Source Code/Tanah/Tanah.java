/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan3.Tanah;

/**
 *
 * @author Muhammad Islahuddin
 */
public class Tanah {
    int panjang, lebar;
    
    public Tanah(int p, int l){
    panjang = p;
    lebar = l;
}
    int LuasTanah(){
        return panjang * lebar;
    }
}
