package com.example.les37

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.les37.databinding.ItemPhoneBinding

class PhoneAdapter (private val arrayList: ArrayList <Phone>,
    val onClick:(Phone) -> Unit
    )
    : RecyclerView.Adapter <PhoneAdapter.PhoneViewHolder> () {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhoneViewHolder {
        return PhoneViewHolder(ItemPhoneBinding.inflate(LayoutInflater.from(parent.context)))
    }

    override fun onBindViewHolder(holder: PhoneViewHolder, position: Int) {
      holder.onBind(arrayList[position])
        holder.itemView.setOnClickListener{
            onClick(arrayList[position])

        }
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    inner class PhoneViewHolder(private val binding: ItemPhoneBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun onBind(phone: Phone) {
            binding.textView.text = phone.name
        }
    }
}