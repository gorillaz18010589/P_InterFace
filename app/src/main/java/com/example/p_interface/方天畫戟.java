package com.example.p_interface;

import android.util.Log;

//2.繼承武器,因為武器裡面方法都不清楚繼承者當然要實作
//你所需的東西,繼承武器都有三種方法,你自己慢慢調整
public class 方天畫戟 extends 武器 {

    public 方天畫戟() {
    }

    @Override
    int damage() {
        Log.v("hank","方天畫戟 -> damage():" + 200);
        return 200;
    }

    @Override
    int range() {
        Log.v("hank","方天畫戟 -> range():" + 200);
        return 80;
    }

    @Override
    String getName() {
        Log.v("hank","方天畫戟 -> getName():" + getClass().getCanonicalName());
        return getClass().getSimpleName();
    }
}