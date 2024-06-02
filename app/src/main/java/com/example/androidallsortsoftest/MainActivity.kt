package com.example.androidallsortsoftest

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
         setContentView(R.layout.activity_main)

        var btn:Button=findViewById(R.id.btnSubmit)
        var btnView:Button=findViewById(R.id.btnView)



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