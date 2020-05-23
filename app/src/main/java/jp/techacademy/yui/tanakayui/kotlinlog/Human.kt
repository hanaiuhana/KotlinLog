package jp.techacademy.yui.tanakayui.kotlinlog

import android.util.Log

open class Human : Animal,Thinkable{
    var hobby :String = ""

    //引数付きコンストラクタ
    constructor(name: String, age: Int, hobby :String): super(name,age){
        this.hobby = hobby
    }

    override fun say() {
        Log.d("kotlinLog", "私の名前は" + this.name + "です。年は" + this.age + "歳です。")
    }

    override fun think() {
        Log.d("kotlinLog", "私は" + this.hobby + "について考える。")
    }
}
