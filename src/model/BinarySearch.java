
package model;

public class BinarySearch {
    
    private int []a;
    private int key;
    private int startIndex;
    private int endIndex;

    public BinarySearch() {
    }

    public BinarySearch(int[] a, int key, int startIndex, int endIndex) {
        this.a = a;
        this.key = key;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    public int[] getA() {
        return a;
    }

    public void setA(int[] a) {
        this.a = a;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getEndIndex() {
        return endIndex;
    }

    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }
    
    public int search(){
        while(getStartIndex() <= getEndIndex()){
            int middle = (getStartIndex()+getEndIndex()) / 2;
            if(getA()[middle] == getKey()){
                return middle;
            } else if(getA()[middle] < getKey()){
                setStartIndex(middle + 1);
            } else{
                setEndIndex(middle -1);
            }
        }
        return -1;
    }
}
