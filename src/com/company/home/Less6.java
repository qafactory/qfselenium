package com.company.home;

/**
 * Created by emma on 4/7/15.
 */
public class Less6 {
    public static void main(String[] args) {
        int a = 7;
        int b = 3;
        String s = "Hello";

        String m = multiply(s, 5);
        System.out.println(m); // HelloHelloHelloHelloHello
        System.out.println(multiply(s, b)); // HelloHelloHello

        System.out.println(multiplyNewLine("NewLine", a));
//        // NewLine
//        // NewLine
//        // NewLine
//        // NewLine
//        // NewLine
//        // NewLine
//        // NewLine
        System.out.println(multiplyNewLine("Hey, this one on new line", 3));
//        // Hey, this one on new line
//        // Hey, this one on new line
//        // Hey, this one on new line

       doubleAndPrint("TwoTimes"); // TwoTimesTwoTimes
       doubleAndPrint("StillTwoTimes"); // StillTwoTimesStillTwoTimes

       System.out.println(multiply(3, "switch"));// switchswitchswitch

       System.out.println(multiply(1, "switchAgain"));// switchAgain

   }
        public static String multiply(String s, int n) {
            int i = 0;
            String text = "";
            while (i < n){
                text+=s;
                i++;
            }
            return text;
        }

        public static String multiply(int n, String s) {
            int i = 0;
            String text = "";
            while (i < n){
                text+=s;
                i++;
            }
            return text;
        }


        public static String multiplyNewLine(String s, int n) {
            int i = 0;
            String text = "";
            while (i < n){
                text+=s+"\n";
                i++;
            }
            return text;
        }

        public static void doubleAndPrint(String s) {
            System.out.println(s+s);

        }

}

