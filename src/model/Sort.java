
package model;

import java.util.Random;

public class Sort {
    private int size;

    public Sort() {
    }

    public Sort(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    public int[] inputArray(){
        int [] a= new int [getSize()];
        Random r = new Random();
        for(int i =0; i<getSize() ; i++){
            a[i] = r.nextInt(11);
        }
        return a;
    }
    
    public void bubbleSort(int []a){
        for(int i =0; i<a.length; i++){
            for(int j =0; j < a.length - i -1; j++){
                if(a[j] > a[j + 1]){
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }
}
