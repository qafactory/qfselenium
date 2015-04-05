package com.company.home;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Emma on 4/5/2015.
 */
class Main {
    public static void main(String[] args) {
        List<String> s = new ArrayList<String>();
        s.add("a");
        s.add("b");
        s.add("c");
        s.add("d");
        print(s);

        List<String> f = new ArrayList<String>();
        f.add("a"); f.add("b");
        f.add("c");
        f.add("d");
        System.out.println(isListsEqual(s, f)); //true

        f.add("d");
        System.out.println(isListsEqual(s, f)); //false

        s.add("b");
        System.out.println(isListsEqual(s, f)); //false

        List<String> s1 = new ArrayList<String>();
        List<String> s2 = new ArrayList<String>();
        System.out.println(isListsEqual(s1, s2)); //true

        String[] a = {"a", "b", "c", "d", "b"};
        print(a); //abcdb

        System.out.println(isEqual(a, s)); //true
    }

    public static void print(List<String> l) {
        for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));
        }
    }

    public static void print(String[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static boolean isListsEqual(List<String> l1, List<String> l2){
        return (l1.equals(l2) ? true : false);
    }

    public static boolean isEqual(String[] a,List<String> l){
        return (l.equals(toList(a)) ? true : false);

    }

    public static List<String> toList(String[] a) {
        List<String> l2 = new ArrayList<String>();
        for (int i = 0; i < a.length; i++) {
            l2.add(a[i]);
            //System.out.println(a[i]);
        }
        return l2;
    }



}


