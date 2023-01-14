package com.jap;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ElectronicListService {
    public static void main(String[] args) {

        final List<String> electronicsItems = addElectronicsItemsToList("TV,Computer,Refrigerator,TV");
        System.out.println(electronicsItems);
        int out =  searchElectronicItemInList(electronicsItems,"Computer");
        System.out.println( "Index of search Element is :  "+ out);
        System.out.println("Boolean flag - " + removeElectronicsItemFromList(electronicsItems, "Computer"));
    }

    //add all the electronics items inside the List
    public static List<String> addElectronicsItemsToList(String electronicsItems) {

       ArrayList<String> listItems = new ArrayList<>();
       String[] mylist = electronicsItems.split(",");
        for (int i = 0; i < mylist.length; i++) {
            if (listItems.indexOf(mylist[i]) == -1 )
                listItems.add(mylist[i]);
        }
        return listItems;
    }

    //search the electronic item from the list and return the index position
    public static int searchElectronicItemInList(List<String> listItems, String searchItem) {
        return listItems.indexOf(searchItem);
    }

    //remove the electronic item from the list using iterator
    public static boolean removeElectronicsItemFromList(List<String> listItem, String removeItem)
    {
        Iterator iterator = listItem.iterator();

        boolean flag = false;

        while (iterator.hasNext()){

            if (iterator.next().equals(removeItem)){
                flag = true ;
            }
        }
        return flag;
    }


}