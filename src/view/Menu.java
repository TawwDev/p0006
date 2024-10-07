
package view;

import controller.Validation;
import model.BinarySearch;
import model.Sort;


public class Menu {
    
    public void display(){
        Validation v = new Validation();
        int size = v.getInt("Enter size array: ",1,Integer.MAX_VALUE);
        int x = v.getInt("Enter search value: ",1,Integer.MAX_VALUE);
        Sort sort = new Sort(size);
        int []a = sort.inputArray();
        sort.bubbleSort(a);
        System.out.print("Sorted array: [");
        for(int i =0; i<a.length; i++){
            if(i == a.length -1){
                System.out.println(a[i] + "]");
            } else {
                System.out.print(a[i] + ", ");
            }
        }
        BinarySearch binarySearch = new BinarySearch(a, x, 0, a.length-1);
        System.out.println("Found " + x + " at index: " + binarySearch.search());
    }
}
