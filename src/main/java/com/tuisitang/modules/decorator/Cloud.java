package com.tuisitang.modules.decorator;

public class Cloud implements IThing {
    private IThing thing;

    public Cloud(IThing thing) {
        this.thing = thing;
    }

    @Override
    public void exec() {
        System.out.print("云开");
        thing.exec();
    }
}
