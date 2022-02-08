package com.rendiputra.pengenalanbintangapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvPlanets : RecyclerView
    private var list: ArrayList<Planet> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvPlanets = findViewById(R.id.rv_planets)
        rvPlanets.setHasFixedSize(true)

        list.addAll(PlanetData.listData)
        showRecyclerCardView()
    }

    private fun showRecyclerCardView() {
        rvPlanets.layoutManager = LinearLayoutManager(this)
        val homeCardView = HomeCardView(list)
        rvPlanets.adapter = homeCardView
    }
}