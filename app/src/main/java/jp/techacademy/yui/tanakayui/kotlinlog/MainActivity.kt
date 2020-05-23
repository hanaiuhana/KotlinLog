package jp.techacademy.yui.tanakayui.kotlinlog

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
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

    }

}

