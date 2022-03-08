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
public class Bola {
    double jari;
    
    public Bola(double r){
        jari = r;
    }
    public double LuasBola(){
        return 4*Math.PI*jari*jari;
    }
     public double VolumeBola(){
         return (4*Math.PI*jari*jari*jari)/3;
     }
}
