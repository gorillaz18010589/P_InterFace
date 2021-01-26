package com.example.p_interface;
/*抽象方法abstract 和 介面interface

直接進入正題

abstract可以解釋成“一定會有的東西”，所以只能繼承一次。
interface可以解釋成“附屬品”，可有可無，但有大量的東西都需要它，他就派上用場了。

舉實際的例子：武器
武器都一定有攻擊力、攻擊範圍、名字

這時候如果你需要大量的使用到武器，那上述說的『攻擊力、攻擊範圍、名字』這些東西就適合放在abstract。
但武器百百種，可能長槍會有紅櫻、刀和劍會有劍柄而且也可能會有紅櫻、長弓、短弓和十字弓會有弦。
這些東西就不是一定會存在武器內的東西，我們就可以使用interface*/

//變形,抽象,物件實作實用
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        方天畫戟 a = new 方天畫戟();
        Log.v("hank","呂布使用"  + a.getName());


        //1.招喚關羽物件
        關羽 person = new 關羽();

        //2.關羽沒有裝武器攻擊
        person.attack();

        //3.準備一把有繼承變形武器的青龍偃月刀,用的是武器方法,但效果是實作出變形武器的青龍偃月刀效果
        武器 knife = new 青龍偃月刀();

        //4.關羽裝上青龍偃月刀,用的是變形武器的三招,但骨子是青龍偃月刀的傷害
        person.裝備武器(knife);

        //5.關羽裝上青龍偃月刀後,再次攻擊
        person.attack();

    }
}