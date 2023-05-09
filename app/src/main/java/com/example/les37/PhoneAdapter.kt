package com.example.les37

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.les37.databinding.ItemPhoneBinding

class PhoneAdapter(private val arrayList: ArrayList<Phone>, private val onClick: (Phone) -> Unit) : RecyclerView.Adapter<PhoneAdapter.PhoneViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhoneViewHolder {
        val binding = ItemPhoneBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PhoneViewHolder(binding, onClick)
    }

    override fun onBindViewHolder(holder: PhoneViewHolder, position: Int) {
        holder.bind(arrayList[position])
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    class PhoneViewHolder(private val binding: ItemPhoneBinding, private val onClick: (Phone) -> Unit) : RecyclerView.ViewHolder(binding.root) {

        fun bind(phone: Phone) {
            binding.textView.text = phone.name
            binding.root.setOnClickListener {
                onClick(phone)
            }
        }
    }
}
