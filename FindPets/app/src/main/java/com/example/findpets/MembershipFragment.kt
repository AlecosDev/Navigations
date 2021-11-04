package com.example.findpets

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.findpets.databinding.FragmentFeedBinding
import com.example.findpets.databinding.FragmentMembershipBinding


class MembershipFragment : Fragment() {

    lateinit var binding: FragmentMembershipBinding



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMembershipBinding.inflate(inflater)
        return binding.root
    }


}