package com.example.presensionlinepnp.views.attendance

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.presensionlinepnp.R
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class AttendanceFragment : Fragment(), OnMapReadyCallback {

    private var mapPresensiOnlinePNP: SupportMapFragment? = null
    private var map: GoogleMap? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_attendance, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupMaps()
    }

    private fun setupMaps() {
        mapPresensiOnlinePNP = childFragmentManager.findFragmentById(R.id.map_presensi) as SupportMapFragment
        mapPresensiOnlinePNP?.getMapAsync(this)
    }

    override fun onMapReady(googleMap: GoogleMap) {
        map = googleMap
        val padang = LatLng(-0.923801, 100.373505)
        googleMap.addMarker(
            MarkerOptions()
                .position(padang)
                .title("Padang, Ampang ( Eddo Yulianda )")
        )
        map?.moveCamera(CameraUpdateFactory.newLatLng(padang))
        map?.animateCamera(CameraUpdateFactory.zoomTo(20f))

    }

}