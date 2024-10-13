package com.mobdeve.s11.verano.carl.mobdevefakeadex

class PokemonModel(name: String, species: String, location: String, desc: String, imageId: Int) {
    var name = name
        private set
    var species = species
        private set
    var location = location
        private set
    var desc = desc
        private set
    var imageId = imageId
        private set

    override fun toString(): String {
        return "PokemonModel{" +
                "name='" + name + '\'' +
                ", species='" + species + '\'' +
                ", location='" + location + '\'' +
                ", desc='" + desc + '\'' +
                ", imageId=" + imageId +
                '}'
    }
}