package com.example.wavesoffood

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.wavesoffood.databinding.ActivityChooseLocationBinding

class ChooseLocationActivity : AppCompatActivity() {
    private val binding:ActivityChooseLocationBinding by lazy{
        ActivityChooseLocationBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val locationList:Array<String> = arrayOf("Rajpur Road",
            "Paltan Bazaar",
            "Sahastradhara",
            "Robber's Cave",
            "Forest Research Institute",
            "Tapkeshwar Temple",
            "Malsi Deer Park",
            "Mindrolling Monastery",
            "Clock Tower",
            "Tibetan Market")
        val adapter= ArrayAdapter(this,android.R.layout.simple_list_item_1,locationList)
        val autoCompleteTextView: AutoCompleteTextView =binding.listOfLocation
        autoCompleteTextView.setAdapter(adapter)

    }
}