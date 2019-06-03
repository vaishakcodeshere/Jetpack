package com.architecture.jetpack.arch.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.architecture.jetpack.R
import com.architecture.jetpack.home.HomeAdapter

class Architecture : AppCompatActivity() {


    /**
     * Architecture
     *
     * Android architecture components are a collection of libraries that help you design robust,
     * testable, and maintainable apps. Start with classes for managing your UI component lifecycle and handling data persistence.
     *
     * > Manage your app's lifecycle with ease. New lifecycle-aware components help you manage your activity and
     * fragment lifecycles. Survive configuration changes, avoid memory leaks and easily load data into your UI.
     *
     * > Use LiveData to build data objects that notify views when the underlying database changes.
     *
     * > ViewModel Stores UI-related data that isn't destroyed on app rotations.
     *
     * > Room is an a SQLite object mapping library. Use it to Avoid boilerplate code
     * and easily convert SQLite table data to Java objects. Room provides compile time
     * checks of SQLite statements and can return RxJava, Flowable and LiveData observables.
     */

    private lateinit var category: androidx.recyclerview.widget.RecyclerView
    private lateinit var homeAdapter: HomeAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        category = findViewById(R.id.homerecyclerview)
        category.setHasFixedSize(true)

        category.layoutManager = androidx.recyclerview.widget.GridLayoutManager(this, 2)

        val dataarray = ArrayList<String>()
        dataarray.add("Databinding")
        dataarray.add("Lifecycles")
        dataarray.add("LiveData")
        dataarray.add("Navigation")
        dataarray.add("Paging")
        dataarray.add("Room")
        dataarray.add("ViewModel")
        dataarray.add("WorkManager")

        homeAdapter = HomeAdapter(dataarray)
        category.adapter = homeAdapter
    }
}
