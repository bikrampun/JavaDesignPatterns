package com.example;

interface displayModule {
    void display();
}

class Monitor implements displayModule {
    @Override
    public void display() {
        System.out.println("Display through Monitor");
    }
}

class Project implements displayModule {
    @Override
    public void display() {
        System.out.println("Display through Projector");
    }
}
public class Computer {
    displayModule dm;

    public void setDm(displayModule dm) {
        this.dm = dm;
    }
    public void display() {
        dm.display();
    }

    public static void main(String[] args) {
        Computer cm = new Computer();
        displayModule dm = new Monitor();
        displayModule dm1 = new Project();

        cm.setDm(dm);
        cm.display();
        cm.setDm(dm1);
        cm.display();
    }
}
