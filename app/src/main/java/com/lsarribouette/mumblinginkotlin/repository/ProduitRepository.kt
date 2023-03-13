package com.lsarribouette.mumblinginkotlin.repository

import com.lsarribouette.mumblinginkotlin.dao.DaoFactory
import com.lsarribouette.mumblinginkotlin.dao.DaoType

object ProduitRepository {
    private var daoMemoire = DaoFactory.getDao(DaoType.MEMOIRE)
    //private var daoInternet = DaoFactory.getDao(DaoType.INTERNET)
    //private var daoBdd = DaoFactory.getDao(DaoType.BDD)

    fun getProduit(id:Int)= daoMemoire.selectById(id)

// Exemple avec plusieurs options de recuperation de donnees
//    fun getAllProduit(): List<Produit> {
//        var listeProduits : List<Produit> = daoBdd.getAllProduit()
//        if(listeProduits.isEmpty()){
//            listeProduits = daoInternet.getAllProduit()
//        }
//        return listeProduits
//    }
}