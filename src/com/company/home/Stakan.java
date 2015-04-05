package com.company.home;

/**
 * Created by Emma on 4/5/2015.
 */
public class Stakan {
    String imia;
    static String material = "Bumaga";
    static int vysota = 10;

    public Stakan(String imia){
        this.imia = imia;
    }

    int voda = 0;

    public int procentZapolneniia(){
        return voda;
    }

    public void nalit(int plus){
        voda += plus;
        if(voda >= 100){
            voda = 100;
            System.out.println(imia + " perepolnen. Lishnee vylilos.");
        }
    }

    public int vylit(){
        int was = procentZapolneniia();
        voda = 0;
        return was;
    }

    public String imia(){
        return imia;
    }

    public static int obiom(int vysota){
        return vysota*20;
    }

}
