package com.softhans.kotlinalertdialog

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        alertBtn.setOnClickListener {

            var alert = AlertDialog.Builder(this)
            alert.setTitle("Testing Alert Dialog")
            alert.setMessage("Is it working?")
            alert.setPositiveButton("Yes") {dialog: DialogInterface?, which: Int ->
                Toast.makeText(applicationContext, "Yahooo!!! It works", Toast.LENGTH_LONG).show()
            }
            alert.setNegativeButton("No") { dialog: DialogInterface?, which: Int ->
                Toast.makeText(applicationContext, "Oh No! Try again", Toast.LENGTH_LONG).show()
            }
            alert.show()
        }
    }
}
