package com.company.home;

/**
 * Created by Emma on 4/1/2015.
 */
public class Home {
    public static void main(String[] args) {
        String t = "Hello Class, ";
        String ts = "and Student!";
        System.out.println(t+ts);

        int u [] = {11,22,33,44,55,66,77,88};
        System.out.println(u[5]);
        System.out.println(u[3-1]);

        int x = 8;
        for (; x < 11; x++) {
            System.out.println(x);
        }

        String s [] = {"How ", "are ", "you"};
        for (int i = 0; i < 3; i++) {
            System.out.println(s[i]);
        }

        int b =25;
        int[] m = {10, 20, 25, 30};
        int i = 0;
        while (i < 4) {
            if (m[i] == b) {
                break;
            }
            System.out.println(m[i]);
            i++;
        }


        int d = 10;
        int[] n = {10, 20, 25, 30};
        int j = 0;
        while (j < 4) {
            if (n[j] == d) {
                j++;
                continue;
            }
            System.out.println(n[j]);
            j++;
        }
// 20
// 25
// 30


    }
}
