package com.lsarribouette.mumblinginkotlin.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.lsarribouette.mumblinginkotlin.R
import com.lsarribouette.mumblinginkotlin.bo.Produit
import com.lsarribouette.mumblinginkotlin.databinding.ActivityMainBinding
import com.lsarribouette.mumblinginkotlin.repository.ProduitRepository

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val amb: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
//        amb.produit = Produit(4, "Encore un autre", 963.3f)
        amb.produit = ProduitRepository.getProduit(2)
        Toast.makeText(
            this,
            ProduitRepository.getProduit(1).toString(),
            Toast.LENGTH_LONG).show()
    }
}