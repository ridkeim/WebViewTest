package ru.ridkeim.webviewtest

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View


class MainActivity : AppCompatActivity() {

    @SuppressLint("QueryPermissionsNeeded")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<View>(R.id.button)
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("http://ya.ru"))
        button.setOnClickListener{
            if(intent.resolveActivity(packageManager) != null ){
                startActivity(intent)
            }
        }
    }
}