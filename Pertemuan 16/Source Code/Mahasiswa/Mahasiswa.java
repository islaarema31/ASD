/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan16.Mahasiswa;

/**
 *
 * @author Muhammad Islahuddin
 */
public class Mahasiswa {
    String nim;
    String nama;
    String notelp;
    
    public Mahasiswa(){
        
    }
    public Mahasiswa(String nim, String nama, String notelp){
        this.nim = nim;
        this.nama = nama;
        this.notelp = notelp;
    }
    @Override
    public String toString(){
        return "mahasiswa{" +"nim= "+nim +", nama= "+nama+", notelp= "+notelp+ '}';
    }  
}
