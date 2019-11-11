package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class CharList {

    String s;
    ArrayList<Character> list;


    // Transforming String into char array and adding all characters into ArrayList
    public CharList(String s) {

        char[] chars = s.toCharArray();
        list = new ArrayList();
        for (int i = 0; i < chars.length; i++) {
            list.add(chars[i]);
        }

    }

    private CharList(ArrayList<Character> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return String.valueOf(list);
    }

    int length() { // return Length of the ArrayList
        return list.size();
    }

    char charIndex(int index) { // return value of particular index
        return list.get(index);
        // for (int i = 0; i < list.size(); i++) {
        //   return list.get(i);
    }

    int valueOfIndex(char valueofIndex) { // return the specified char value index
        return list.indexOf(valueofIndex);
    }

    CharList printSubString(int first, int last) {
        return new CharList(new ArrayList<Character>(list.subList(first, last)));
    }

    CharList printSingleInstances() {
        HashSet<Character> set = new HashSet<>();
        set.addAll(list);
        return new CharList(new ArrayList<Character>(set));
    }

    CharList removeElement(Character c) {
        list.remove(c);
        return new CharList(new ArrayList<Character>(list));
    }

    /*
        char removeElemnt(char c) {
           return list.remove(c);

        }*/
    CharList removeAllElement(Character c) {
        list.removeAll(Collections.singleton(c));
        return new CharList(new ArrayList<Character>(list));
    }

    boolean returnTrueIfEmplty() {
        return list.isEmpty();
    }

    boolean returnTrueIfValuePresent(Character c) {
        return list.contains(c);
    }

    CharList clearCharList() {
        list.clear();
        return new CharList(new ArrayList<Character>(list));
    }
    CharList sortCharList(){
        Collections.sort(list);
        return new CharList(new ArrayList<Character>(list));
    }
    CharList reversedCharList(){
        Collections.reverse(list);
        return new CharList(new ArrayList<Character>(list));
    }
    CharList mixCharList(){
        Collections.shuffle(list);
        return new CharList(new ArrayList<Character>(list));
    }

}








