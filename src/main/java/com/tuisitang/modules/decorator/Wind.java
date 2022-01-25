package com.tuisitang.modules.decorator;

public class Wind implements IThing {
    private IThing thing;


    public Wind(IThing thing) {
        this.thing = thing;
    }

    @Override
    public void exec() {
        System.out.print("风起");
        thing.exec();
    }
}
