package com.example.easytranzv3.ui.routier

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.easytranzv3.ui.routier.general.RoutierGeneralListFragment
import com.example.easytranzv3.R
import com.example.easytranzv3.ui.routier.animaux.RoutierAnimauxListFragment
import com.example.easytranzv3.ui.routier.citerne.RoutierCiterneListFragment
import com.example.easytranzv3.ui.routier.cmr.RoutierCMRListFragment
import com.example.easytranzv3.ui.routier.indivisible.RoutierIndivisibleListFragment
import com.example.easytranzv3.ui.routier.tdirigee.RoutierTdirigeeListFragment
import com.example.easytranzv3.ui.routier.vroulant.RoutierVroulantListFragment
import kotlinx.android.synthetic.main.fragment_routier_selection.*

class RoutierSelectionFragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_routier_selection, container, false)

        val btnGeneral = view.findViewById<Button>(R.id.btnGeneral)
        val btnCiterne = view.findViewById<Button>(R.id.btnCiterne)
        val btnAnimaux = view.findViewById<Button>(R.id.btnAnimaux)
        val btnTdirigee = view.findViewById<Button>(R.id.btnTdirigee)
        val btnVroulant = view.findViewById<Button>(R.id.btnVroulant)
        val btnIndivisible = view.findViewById<Button>(R.id.btnIndivisible)
        val btnCMR = view.findViewById<Button>(R.id.btnCMR)

        btnGeneral.setOnClickListener {
            val transaction = fragmentManager?.beginTransaction()
            val fragment = RoutierGeneralListFragment()
            transaction?.replace(R.id.nav_host_fragment, fragment)
            transaction?.addToBackStack(null)
            transaction?.commit()
        }

        btnCiterne.setOnClickListener {
            val transaction = fragmentManager?.beginTransaction()
            val fragment = RoutierCiterneListFragment()
            transaction?.replace(R.id.nav_host_fragment, fragment)
            transaction?.addToBackStack(null)
            transaction?.commit()
        }

        btnAnimaux.setOnClickListener {
            val transaction = fragmentManager?.beginTransaction()
            val fragment = RoutierAnimauxListFragment()
            transaction?.replace(R.id.nav_host_fragment, fragment)
            transaction?.addToBackStack(null)
            transaction?.commit()
        }

        btnIndivisible.setOnClickListener {
            val transaction = fragmentManager?.beginTransaction()
            val fragment = RoutierIndivisibleListFragment()
            transaction?.replace(R.id.nav_host_fragment, fragment)
            transaction?.addToBackStack(null)
            transaction?.commit()
        }

        btnTdirigee.setOnClickListener {
            val transaction = fragmentManager?.beginTransaction()
            val fragment = RoutierTdirigeeListFragment()
            transaction?.replace(R.id.nav_host_fragment, fragment)
            transaction?.addToBackStack(null)
            transaction?.commit()
        }

        btnVroulant.setOnClickListener {
            val transaction = fragmentManager?.beginTransaction()
            val fragment = RoutierVroulantListFragment()
            transaction?.replace(R.id.nav_host_fragment, fragment)
            transaction?.addToBackStack(null)
            transaction?.commit()
        }

        btnCMR.setOnClickListener {
            val transaction = fragmentManager?.beginTransaction()
            val fragment = RoutierCMRListFragment()
            transaction?.replace(R.id.nav_host_fragment, fragment)
            transaction?.addToBackStack(null)
            transaction?.commit()
        }

        (activity as AppCompatActivity).supportActionBar?.title = "Routier"

        return view
    }


}