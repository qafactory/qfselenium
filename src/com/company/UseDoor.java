package com.company;

/**
 * Created by Admin on 30.03.15.
 */
public class UseDoor {
    public static void main(String[] args) {
        Door room = new Door(100);
       //System.out.println(room.height);
       //System.out.println(room.isOpened);

        Door room2 = new Door(200);

        room2.print();

        room2.close();

        room2.print();








    }
}
