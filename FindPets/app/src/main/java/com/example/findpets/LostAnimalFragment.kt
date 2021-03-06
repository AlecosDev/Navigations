package com.example.findpets

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.findpets.databinding.FragmentFeedBinding
import com.example.findpets.databinding.FragmentLostAnimalBinding


class LostAnimalFragment : Fragment() {

    lateinit var binding: FragmentLostAnimalBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentLostAnimalBinding.inflate(inflater)
        return binding.root
    }


}