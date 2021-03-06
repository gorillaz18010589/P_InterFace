package com.example.p_interface;
/*//目的:多形的概念同樣是172的車,我可以只要171的JAVA認證,也可只要173的Lenix認證
			// interface(介面)比抽象更抽象類似規格
			// (1)假設你要考過ocj1認證 跟ocj2認證那你就是java工程師
			// (2)所以你有這兩張證照那你就是
			// (3)但你實作的方法我完全不講,你自己去做有過就好方法看你實作
			// (4)我要求你有4張證照,你想辦法把4張證照實做出來,方法隨便你寫
			//因為規格訂出來就是要給人做的,所以要全世界的人來做,interface骨子裡的方法都是public只是沒寫出來
			//interface骨子裡還是類別,在我們生活事物裡面,有些名稱名詞代表的意義,有點像規格
			//規格如果穩和到那你就是什麼,考認證考兩張證照有符合,就算,考認證方法很多完成規格就可以
			//方法都是抽象方法不會有定義,不用寫抽象因為全部都是
			//拜託你全世界都來做,所以都是public方法*/
/** interface可以解釋成“附屬品”，可有可無，但有大量的東西都需要它，他就派上用場了。
 * 武器百百種，可能長槍會有紅櫻、刀和劍會有劍柄而且也可能會有紅櫻、長弓、短弓和十字弓會有弦。
 * 這些東西就不是一定會存在武器內的東西，我們就可以使用interface
 * */

public interface 武器配色 {
    String 顏色();
}
