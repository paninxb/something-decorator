package com.tuisitang.modules.decorator;

public class Flower implements IThing {
    private IThing thing;


    public Flower(IThing thing) {
        this.thing = thing;
    }

    @Override
    public void exec() {
        System.out.print("花落");
        thing.exec();
    }
}
