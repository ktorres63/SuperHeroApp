package com.tutorial.superheroapp

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.tutorial.superheroapp.databinding.ItemSuperheroBinding

class SuperheroViewHolder(view: View): RecyclerView.ViewHolder(view) {
    private val binding = ItemSuperheroBinding.bind(view)
    fun bind(superHeroesItemResponse: SuperHeroesItemResponse){
        binding.tvSuperheroName.text = superHeroesItemResponse.name

    }


}
