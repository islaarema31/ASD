/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan7.Tugas1;

/**
 *
 * @author Muhammad Islahuddin
 */
public class PencarianMahasiswa {
        Mahasiswa listMhs[];
    int idx;
    
    void tambah(Mahasiswa m){
        if(idx < listMhs.length){
            listMhs[idx] = m;
            idx ++;
        }else{
            System.out.println("Data Sudah Penuh !!");
        }
    }
    void tampil(){
        for(Mahasiswa m : listMhs){
            m.tampil();
            System.out.println("-----------------------");
        }
    }
    void selectionSort(){
        for(int i=0;i<listMhs.length-1;i++){
            int idxMin=i;
            for(int j=i+1;j<listMhs.length;j++){
                if(listMhs[j].nim>listMhs[idxMin].nim){
                    idxMin=j;
                }
            }
            Mahasiswa tmp=listMhs[idxMin];
            listMhs[idxMin]=listMhs[i];
            listMhs[i]=tmp;
        }
    }
    public void tampilPosisi(int x, int pos){
        if(pos != -1){
            System.out.println("data\t: "+ x +" ditemukan pada indeks "+pos);
        }else {
            System.out.println("data\t"+ x +" tidak ditemukan");
        }
    }
    public void tampilData(int x, int pos){
        if(pos!= -1){
            System.out.println("Nim\t: "+x);
            System.out.println("Nama\t: "+listMhs[pos].nama);
            System.out.println("umur\t: "+listMhs[pos].umur);
            System.out.println("IPK\t: "+listMhs[pos].ipk);
        }else{
            System.out.println("Data "+ x +" Tidak ditemukan" );
        }
    }
    public int findBinarySearch(int cari, int left, int right){
        int mid;
        if(right >= left){
            mid = (left + right)/2;
            if(cari == listMhs[mid].nim){
                return(mid);
            }else if(listMhs[mid].nim < cari){
                return findBinarySearch(cari, left, mid -1);
            }else{
                return findBinarySearch(cari, mid +1, right);
            }
        }
        return -1;
    }
}
