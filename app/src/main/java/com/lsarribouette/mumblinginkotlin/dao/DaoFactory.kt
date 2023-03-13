package com.lsarribouette.mumblinginkotlin.dao

import com.lsarribouette.mumblinginkotlin.dao.memoire.ProduitDaoMemoireImpl

object DaoFactory {
    fun getDao(type: DaoType) =
        when(type){
            DaoType.MEMOIRE -> ProduitDaoMemoireImpl()
            //DaoType.BDD -> ProduitDaoBddImpl()
            //DaoType.INTERNET -> ProduitDaoInternetImpl()
        }
}