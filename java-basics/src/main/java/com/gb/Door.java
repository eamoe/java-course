package com.gb;

public class Door implements Checkable {

    private boolean isOpen;
    private boolean isLocked;

    public void open () {
        if (!isOpen()) {
            setOpen(true);
            System.out.println("The door is open");
        }
        else {
            System.out.println("The door is already open");
        }
    }

    public void close () {
        if (isOpen()) {
            setOpen(false);
            System.out.println("The door is closed");
        }
        else {
            System.out.println("The door is already closed");
        }
    }

    public void lock () {
        if (!isLocked()) {
            setLocked(true);
            System.out.println("The door is locked");
        }
        else {
            System.out.println("The door is already locked");
        }
    }

    public void unlock () {
        if (isLocked()) {
            setLocked(false);
            System.out.println("The door is unlocked");
        }
        else {
            System.out.println("The door is already unlocked");
        }
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void setLocked(boolean locked) {
        isLocked = locked;
    }
    @Override
    public void check() {
        System.out.println("Door is ok");
    }

}
