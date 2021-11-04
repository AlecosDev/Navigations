package com.example.findpets

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.findpets.databinding.FragmentSejaMembroBinding


class Seja_membro : Fragment() {

    lateinit var binding: FragmentSejaMembroBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSejaMembroBinding.inflate(inflater)
        return binding.root
    }

}