package com.company;

import java.util.Collection;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> staff = new LinkedList<>();
        ListIterator<String> it = staff.listIterator();

        it.add("Tom");
        it.add("Dianna");
        it.add("Cherry");
        System.out.println(staff);

        // binarySearch werkt niet op linked list
//        Collections.binarySearch(staff);

        it = staff.listIterator();

        it.next();
        it.next();
        it.add("Romeo");
        it.next();
        it.add("Juliet");

        it = staff.listIterator();

        System.out.println(staff);
        it.next();
        it.remove();

        while (it.hasNext()) {
            System.out.println(it.next());
        }


//        if(it.next().equals("Tom")) {
//            it.remove();
//        } while(it.hasNext()) {
//            System.out.println(it.next());
//        }

    }
}
