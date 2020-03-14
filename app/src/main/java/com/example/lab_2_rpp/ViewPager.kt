package com.example.lab_2_rpp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.core.view.size
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_view_pager.*
import kotlinx.android.synthetic.main.fragment_fragment_one.*
import java.util.ArrayList

class ViewPager : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_pager)

        val viewPagerAdapter = ViewPagerAdapter(supportFragmentManager)

        var arrlist =  intent.extras!!.getParcelableArrayList<Technology>("list") as ArrayList<Technology>

        for(i in 0..arrlist.size-1)
            viewPagerAdapter.addFragment(FragmentOne(arrlist[i].getG()), i.toString())

        viewPager.adapter = viewPagerAdapter
        viewPager.setCurrentItem(intent.extras!!.getInt("position"))
    }
}
