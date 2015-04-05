package com.company.home;

/**
 * Created by Emma on 4/5/2015.
 */
public class UseStakan {
    public static void main(String[] args) {
        Stakan s = new Stakan("Super");
        Stakan k = new Stakan("Bigger");

        System.out.println("s: " + s.imia);// s: Super
        System.out.println("k: " + k.imia);// k: Bigger

        System.out.println("Stakan: " + Stakan.material);// Stakan: Bumaga
        System.out.println("Stakan: " + Stakan.vysota);// Stakan: 10
        System.out.println("s: " + s.procentZapolneniia());// s: 0

        s.nalit(30);
        System.out.println("s: " + s.procentZapolneniia());// s: 30

        int v = s.vylit();
        System.out.println("v: " + v);// v: 30
        System.out.println("k: " + k.procentZapolneniia());// k: 0

        k.nalit(v);
        System.out.println("k: " + k.procentZapolneniia());// k: 30

        s.nalit(k.vylit());
        System.out.println("s: " + s.procentZapolneniia());// s: 30
        System.out.println("k: " + k.procentZapolneniia());// k: 0

        s.nalit(50);
        System.out.println("s: " + s.procentZapolneniia());// s: 80

        s.nalit(45);// Super perepolnen. Lishnee vylilos.
        System.out.println("s: " + s.procentZapolneniia());// s: 100

        s.imia = "ReSuper";
        System.out.println("s: " + s.imia());// s: ReSuper
        System.out.println("k: " + k.imia());// k: Bigger
        System.out.println("Obiom Stakana vysotoy 20: " + Stakan.obiom(20));// Obiom Stakana vysotoy 20: 400
    }
}






