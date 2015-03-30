package com.company;

/**
 * Created by Admin on 30.03.15.
 */
public class Door {
    public int height;
    public boolean isOpened;

    //constructor
    public Door(int height){
        this.height = height;
        isOpened = true;
    }

    //method to close door
    public void close(){
        isOpened = false;
        System.out.println("Closing the door");
    }

    public void print(){
        System.out.println("Door height is " + height);
        if (isOpened){
            System.out.println("Door is opened");
        } else {
            System.out.println("Door is closed");

        }
    }

}
