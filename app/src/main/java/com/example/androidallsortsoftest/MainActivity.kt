package com.example.androidallsortsoftest

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
         setContentView(R.layout.activity_main)

        var btn:Button=findViewById(R.id.btnSubmit)
        var btnView:Button=findViewById(R.id.btnView)
        var etFirst:EditText=findViewById(R.id.etFirstName)
        var etLast:EditText=findViewById(R.id.etLastName)

    btnView.setOnClickListener {
        var intent=Intent(this,FormActivity::class.java)
        var msg="Firstname - ${etFirst.text} | Lastname - ${etLast.text}"
        intent.putExtra("value",msg)
        startActivity(intent)
    }

        btn.setOnClickListener {
            startActivity(
                Intent(
                    Intent.ACTION_VIEW, Uri.parse(
                        "https://google.com"
                    )
                )
            )
        }


    }
}