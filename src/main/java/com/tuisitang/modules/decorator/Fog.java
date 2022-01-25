package com.tuisitang.modules.decorator;

public class Fog implements IThing {
    private IThing thing;

    public Fog(IThing thing) {
        this.thing = thing;
    }

    @Override
    public void exec() {
        System.out.print("雾散");
        thing.exec();
    }
}
