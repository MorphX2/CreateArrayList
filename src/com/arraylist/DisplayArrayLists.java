package com.arraylist;

public class DisplayArrayLists {
    public static void main(String args[]) {
        // Instance of a classes LetterArrayLists and ColorsArrayList
        LetterArrayLists a1 = new LetterArrayLists();
        ColorsArrayList colors1 = new ColorsArrayList();
        
        // Printing the size of arraylist.
        System.out.println("Size of after additions: " + a1.al.size());
        
        // display the array list
        System.out.println("Contents of al; " + a1.al);
        
        // Remove elements from the array list
        a1.al.remove("F");
        a1.al.remove(2);
        
        System.out.println("Size of al after deletions: " + a1.al.size());
        System.out.println("Contents of al: " + a1.al);
        // Reference of a the ColorsArrayList
        System.out.println("Printing contents of colors: " + colors1.colors);
        
        
    }
  
    
}
