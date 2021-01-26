package com.example.p_interface;

public class 青龍偃月刀 extends 武器 implements 紅櫻,武器配色 {
    @Override
    int damage() {
        return 250;
    }

    @Override
    int range() {
        return 100;
    }

    @Override
    String getName() {
        return getClass().getSimpleName();
    }


    @Override
    public String 裝備紅櫻() {
        return "裝備紅櫻";
    }

    @Override
    public String 顏色() {
        return "青龍色f";
    }

    public void 神鬼亂舞(){

    }
}
