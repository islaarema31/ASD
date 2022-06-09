/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan14;

/**
 *
 * @author Muhammad Islahuddin
 */
public class BinaryTreeArray {
        int[] data;
    int idxLast;

    public BinaryTreeArray() {
        data = new int[10];
    }

    void add(int key) {
        idxLast++;
        data[idxLast] = key;
    }

    void populateData(int data[], int idxLast) {
        this.data = data;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            traverseInOrder(2 * idxStart + 1);
            System.out.print(data[idxStart] + " ");
            traverseInOrder(2 * idxStart + 2);
        }
    }

    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            System.out.print(data[idxStart] + " ");
            traversePreOrder(2 * idxStart + 1);
            traversePreOrder(2 * idxStart + 2);
        }
    }

    void traversePostOreder(int idxStart) {
        if (idxStart <= idxLast) {
            traversePostOreder(2 * idxStart + 1);
            traversePostOreder(2 * idxStart + 2);
            System.out.print(data[idxStart] + " ");
        }
    }
}
