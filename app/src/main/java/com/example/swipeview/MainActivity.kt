package com.example.swipeview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.swipeview.Fragments.SleepAt
import com.example.swipeview.Fragments.WakeupAt
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.appbar_main.*

class MainActivity : AppCompatActivity() {

    var pagerAdaptar:PagerAdaptar?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar_main)

        pagerAdaptar = PagerAdaptar(supportFragmentManager)
        pagerAdaptar!!.addFragments(SleepAt(), "Sleet Time")
        pagerAdaptar!!.addFragments(WakeupAt(), "Wake Up Time")

        costomViewPager.adapter = pagerAdaptar
        costomTabLayout.setupWithViewPager(costomViewPager)
    }
}
