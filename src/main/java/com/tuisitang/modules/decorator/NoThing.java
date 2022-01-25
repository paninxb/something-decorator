package com.tuisitang.modules.decorator;

public class NoThing {

    public static void main(String[] args) {
        IThing t = new Wind(new Flower(new Person(null)));
        t.exec();
        t = new Cloud(new Fog(new Bird(null)));
        t.exec();
    }
}
