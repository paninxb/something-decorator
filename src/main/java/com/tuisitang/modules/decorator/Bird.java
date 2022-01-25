package com.tuisitang.modules.decorator;

public class Bird implements IThing {
    private IThing thing;

    public Bird(IThing thing) {
        this.thing = thing;
    }

    @Override
    public void exec() {
        System.out.println("鸟却来");
    }
}
