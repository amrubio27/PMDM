package com.miguelalvrub.pmdm.ut01.ex06

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import com.miguelalvrub.pmdm.R
import com.miguelalvrub.pmdm.ut01.ex06.data.Cat

class Ut01Ex06Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ut01ex06)
        setupView()
    }

    private fun setupView(){
        val inputName = findViewById<EditText>(R.id.inputName)
        val inputSurname = findViewById<EditText>(R.id.inputSurname)
        val actionSave = findViewById<Button>(R.id.actionSave)

        actionSave.setOnClickListener{
            val cat = Cat(
                inputName.text.toString(),
                inputSurname.text.toString()
            )

            Log.d("@dev","Cat: $cat")
        }


    }
}