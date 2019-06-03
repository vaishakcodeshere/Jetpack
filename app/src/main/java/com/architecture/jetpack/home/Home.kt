package com.architecture.jetpack.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.architecture.jetpack.R

class Home : AppCompatActivity() {


    /**
     * Android Jetpack
     *
     * Jetpack is a suite of libraries, tools, and guidance to help developers write high-quality apps easier.
     * These components help you follow best practices, free you from writing boilerplate code, and simplify complex tasks, so you can focus on the code you care about.
     *
     *
     * Android Jetpack Components
     *
     * Android Jetpack components are a collection of libraries that are individually adoptable and built to work together while taking advantage of Kotlin language
     * features that make you more productive. Use them all or mix and match!
     *
     *
     * Foundation
     * Foundation components provide cross-cutting functionality like backwards compatibility, testing and Kotlin language support.
     *
     * Architecture
     * Architecture components help you design robust, testable and maintainable apps.
     *
     * Behavior
     * Behavior components help your app integrate with standard Android services like notifications, permissions, sharing and the Assistant.
     *
     * UI
     * UI components provide widgets and helpers to make your app not only easy, but delightful to use. Learn about Jetpack Compose, which helps simplify UI development.
     */


    private lateinit var category: androidx.recyclerview.widget.RecyclerView
    private lateinit var homeAdapter: HomeAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        category = findViewById(R.id.homerecyclerview)
        category.setHasFixedSize(true)
        category.layoutManager = androidx.recyclerview.widget.GridLayoutManager(this, 2)

        val dataarray = ArrayList<String>()
        dataarray.add("Foundation")
        dataarray.add("Architecture")
        dataarray.add("Behavior")
        dataarray.add("UI")

        homeAdapter = HomeAdapter(dataarray)
        category.adapter = homeAdapter


    }
}
