package com.luminary.setyo.recyclerviewmvpkotlin

import com.luminary.setyo.recyclerviewmvpkotlin.model.Users

/**
 * Created by root on 17/02/18.
 */
interface UserView {

    fun berhasil(data : ArrayList<Users>)

    fun noSuccess(pesan :String)
}