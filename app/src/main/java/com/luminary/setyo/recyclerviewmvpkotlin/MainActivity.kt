package com.luminary.setyo.recyclerviewmvpkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.luminary.setyo.recyclerviewmvpkotlin.model.Users
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), UserView {



    lateinit var presenter : UserPresenterImp

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initPresenter()
        initView()
    }

    private fun initView() {

        btnSubmit.setOnClickListener {
            presenter.addList(inputName.text.toString(),inputAlamat.text.toString())
        }

    }

    override fun berhasil(data: ArrayList<Users>) {
        //masukkan ke adapter
        var iniadapter = RecyclerAdapter(data)
        //adapter masukkan ke recyclerview
        recyclerview.adapter = iniadapter
        recyclerview.layoutManager = LinearLayoutManager(this)
    }

    override fun noSuccess(pesan: String) {

    }

    private fun initPresenter() {
        presenter = UserPresenterImp(this)
    }
}
