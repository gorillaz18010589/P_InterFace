package com.example.p_interface;
//*因為你祖先抽象類別不清楚楚,所以我擺明就是要你後代子孫把方法做出來
//abstract class一出來強迫後代子孫要實作他,強迫多形,大家都一樣的方法,但招式各有不同
//抽象目的強迫多型,且保有爸爸的主要方法,還可以再子孫那邊多形m2()方法等
//目的是我仍然保有我的方法,我m1寫得很好你拿去用呀,但我m2()抽象,你要把它做出來
//建構式也可以用抽象,不能直接建構但也有建構式的存在

/*
* abstract可以解釋成“一定會有的東西”，所以只能繼承一次。
*舉實際的例子：武器
武器都一定有攻擊力、攻擊範圍、名字
這時候如果你需要大量的使用到武器，那上述說的『攻擊力、攻擊範圍、名字』這些東西就適合放在abstract。
但武器百百種，可能長槍會有紅櫻、刀和劍會有劍柄而且也可能會有紅櫻、長弓、短弓和十字弓會有弦。
這些東西就不是一定會存在武器內的東西，我們就可以使用interface
 *
* */

import android.util.Log;

//1.abstract
public abstract class 武器 {

    void 武器預設(){
        Log.v("hank","此乃武器的方法不需,給後代武器實作,保留此方法");
    };

    abstract int damage(); //損害

    abstract int range(); //範圍

    abstract String getName(); //取得使用者姓名



}



