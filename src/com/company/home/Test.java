package com.company.home;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Emma on 4/5/2015.
 */
public class Test {
    public static void main(String[] args) {
        String[] a = {"a", "b", "c", "d", "b"};
        System.out.println("Array 'a' is:");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        List<String> s = new ArrayList<String>();
        s.add("a");
        s.add("b");
        s.add("c");
        s.add("d");
        s.add("b");

       // String[] a2 = toArray(s);
        System.out.println("Array 'a2' is:" + toArray(s));

    }

    public static String[] toArray(List<String> l){
        String[] a = new String[l.size()];

        for (int i = 0; i < l.size(); i++) {
            a[i] = l.get(i);
            //System.out.println(a[i]);
        }
        return a;

    }



}
