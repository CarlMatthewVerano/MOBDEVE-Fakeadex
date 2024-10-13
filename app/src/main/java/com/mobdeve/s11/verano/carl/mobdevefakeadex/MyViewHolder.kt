package com.mobdeve.s11.verano.carl.mobdevefakeadex

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class MyViewHolder(itemView: View): ViewHolder(itemView) {
    private val pokemonImage: ImageView = itemView.findViewById(R.id.pokemonIv)
    private val pokemonName: TextView = itemView.findViewById(R.id.pokemonNameTv)
    private val pokemonSpecies: TextView = itemView.findViewById(R.id.pokemonSpeciesTv)
    private val pokemonLocation: TextView = itemView.findViewById(R.id.pokemonLocationTv)
    private val pokemonDesc: TextView = itemView.findViewById(R.id.pokemonDescTv)

    fun bindData(pokemon: PokemonModel) {
        pokemonImage.setImageResource(pokemon.imageId)
        pokemonName.text = pokemon.name
        pokemonSpecies.text = pokemon.species
        pokemonLocation.text = pokemon.location
        pokemonDesc.text = pokemon.desc

    }
}