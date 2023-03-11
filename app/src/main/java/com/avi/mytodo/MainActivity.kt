package com.avi.mytodo

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    lateinit var item:EditText
    lateinit var add:Button
    lateinit var listView: ListView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       item =findViewById(R.id.editText)
       add =findViewById(R.id.cardBtn)
       listView =findViewById(R.id.list)
    }
}