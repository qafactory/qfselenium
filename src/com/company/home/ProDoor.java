package com.company.home;

/**
 * Created by Emma on 4/1/2015.
 */
public class ProDoor {
    int height;
    int width;
    boolean opened;
    boolean locked;

    public ProDoor(int height, int width, boolean opened, boolean locked) {
        this.height = height;
        this.width = width;
        this.opened = opened;
        this.locked = locked;
    }

    @Override
    public String toString(){
        String str = "Size:" + height + "x" + width + " mm\n";
        str += "Opened: " + (opened ? "Yes" : "No") + "\n";
        str += "Locked: " + (locked ? "Yes" : "No") + "\n";
        return str;
    }

    public void lock(){
        locked = true;
        //opened = false;
    }

    public boolean isLocked(){
        return locked;
    }

    public void close(){
        if (locked){
            System.out.println("Lock is in the way. Cannot close!");
        } else{
            opened = false;
        }
    }

    public void open(){
        if (locked){
            System.out.println("Door is locked. Cannot open!");
        } else{
            opened = true;
        }
    }

    public boolean isClosed(){
        return !opened;
    }

    public void unLock(){
        locked = false;
    }

}
