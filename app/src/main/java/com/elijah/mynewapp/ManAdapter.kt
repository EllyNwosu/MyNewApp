package com.elijah.mynewapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class AnimalAdapter(val man: List<Man>, var clickListner: OnItemClickListner): RecyclerView.Adapter<ManAdapter.ManViewHolder>() {
    class ManViewHolder(var binding: ManBinding): RecyclerView.ViewHolder(binding.root){
        fun initialize(item: Man, action : OnItemClickListner){
            binding.txFirstname.text = item.firstname
            binding.txSurname.text = item.surname
            binding.viewPicture.setImageResource(item.picture)

            itemView.setOnClickListener {
                action.onItemClick(item, adapterPosition)
            }
        }
        fun bind(man: Man){
            binding.apply {
                txFirstname.text = man.firstname
                txSurname.text = man.surname
                viewPicture.setImageResource(man.picture)
//                root.setOnClickListener {
//                    var intent: Intent = Intent(this@AnimalViewHolder, PropertyActivity::class.java)
//
//                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ManViewHolder {
        val binding = ManBinding.inflate(LayoutInflater.from(parent.context))
        return ManViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ManViewHolder, position: Int) {
        val man = man[position]
        holder.bind(man)
        holder.initialize(man.get(position), clickListner)
    }

    override fun getItemCount(): Int {
        return man.size
    }
}

interface OnItemClickListner{
    fun onItemClick(item: Animal, position: Int)
}