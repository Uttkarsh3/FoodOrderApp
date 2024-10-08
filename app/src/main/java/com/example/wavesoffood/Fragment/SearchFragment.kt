package com.example.wavesoffood.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.wavesoffood.R
import com.example.wavesoffood.adapter.MenuAdapter
import com.example.wavesoffood.databinding.FragmentCartBinding
import com.example.wavesoffood.databinding.FragmentSearchBinding


// TODO: Rename parameter arguments, choose names that match

class SearchFragment : Fragment() {
    private lateinit var binding:FragmentSearchBinding
    private lateinit var adapter:MenuAdapter
    private val originalMenuFoodName = listOf(
        "Burger", "Sandwich", "Momo", "Pizza", "Pasta", "Salad",
        "Taco", "Sushi", "Steak", "Fries", "Wrap", "Hot Dog",
        "Panini", "Dumplings", "Ice Cream"
    )

    private val originalMenuItemPrice = listOf(
        "$5", "$7", "$10", "$12", "$8", "$6",
        "$9", "$15", "$20", "$3", "$6", "$4",
        "$7", "$11", "$5"
    )
    private val originalMenuImage= listOf(
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
    // TODO: Rename and change types of parameters


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }


private val filteredMenuFoodName= mutableListOf<String>()
private val filteredMenuItemPrice=mutableListOf<String>()
private val filteredMenuImage=mutableListOf<Int>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding=FragmentSearchBinding.inflate(inflater,container,false)
        adapter=MenuAdapter(filteredMenuFoodName,filteredMenuItemPrice,filteredMenuImage,requireContext())
        binding.menuRecyclerView.layoutManager=LinearLayoutManager(requireContext())
        binding.menuRecyclerView.adapter=adapter

        // Setup for search view
        setupSearchView()

        //Show All Menu Items
        showAllMenu()
        return binding.root
    }
    private fun showAllMenu(){
        filteredMenuFoodName.clear()
        filteredMenuItemPrice.clear()
        filteredMenuImage.clear()
        filteredMenuFoodName.addAll(originalMenuFoodName)
        filteredMenuItemPrice.addAll(originalMenuItemPrice)
        filteredMenuImage.addAll(originalMenuImage)

        adapter.notifyDataSetChanged()
    }
    private fun setupSearchView() {
        binding.searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(query: String): Boolean {
                filterMenuItems(query)
                return true
            }

            override fun onQueryTextChange(newText: String): Boolean {
                filterMenuItems(newText)
                return true
            }
        })
    }

    private fun filterMenuItems(query: String) {
        filteredMenuFoodName.clear()
        filteredMenuItemPrice.clear()
        filteredMenuImage.clear()
        originalMenuFoodName.forEachIndexed { index, foodName ->
            if (foodName.contains(query, ignoreCase = true)) {
                filteredMenuFoodName.add(foodName)
                filteredMenuItemPrice.add(originalMenuItemPrice[index])
                filteredMenuImage.add(originalMenuImage[index])
            }
        }
        adapter.notifyDataSetChanged()
    }
    companion object {

    }
}