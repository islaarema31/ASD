/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan2;

/**
 *
 * @author Muhammad Islahuddin
 */
class Pacman {
    int x, y, width, height;
    
    void moveLeft(int b) {
        x -=1;
    }
    void moveRight(int b){
        x +=1;
    }
    void moveUp(int b){
        y +=1;
    }
    void moveDown(int b){
        y -=1;
    }
    void printPosition(int x, int y){
        System.out.println("Pacman berada diposisi (x,y) = "+x+","+y);
    }
}
