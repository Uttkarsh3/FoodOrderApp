package com.example.wavesoffood.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.wavesoffood.R
import com.example.wavesoffood.adapter.MenuAdapter
import com.example.wavesoffood.databinding.FragmentCartBinding
import com.example.wavesoffood.databinding.FragmentSearchBinding

// TODO: Rename parameter arguments, choose names that match

class SearchFragment : Fragment() {
    private lateinit var binding:FragmentSearchBinding
    private lateinit var adapter:MenuAdapter
    private val originalMenuFoodName=listOf("Burger","Sandwich","Momo","Burger","Sandwich","Momo","Burger","Sandwich","Momo")
    private val originalMenuItemPrice= listOf("$5","$7","$10","$5","$7","$10","$5","$7","$10")
    private val originalMenuImage= listOf(
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
    // TODO: Rename and change types of parameters


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding=FragmentSearchBinding.inflate(inflater,container,false)
        adapter=MenuAdapter(originalMenuFoodName as MutableList<String>,
            originalMenuItemPrice as MutableList<String>, originalMenuImage as MutableList<Int>
        )
        binding.menuRecyclerView.layoutManager=LinearLayoutManager(requireContext())
        return binding.root
    }

    companion object {

    }
}