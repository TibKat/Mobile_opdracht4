package com.example.mobile_opdracht4

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val person = intent.getSerializableExtra("EXTRA_PERSON") as Person

        val tv = findViewById<TextView>(R.id.tvPerson)

        tv.text = person.name.toString() + " is " + person.age.toString() + " years old " +
                " and lives in " +person.country.toString() +"."
    }
}