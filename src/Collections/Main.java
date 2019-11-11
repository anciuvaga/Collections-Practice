package Collections;

import java.util.ArrayList;

public class Main {
    private static Object ArrayList;
    public static void main(String[] args) {

        CharList obj = new CharList("abc123123");
        System.out.println(obj);

        /*System.out.println(obj.length());
        System.out.println(obj.charIndex(1));
        System.out.println("Value of: "+ obj.valueOfIndex('3'));
        System.out.println("Substring is "+ obj.printSubString(1,5));
        System.out.println("PrintSingle" + obj.printSingleInstances());
        System.out.println("Remove element:" + obj.removeElement('a'));
        System.out.println("Remove element: "+ obj.removeElement('1'));
        System.out.println("Remove elemenent" + obj.removeAllElement('3'));
        System.out.println("Return true if empty: "+ obj.returnTrueIfEmplty());
        System.out.println("Return true if element is present: " + obj.returnTrueIfValuePresent('c'));
        System.out.println("Return cleared list: " + obj.clearCharList());
        System.out.println("Return sorted CharList"+ obj.sortCharList()); */
        System.out.println("Return reversed CharList" + obj.reversedCharList());
        System.out.println("Shuffle CharList" + obj.mixCharList());







    }
}
