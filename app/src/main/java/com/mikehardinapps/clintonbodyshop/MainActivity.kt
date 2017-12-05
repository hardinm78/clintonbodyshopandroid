package com.mikehardinapps.clintonbodyshop

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.ActivityCompat
import android.support.v4.content.ContextCompat
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import android.widget.Toast
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), OnMapReadyCallback {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val menuItems = listOf("Accident Checklist","Call Us", "Email Us", "About Us", "FAQs")

        val listAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,menuItems)

        menuListView.adapter = listAdapter
        
        
        menuListView.setOnItemClickListener { adapterView, view, i, l ->

            if (i == 0){
                val ACIntent = Intent(this,ACActivity::class.java)
                ACIntent.putExtra("pageType","About Us")
                startActivity(ACIntent)
            }

            if (i==1){
                if (ContextCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_GRANTED) {
                    val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "6013557691"))
                    startActivity(intent)
                }else{
                    Toast.makeText(this,"Please allow permission to access phone", Toast.LENGTH_SHORT).show()

                    ActivityCompat.requestPermissions(this,{Manifest.permission.CALL_PHONE});
                }

            }

            if (i == 3){
                val detailIntent = Intent(this,DetailActivity::class.java)
                detailIntent.putExtra("pageType","About Us")
                startActivity(detailIntent)
            }
            if (i == 4){
                val detailIntent = Intent(this,DetailActivity::class.java)
                detailIntent.putExtra("pageType","FAQs")
                startActivity(detailIntent)
            }

        }
    }


    override fun onMapReady(googleMap: GoogleMap) {

    }
}
