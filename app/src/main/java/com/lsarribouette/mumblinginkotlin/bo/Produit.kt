package com.lsarribouette.mumblinginkotlin.bo

data class Produit(
    val id:Int,
    var libelle:String,
    var price:Float,
    var photo:String? = null,
    var estAchete:Boolean = false
)
