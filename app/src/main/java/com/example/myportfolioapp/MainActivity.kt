package com.example.myportfolioapp

import android.annotation.SuppressLint
import android.app.DownloadManager
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.System.exit

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list = ArrayList<certificate>()
        list.add(certificate(R.drawable.juniper, "JNCAA - Getting Started with Cloud", "Juniper Networks", "8th Jan, 2023"))
        list.add(certificate(R.drawable.googlecloud, "Essential Google Cloud Infrastructure : Core Services", "Google Cloud", "8th Jan, 2023"))
        list.add(certificate(R.drawable.googlecloud, "Essential Google Cloud Infrastructure : Foundation", "Google Cloud", "21st Dec, 2022"))
        list.add(certificate(R.drawable.googlecloud, "Google Cloud Fundamentals : Core Infrastructure", "Google Cloud", "20th Dec, 2022"))
        list.add(certificate(R.drawable.cisconetworkingacademy, "CPA: Programming Essentials in C++", "Cisco Networking Academy", "17th Dec, 2022"))
        list.add(certificate(R.drawable.hpe, "Software Engineering Virtual Experience Program", "Hewlett Packard Enterprise", "15th Dec, 2022"))
        list.add(certificate(R.drawable.moodindigo, "Mood Indigo Intern Offer Letter", "Mood Indigo, IIT Bombay", "18th Aug, 2022"))
        list.add(certificate(R.drawable.srm, "C Programming - Advanced Level", "SRM Institute of Science and Technology", "24th Jul, 2022"))
        list.add(certificate(R.drawable.iitk, "Basics of Python Programming", "IIT Kharagpur", "15th Nov, 2021"))

        val certificateAdapter = CertificateAdapter(list)
        recyclerview.layoutManager = LinearLayoutManager(applicationContext)
        recyclerview.adapter = certificateAdapter



    val linkedin = findViewById<ImageView>(R.id.linkedin)
    linkedin.setOnClickListener{
        val intent = Intent(Intent.ACTION_VIEW , Uri.parse("https://www.linkedin.com/in/imsuryasen/"))
        startActivity(intent)
    }
        val github = findViewById<ImageView>(R.id.github)
        github.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW , Uri.parse("https://github.com/ImSuryasen"))
            startActivity(intent)
        }
    }

    fun gmail(view: View) {
        val intent = Intent(Intent.ACTION_VIEW , Uri.parse("https://mail.google.com/"))
        startActivity(intent)
    }

    fun hackerrank(view: View) {
        val intent = Intent(Intent.ACTION_VIEW , Uri.parse("https://www.hackerrank.com/myselfsuryasen"))
        startActivity(intent)
    }

    fun leetcode(view: View) {
        val intent = Intent(Intent.ACTION_VIEW , Uri.parse("https://leetcode.com/imsuryasen/"))
        startActivity(intent)
    }
    fun instagram(view: View) {
        val intent = Intent(Intent.ACTION_VIEW , Uri.parse("https://instagram.com/im_suryasen_?igshid=ZDdkNTZiNTM="))
        startActivity(intent)
    }

    /* Menus */
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater : MenuInflater = menuInflater
            menuInflater.inflate(R.menu.my_menu , menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.resume -> {
                val intent = Intent(this@MainActivity, ViewMore::class.java) /* Explicit Intent -> opening the contents in the app itself */
                startActivity(intent)
            }
            R.id.exit -> {
                finish()
            }
        }
        return super.onOptionsItemSelected(item)
    }
}