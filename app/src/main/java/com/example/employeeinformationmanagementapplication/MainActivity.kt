package com.example.employeeinformationmanagementapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {

    lateinit var  dataRV: RecyclerView
    lateinit var btnOpenDialog: FloatingActionButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dataRV= findViewById(R.id.idRVData)
        btnOpenDialog= findViewById(R.id.idbtnOpenDialog)

        




    }
}