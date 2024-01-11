package com.example.bottomrisentray.adapters

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.bottomrisentray.databinding.MenuItemBinding

//class MenuAdapter(private val itemNames : MutableList<String>,private val itemPrices : MutableList<String>,private val itemQuantity : MutableList<String>, private val requireContext : Context) : RecyclerView.Adapter<MenuAdapter.MenuViewHolder>() {
//    inner class MenuViewHolder(private val binding : MenuItemBinding) : RecyclerView.ViewHolder(binding.root) {
//        init{
//            binding.root.setOnClickListener(){
//                val position = adapterPosition
//                if(position != RecyclerView.NO_POSITION){
//
//                }
//            }
//        }
//
//
//
//        fun bind(position: Int) {
//            binding.apply {
//
//                foodNameTextView.text = menuItems[position].foodName
//                menuItemPriceTextView.text = menuItems[position].foodPrice
//
//                val uri = Uri.parse(menuItems[position].foodImageURL)
//                Glide.with(requireContext).load(uri).into(menuItemImage)
//            }
//        }
//    }
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuViewHolder {
//        val binding  = MenuItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
//        return MenuViewHolder(binding)
//    }
//
//    override fun getItemCount(): Int = menuItems.size
//
//    override fun onBindViewHolder(holder: MenuViewHolder, position: Int) {
//        holder.bind(position)
//    }
//    interface OnClickListener{
//        fun onItemClick(position: Int)
//    }

//}