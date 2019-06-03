package com.architecture.jetpack.arch.databinding

import android.content.Context
import androidx.databinding.DataBindingUtil
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.view.View
import com.architecture.jetpack.R
import com.architecture.jetpack.databinding.ActivityArchBinding
import com.architecture.jetpack.home.Home
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.activity_main.view.homerecyclerview
import kotlinx.android.synthetic.main.activity_main2.view.*

class Arch : AppCompatActivity() {


    /**
     *
     * Data Binding Library
     *
     * The Data Binding Library is a support library that allows you to bind UI components in your layouts to
     * data sources in your app using a declarative format rather than programmatically.
     *
     * The lateinit keyword stands for late initialization. Lateinit comes very handy when a non-null initializer cannot be supplied in the constructor,
     * but the developer is certain that the variable will not be null when accessing it, thus avoiding null checks when referencing it later.
     *
     */

    lateinit var dataBinding: ActivityArchBinding

    lateinit var myadapter: HomeAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dataBinding = DataBindingUtil.setContentView(this, R.layout.activity_arch)

        val usermodels = User()

        usermodels.firstname = "vaishak"
        usermodels.lastname = "babu"
        dataBinding.usermodel = usermodels
        val gamedata = ArrayList<Games>()

        gamedata.add(Games("Name: COD", "Rating: 5.0"))
        gamedata.add(Games("Name: COD1", "Rating: 2.0"))
        gamedata.add(Games("Name: COD2", "Rating: 3.0"))
        gamedata.add(Games("Name: COD3", "Rating: 4.0"))
        gamedata.add(Games("Name: COD4", "Rating: 5.0"))
        gamedata.add(Games("Name: COD5", "Rating: 5.0"))
        gamedata.add(Games("Name: COD6", "Rating: 7.0"))
        gamedata.add(Games("Name: COD7", "Rating: 5.0"))
        gamedata.add(Games("Name: COD8", "Rating: 5.0"))
        gamedata.add(Games("Name: COD9", "Rating: 5.0"))
        gamedata.add(Games("Name: COD10", "Rating: 5.0"))
        gamedata.add(Games("Name: COD11", "Rating: 5.0"))
        gamedata.add(Games("Name: COD12", "Rating: 5.0"))
        gamedata.add(Games("Name: COD13", "Rating: 5.0"))
        gamedata.add(Games("Name: COD14", "Rating: 5.0"))
        gamedata.add(Games("Name: COD15", "Rating: 5.0"))


        myadapter = HomeAdapter(gamedata)

        dataBinding.myAdapter = myadapter


    }


}



