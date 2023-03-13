package com.lsarribouette.mumblinginkotlin.dao

import com.lsarribouette.mumblinginkotlin.bo.Produit

interface IProduitDao {
    fun selectById(id:Int) : Produit?
    fun getAll() : List<Produit>
    fun deleteById(id:Int)
    fun deleteAll()
    fun insert(produit : Produit) : Produit
}