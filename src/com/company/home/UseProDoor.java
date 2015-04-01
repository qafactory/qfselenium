package com.company.home;

/**
 * Created by Emma on 4/1/2015.
 */
public class UseProDoor {

    public static void main(String[] args) {
        ProDoor door = new ProDoor(2000, 900, true, false);
        String doorInfo = door.toString();
        System.out.println("Door info:\n" + doorInfo);

        ProDoor door2 = new ProDoor(1900, 800, false, true);
        System.out.println("Door info:\n" + door2.toString());

        door.lock();
        System.out.println(door.isLocked()); //true

        door.close(); // Lock is in the way. Cannot close!

        System.out.println(door.isClosed()); // false

        System.out.println("Door info:\n" + door.toString());

        door.unLock();
        System.out.println(door.isLocked()); // false

        door.close();
        System.out.println(door.isClosed()); // true

        door2.open(); // Door is locked. Cannot open!
        door2.unLock();
        door2.open();
        System.out.println("Door info:\n" + door2.toString());




    }


}
