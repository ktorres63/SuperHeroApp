package com.tutorial.superheroapp

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import com.tutorial.superheroapp.databinding.ItemSuperheroBinding

class SuperheroViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val binding = ItemSuperheroBinding.bind(view)
    fun bind(superHeroesItemResponse: SuperHeroesItemResponse, onItemSelected: (String) -> Unit) {
        binding.tvSuperheroName.text = superHeroesItemResponse.name
        Picasso.get().load(superHeroesItemResponse.superHeroImage.url).into(binding.ivSuperHero)
        binding.root.setOnClickListener{ onItemSelected(superHeroesItemResponse.superheroId)

        }
    }


}
