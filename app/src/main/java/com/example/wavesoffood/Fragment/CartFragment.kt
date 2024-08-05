package com.example.wavesoffood.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.wavesoffood.R
import com.example.wavesoffood.adapter.CartAdapter
import com.example.wavesoffood.databinding.FragmentCartBinding


class CartFragment : Fragment() {
    private lateinit var binding:FragmentCartBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentCartBinding.inflate(inflater,container,false)


        val cartFoodName= listOf("Burger","Sandwich","Momo")
        val cartItemPrice= listOf("$5","$7","$10")
        val cartImage= listOf(
            R.drawable.th,
            R.drawable.th2,
            R.drawable.th
        )
        val adapter= CartAdapter(ArrayList(cartFoodName),ArrayList(cartItemPrice),ArrayList(cartImage))
        binding.cartrecyclerview.layoutManager=LinearLayoutManager(requireContext())
        binding.cartrecyclerview.adapter=adapter
        return binding.root
    }

    companion object {

    }
}