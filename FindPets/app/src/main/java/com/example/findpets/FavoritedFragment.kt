package com.example.findpets

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.findpets.databinding.FragmentFavoritedBinding
import com.example.findpets.databinding.FragmentFeedBinding


class FavoritedFragment : Fragment() {

    lateinit var binding: FragmentFavoritedBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFavoritedBinding.inflate(inflater)
        return binding.root
    }


}