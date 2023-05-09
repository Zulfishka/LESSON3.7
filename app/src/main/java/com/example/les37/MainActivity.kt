package com.example.les37

import android.app.Activity
import android.graphics.drawable.BitmapDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.les37.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val arrayList = ArrayList<Phone>()

    lateinit var binding: ActivityMainBinding

    private lateinit var adapter: PhoneAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        arrayList.add(Phone("Samsung", 25000.00))
        arrayList.add(Phone("Samsung2", 30000.00))
        arrayList.add(Phone("Samsung3", 35000.00))
        arrayList.add(Phone("Samsung4", 40000.00))
        arrayList.add(Phone("Samsung5", 45000.00))

        adapter = PhoneAdapter(arrayList) {
            val fragment = FirstFragment()

            val bundle= Bundle()
            bundle.putString("name", it.name.toString())
            bundle.putString("price", it.price.toString())
            fragment.arguments = bundle
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, FirstFragment())
                .commit()
        }
        binding.recyclerView.adapter = adapter

    }





    }
