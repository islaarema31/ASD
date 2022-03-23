/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan5.Faktorial;

/**
 *
 * @author Muhammad Islahuddin
 */
public class Faktorial {
    public int nilai;
    
    public int FaktorialBF(int n){
        int fakto = 1;
        int i = 1;
        
        do {            
           fakto = fakto*i;
           i++;
        } while (i <= n);
     //   while (i<n){
     //       fakto = fakto * i;
     //       i++;
     //   }
      //  for (int i = 1; i <= n; i++) {
      //      fakto = fakto*i;
      //  }
        return fakto;
    }
    
    public int FaktorialDC(int n){
        if (n==1) {
            return 1;
        }else{
            int fakto = n*FaktorialDC(n-1);
            return fakto;
        }
    }
}
