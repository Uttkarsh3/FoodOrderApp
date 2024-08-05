package com.example.wavesoffood

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.wavesoffood.adapter.MenuAdapter
import com.example.wavesoffood.databinding.FragmentMenuBottomSheetBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


class MenuBottomSheetFragment : BottomSheetDialogFragment() {
    private lateinit var binding: FragmentMenuBottomSheetBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding=FragmentMenuBottomSheetBinding.inflate(inflater,container,false)
        binding.buttonBack.setOnClickListener{
            dismiss()
        }
        val menuFoodName= listOf("Burger","Sandwich","Momo","Burger","Sandwich","Momo","Burger","Sandwich","Momo")
        val menuItemPrice= listOf("$5","$7","$10","$5","$7","$10","$5","$7","$10")
        val menuImage= listOf(
            R.drawable.th,
            R.drawable.th2,
            R.drawable.th,
            R.drawable.th,
            R.drawable.th2,
            R.drawable.th,
            R.drawable.th,
            R.drawable.th2,
            R.drawable.th
        )
        val adapter= MenuAdapter(ArrayList(menuFoodName),ArrayList(menuItemPrice),ArrayList(menuImage))
        binding.menuRecyclerView.layoutManager= LinearLayoutManager(requireContext())
        binding.menuRecyclerView.adapter=adapter

        return binding.root
    }

    companion object {

    }
}