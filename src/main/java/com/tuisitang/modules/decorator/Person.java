package com.tuisitang.modules.decorator;

public class Person implements IThing {
    private IThing thing;

    public Person(IThing thing) {
        this.thing = thing;
    }

    @Override
    public void exec() {
        System.out.println("人散尽");
    }
}
