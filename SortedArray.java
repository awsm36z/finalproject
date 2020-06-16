import java.util.ArrayList;

public class SortedArray {
    //private array list to store the elements
    private ArrayList<Integer> list;

    //constructor
    public SortedArray(){
        list = new ArrayList<>();
    }

      //to remove the element from the list
      public int remove(int index){
        return list.remove(index);
    }
    
    //to print the list
    public String toString(){
        return list.toString();
    }

    //to check of the list contains the value
    public boolean contains(int value){
        return list.contains(value);
    }

    //to get the value from the index 
    public int get(int index){
        return list.get(index);
    }

    //to clear the list
    public void clear(){
        list.clear();
    }

    //get the index of the particular value in the list, it would return -1 if value is not present
    public int indexOf(int value){
        return list.indexOf(value);
    }

    //checks if list is empty or not
    public boolean isEmpty(){
        return list.isEmpty();
    }


}