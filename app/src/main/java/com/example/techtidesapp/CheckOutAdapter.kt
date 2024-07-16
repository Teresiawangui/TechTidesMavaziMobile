package com.example.techtidesapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class CheckOutAdapter (var zara:List<Zaras> ):
RecyclerView.Adapter<CheckoutViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CheckoutViewHolder {
       val itemView = LayoutInflater.from(parent.context).inflate(R.layout.zara,parent,false)
        return CheckoutViewHolder(itemView)
    }
    override fun onBindViewHolder(holder: CheckoutViewHolder, position: Int) {
        val checkout = zara[position]
        holder.rvCargo.text = checkout.name
        holder.rvDescription.text = checkout.description
        holder.rvPrice.text = checkout.price
        holder.rvTotal.text = checkout.total
    }

    override fun getItemCount(): Int {
        return zara.size
    }
}

class CheckoutViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    var rvCargo = itemView.findViewById<TextView>(R.id.rvCargo)
    var rvDescription = itemView.findViewById<TextView>(R.id.rvDescription)
    var rvPrice = itemView.findViewById<TextView>(R.id.rvPrice)
    var rvTotal = itemView.findViewById<TextView>(R.id.rvTotal)
}