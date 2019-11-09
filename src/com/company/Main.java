package com.company;

import javax.swing.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	ArrayList<String> list = new ArrayList<String>(); //Creating ArrayList
      list.add("Andrei");
      list.add("Max");
      list.add("Vlad");
      list.add("Alexandru");
      list.add("Ariadna");

      // Traversing list through Iterator

        Iterator itr = list.listIterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        LinkedList <String> linkedList = new LinkedList <String>();
        linkedList.add("John");
        linkedList.add("Bob");
        linkedList.add("Bill");
        linkedList.add("Maxim");

        Iterator itr1 = linkedList.listIterator();
        while(itr1.hasNext()){
            System.out.println(itr1.next());

        }
        System.out.println();

        HashSet<String> hashset = new HashSet<String>();

        hashset.add("George");
        hashset.add("John");
        hashset.add("George");
        hashset.add("John");

        Iterator <String> itr2 = hashset.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }

        System.out.println();

        Map map = new HashMap();
        // Adding elements to map
        map.put(1,"Andrei");
        map.put(5, "Ion");
        map.put(3,"Emil");
        map.put(6, "Mihaela");

        // Traversing Map

        Set set = map.entrySet(); // Converting to Set so that we can traverse
        Iterator itr3 = set.iterator();

        while(itr3.hasNext()){
            // Converting to Map.Entry so that we can get key and value separately
            Map.Entry entry  = (Map.Entry)itr3.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        Map <Integer, String>map1 = new HashMap<Integer,String>();
        map1.put(1, "Jora");
        map1.put(3,"Dima");
        map1.put(2,"Viorel");

        // Elements can traverse in any order

        for(Map.Entry  m: map1.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
