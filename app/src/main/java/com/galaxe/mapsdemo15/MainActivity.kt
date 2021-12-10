package com.galaxe.mapsdemo15

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MainActivity : AppCompatActivity() {
    lateinit var mapFrag: SupportMapFragment
    lateinit var googlemap : GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mapFrag = supportFragmentManager.findFragmentById(R.id.map) as SupportMapFragment
        mapFrag.getMapAsync {
            googlemap = it
            var loc = LatLng(13.03, 77.60)
            googlemap.addMarker(MarkerOptions().position(loc).title("My Loc"))
            googlemap.animateCamera(CameraUpdateFactory.newLatLng(loc))

        }
    }
}