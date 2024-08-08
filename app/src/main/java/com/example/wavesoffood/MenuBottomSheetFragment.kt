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
        val menuFoodName= listOf("Burger", "Sandwich", "Momo", "Pizza", "Pasta", "Salad",
            "Taco", "Sushi", "Steak", "Fries", "Wrap", "Hot Dog",
            "Panini", "Dumplings", "Ice Cream")
        val menuItemPrice= listOf("$5", "$7", "$10", "$12", "$8", "$6",
            "$9", "$15", "$20", "$3", "$6", "$4",
            "$7", "$11", "$5")
        val menuImage= listOf(
            R.drawable.th,
            R.drawable.th1,
            R.drawable.th2,
            R.drawable.th3,
            R.drawable.th4,
            R.drawable.th5,
            R.drawable.th6,
            R.drawable.th7,
            R.drawable.th8,
            R.drawable.th9,
            R.drawable.th10,
            R.drawable.th11,
            R.drawable.th12,
            R.drawable.th13,
            R.drawable.th14
        )
        val adapter= MenuAdapter(ArrayList(menuFoodName),ArrayList(menuItemPrice),ArrayList(menuImage),requireContext())
        binding.menuRecyclerView.layoutManager= LinearLayoutManager(requireContext())
        binding.menuRecyclerView.adapter=adapter

        return binding.root
    }

    companion object {

    }
}