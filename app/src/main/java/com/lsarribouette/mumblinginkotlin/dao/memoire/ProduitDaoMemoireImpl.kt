package com.lsarribouette.mumblinginkotlin.dao.memoire

import com.lsarribouette.mumblinginkotlin.bo.Produit
import com.lsarribouette.mumblinginkotlin.dao.IProduitDao

class ProduitDaoMemoireImpl : IProduitDao {
    val produitsEnMemoire: MutableList<Produit> = mutableListOf<Produit>(
        Produit(1,"Un premier produit", 42.0f),
        Produit(2, "Un second produit", 12.5f),
        Produit(3, "Un troisième produit", 78.6f)
    )

    override fun selectById(id: Int): Produit? =
        produitsEnMemoire.filter { it.id == id }.firstOrNull()

    override fun getAll(): List<Produit> = produitsEnMemoire

    override fun deleteById(id: Int) {
        produitsEnMemoire.remove(selectById(id))
    }

    override fun deleteAll() {
        produitsEnMemoire.clear()
    }

    override fun insert(produit: Produit): Produit {
        produitsEnMemoire.add(produit)
        return produit
    }

}