package com.luminary.setyo.recyclerviewmvpkotlin

import com.luminary.setyo.recyclerviewmvpkotlin.model.Users

/**
 * Created by root on 17/02/18.
 */
class UserPresenterImp:UserPresenter {

    var userView : UserView? = null

    var data : ArrayList<Users>? = null

    constructor(userView: UserView?) {
        this.userView = userView
        //deklarasi array
        data = ArrayList<Users>()
    }


    override fun addList(nama: String, alamat: String) {
        //insert to model users
        var model = Users(nama,alamat)


        data?.add(model)

        userView?.berhasil(data!!)

    }


}