package com.example.p_interface;

import android.util.Log;

public class 關羽 {
    private 武器 weapon; //宣告一個變形類別的武器

    //關羽攻擊方法
    public void attack(){
        if(weapon == null){
            //如果沒有裝武器攻擊
            Log.v("hank","關羽空手 擊退敵人 造成敵人10點傷害");
        }else {
            //有裝武器攻擊,武器的名稱,武器的傷害
            Log.v("hank","關羽使用" + weapon.getName() +"造成敵人" + weapon.damage() +"傷害");
        }
    }

    //裝備武器方法
    public void 裝備武器(武器 weapon){
        this.weapon = weapon;
    }
}
