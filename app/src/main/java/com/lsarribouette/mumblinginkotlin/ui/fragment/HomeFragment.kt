package com.lsarribouette.mumblinginkotlin.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.lsarribouette.mumblinginkotlin.R
import com.lsarribouette.mumblinginkotlin.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    lateinit var fhm: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fhm = FragmentHomeBinding.inflate(inflater, container, false)
        return fhm.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fhm.buttonDetailFragment.setOnClickListener {
            Navigation
                .findNavController(view)
                .navigate(R.id.action_homeFragment_to_detailFragment)
        }
    }
}
