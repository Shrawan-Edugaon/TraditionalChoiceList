package com.example.traditionalchoicelist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    lateinit var mAlertButton: Button
    val programing_lang = arrayOf("Kotlin","C","C++","Java","Python","JavaScript","PHP","C#")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mAlertButton = findViewById(R.id.btnAlert)
        mAlertButton.setOnClickListener {
            val mAlertButton = AlertDialog.Builder(this@MainActivity)
            mAlertButton.setTitle("This is Title..")
            mAlertButton.setIcon(R.drawable.sarwankalu)
            mAlertButton.setCancelable(false)
            mAlertButton.setItems(programing_lang){_,which->
                when(which)
                {
                    which->
                    {
                        Toast.makeText(this@MainActivity,programing_lang[which],Toast.LENGTH_LONG).show()
                    }
                }
            }
            mAlertButton.setPositiveButton("Yes"){_,_->
                finish()
            }
            mAlertButton.setNeutralButton("Cancel"){_,_ ->
                Toast.makeText(this@MainActivity,"Clicked No Button",Toast.LENGTH_LONG).show()
            }
            mAlertButton.setNeutralButton("Cancel"){_,_->
                Toast.makeText(this@MainActivity,"Clicked Cancel Button",Toast.LENGTH_LONG).show()
            }

            val mAlertDialog = mAlertButton.create()
            mAlertDialog.show()
        }
    }
}