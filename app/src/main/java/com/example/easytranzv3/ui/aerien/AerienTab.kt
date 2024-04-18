package com.example.easytranzv3.ui.aerien

import android.os.Bundle
import android.view.LayoutInflater
import androidx.fragment.app.Fragment
import com.example.easytranzv3.R
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager
import com.example.easytranzv3.ui.aerien.international.AerienIntListFragment
import com.example.easytranzv3.ui.aerien.national.AerienListFragment
import com.google.android.material.tabs.TabLayout


class AerienTab : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.tab_layout, container, false)
        val fm = childFragmentManager
        val adapter = MyViewPagerAdapter(fm)
        val viewPager: ViewPager = view.findViewById(R.id.viewPager)
        val tabs: TabLayout = view.findViewById(R.id.tabs)

        adapter.addFragment(AerienListFragment(), "National")
        adapter.addFragment(AerienIntListFragment(), "International")
        viewPager.adapter = adapter
        tabs.setupWithViewPager(viewPager)

        return view
    }

    class MyViewPagerAdapter(manager: FragmentManager) : FragmentPagerAdapter(manager) {
        private val fragmentList: MutableList<Fragment> = ArrayList()
        private val titleList: MutableList<String> = ArrayList()

        override fun getCount(): Int {
            return fragmentList.size
        }

        override fun getItem(position: Int): Fragment {
            return fragmentList[position]
        }

        fun addFragment(fragment: Fragment, title: String) {
            fragmentList.add(fragment)
            titleList.add(title)
        }

        override fun getPageTitle(position: Int): CharSequence? {
            return titleList[position]
        }
    }

}