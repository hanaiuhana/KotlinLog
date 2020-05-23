package jp.techacademy.yui.tanakayui.kotlinlog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val human1 = Human("田中", 20,"タピオカ")
        val human2 = Human("佐藤", 10 , "プログラミング")

        human1.say()
        human2.say()
        human1.think()
        human2.think()

        val dog = Dog("ポチ", 3)
        dog.say()
        Log.d("kotlintest", "犬の名前は" + dog.name + "です。")
        Log.d("kotlintest", "犬の年齢は" + dog.age + "歳です。")

        val bigdog = Dog("ヨーゼフ", 15)
        bigdog.say()
        Log.d("kotlintest", "犬の名前は" + bigdog.name + "です。")
        Log.d("kotlintest", "犬の年齢は" + bigdog.age + "歳です。")

        val movedog = Dog("ポチ",3)   //コンストラクタに引数を渡す
        movedog.move()


        val taskArrayList = arrayListOf<String>()
        val task = String()
        taskArrayList.add(task)
        taskArrayList.remove(task)
        taskArrayList.removeAt(0)
        taskArrayList.clear()

        val map = mapOf<Int, String>(1 to "x", 2 to "y", -1 to "zz")
        //map[2] = "Y"
        val map2 = mutableMapOf("A" to 100, "B" to 200)
        map2.put("D", 400)

        val set1 = setOf(1,2,3,3)
        val set2 = setOf(3,2,1)
        Log.d("kotlintest", (set1 == set2).toString())

        val muset = mutableSetOf("A","B","C")
        muset.add("D")
        Log.d("kotlintest", muset.toString())




    }

}

