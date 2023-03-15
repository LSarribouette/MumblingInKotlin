package com.lsarribouette.mumblinginkotlin.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.lsarribouette.mumblinginkotlin.databinding.FragmentDetailBinding

class DetailFragment : Fragment() {
    lateinit var fhm: FragmentDetailBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fhm = FragmentDetailBinding.inflate(inflater, container, false)
        return fhm.root
    }
}