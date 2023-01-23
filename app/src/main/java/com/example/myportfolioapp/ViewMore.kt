package com.example.myportfolioapp

import android.app.DownloadManager
import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class ViewMore : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_more)


    }

    fun cv(view: View) {
        val intent = Intent(Intent.ACTION_VIEW , Uri.parse("https://drive.google.com/file/d/1PtYQ-EbPSUhSPlYlYSPCvEYg-Wms-teG/view?usp=share_link"))
        startActivity(intent)
    }

    fun download(view: View) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/drive/folders/1d-JaZ3EagxeXlAvWn-VzNRt7XFmQ5YOJ?usp=share_link"))
        startActivity(intent)
    }
}
