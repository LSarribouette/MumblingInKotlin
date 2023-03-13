package com.lsarribouette.mumblinginkotlin.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.lsarribouette.mumblinginkotlin.R
import com.lsarribouette.mumblinginkotlin.repository.ProduitRepository

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(
            this,
            ProduitRepository.getProduit(1).toString(),
            Toast.LENGTH_LONG).show()
    }
}