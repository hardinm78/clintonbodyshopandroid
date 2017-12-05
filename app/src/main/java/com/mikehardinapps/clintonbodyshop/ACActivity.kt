package com.mikehardinapps.clintonbodyshop

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_ac.*

class ACActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ac)


        val ACItems = listOf("Check to ensure you are not injured, if you are uninjured check with others.","If anyone is injured or the nature of the accident dictates it, immediately call 911. If required and appropriate, render first aid.", "Move your vehicle to a safe location if possible.","Exchange with other involved parties. This includes name, address, phone number, license plate number, driver's license number, and the name of the insurance company and contact.", "Secure names and contact info of any witnesses.","Take photographs of the vehicles and scene of the accident, if possible.", "Call the nearest Clinton Body Shop.", "Contact your insurance company, they may be able to provide additional guidance and request you get additional info.")

        val listAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,ACItems)

        ACListView.adapter = listAdapter


    }
}
