package com.labs_danp.lab9_danp

import android.net.Uri
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class LoadImage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_load_image)
        val extras = intent.extras
        val nameImage = extras?.getString("name_image")
        val myUri: Uri = Uri.parse("/storage/emulated/0/Pictures/CameraX-Image/${nameImage}.jpg")
        val ivLoader: ImageView = findViewById(R.id.imgLoader)
        ivLoader.setImageURI(myUri)
    }
}