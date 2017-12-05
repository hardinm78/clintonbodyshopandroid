package com.mikehardinapps.clintonbodyshop

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

       val pageType = intent.getStringExtra("pageType")

       if (pageType=="About Us") {
           detailText.setText(resources.getString(R.string.about_us))
       }

       if (pageType=="FAQs") {
            detailText.setText(resources.getString(R.string.faqs))
       }

    }
}
