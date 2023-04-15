package com.busy.looping.pitaara.Fragments.OnboardingFragments

import android.app.Application
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.busy.looping.pitaara.R
import com.google.android.gms.common.ErrorDialogFragment.newInstance
import com.google.android.material.datepicker.MaterialCalendar.newInstance
import java.lang.reflect.Array.newInstance
import javax.xml.datatype.DatatypeFactory.newInstance
import javax.xml.parsers.DocumentBuilderFactory.newInstance

class OnboardingPagerAdapter(fm : FragmentManager)  :FragmentPagerAdapter(fm){
    override fun getCount(): Int {
        return 4
    }

    override fun getItem(position: Int): Fragment {
        var bundle = Bundle()
        when(position) {
            0 -> {
                return OnboardingFrag1()
            }
            1 -> {
                //bundle.putString(OnboardingFrag2.Keys.imgRes, "")
            }
            2 -> {
                bundle.putString("", "")
            }
            3 -> {
                bundle.putString("", "")
            }
        }
        return OnboardingFrag1()
    }
}