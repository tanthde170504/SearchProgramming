
package Controller;

import Common.Algorithm;
import Common.Library;
import Model.Element;
import View.Menu;

public class SearchProgramming extends Menu<String> {

    static String[] mc = {"Linear Search", "Binary Search", "Exit"};

    protected Library library;
    protected Algorithm algorithm;
    protected int[] array;
    protected int size_array;

    public SearchProgramming(Element element) {
        super("PROGRAMMING", mc);
        library = new Library();
        algorithm = new Algorithm();
        size_array = element.getSize_array();
        array = element.getArray();
        //1. Enter a possitive number
        //size_array = library.getInt("Enter number of array", 1, 100);
        //2. Create array by generate random integer in range
        //array = library.createArray(size_array);
    }

    public void execute(int n) {
        switch (n) {
            case 1:
                linearSearch();
                break;
            case 2:
                binarySearch();
                break;
            case 3:
                System.out.println("Exit Successfull !");
        }
    }
    public void linearSearch() {
        library.display(array);
        int value = library.getInt("\nEnter number to find: ", 1, 100);
        System.out.println("Found value: " + value + " at index: " + algorithm.linearSearch(array, value));
    }

    public void binarySearch() {
        algorithm.buddleSort(array);
        library.display(array);
        int value = library.getInt("\nEnter number to find: ", 1, 100);
        System.out.println("Found value: " + value + " at index: " + algorithm.binarySearch(array, value));
    }
}
