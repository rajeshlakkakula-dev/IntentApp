package com.example.intentapp

import android.app.SharedElementCallback
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity(), OnClickListener {

    lateinit var editText: EditText
    lateinit var btnSearch: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editText = findViewById(R.id.et_data)
        btnSearch = findViewById(R.id.btn_search)
        btnSearch.setOnClickListener(this)


    }

    override fun onClick(p0: View?) {
        /* val url = editText.text.toString()
         val urlIntent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
         startActivity(urlIntent)*/

        /*val data = Intent(applicationContext, SecondActivity::class.java)
        startActivity(data)*/

        val shareIntent = Intent(Intent.ACTION_SEND)
        shareIntent.type = "text/plain"
        shareIntent.putExtra(Intent.EXTRA_SUBJECT, R.string.app_name)
        val shareMessage = "Hey I'm from Intent App"
        shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage)
        startActivity(Intent.createChooser(shareIntent, "Choose One"))


    }
}


